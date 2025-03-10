'use client';
import { Editor } from "@monaco-editor/react";
import { useState } from "react";



const API_URL = 'http://localhost:5026';

export default function Home() {

  const [entrada, setEntrada] = useState<string>('');
  const [salida, setSalida] = useState<string>('');


  const handleExecute = () => {
    fetch(`${API_URL}/compile`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ entrada }),
    })
      .then((response) => response.json())
      .then((data) => {
        setSalida(data.result);
      })
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  return (
    <div className="flex flex-col items-center justify-center min-h-screen w-1/2 mx-auto gap-4">
  <h1 className="text-8xl font-bold">GoLight</h1>

  {/* Contenedor de los botones */}
  <div className="flex gap-4">
    <button className="px-4 py-2 bg-blue-500 text-white rounded-lg"> Crear Archivo </button>
    <button className="px-4 py-2 bg-blue-500 text-white rounded-lg"> Abrir Archivo </button>
    <button className="px-4 py-2 bg-blue-500 text-white rounded-lg"> Guardar Archivo </button>
    <button className="px-4 py-2 bg-green-500 text-white rounded-lg" onClick={handleExecute}> Ejecutar </button>
    
  </div>
    <div></div>
  <Editor height="50vh" defaultLanguage="go" className="w-full" value={entrada} onChange={(value) => setEntrada(value || '')}/>
  {salida && (
        <div className='flex flex-col items-center justify-center'>
          <h2>Output:</h2>
          <pre>{salida}</pre>
        </div>
      )}
</div>


  

  );
}
