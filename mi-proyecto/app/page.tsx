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

  const handleCrearArchivo = () => {
    setEntrada('');  // Limpiar el editor
    setSalida('');   // Limpiar la consola
  };

  const handleOpenFile = (event: React.ChangeEvent<HTMLInputElement>) => {
    const file = event.target.files?.[0]; // Asegurar que hay un archivo seleccionado
    if (!file) return;
  
    const reader = new FileReader();
    reader.onload = (e) => {
      setEntrada(e.target?.result as string); // Convertir resultado a string
    };
    reader.readAsText(file);
  };



  return (
    <div className="flex flex-col  justify-center min-h-screen w-3/4 mx-auto gap-4">
      <h1 className="text-8xl font-bold"><center>GoLight</center></h1>

 
      <div className="flex gap-4">
        <button className="px-4 py-2 bg-blue-500 text-white rounded-lg font-bold text-2xl" onClick={handleCrearArchivo}> Crear Archivo </button>
        <label className="px-4 py-2 bg-blue-500 text-white rounded-lg font-bold text-2xl cursor-pointer">
        <center>Abrir Archivo</center>
        <input type="file" accept=".txt,.go" className="hidden" onChange={handleOpenFile} />
      </label>
        <button className="px-4 py-2 bg-blue-500 text-white rounded-lg font-bold text-2xl" > Guardar Archivo </button>
        <button className="px-4 py-2 bg-green-500 text-white rounded-lg font-bold text-2xl ml-175" onClick={handleExecute}> Ejecutar </button>
        <button className="px-4 py-2 bg-purple-500 text-white rounded-lg font-bold text-2xl ml-85"> Reporte AST </button>
        <button className="px-4 py-2 bg-yellow-500 text-white rounded-lg font-bold text-2xl"> Reporte Errores </button>
        <button className="px-4 py-2 bg-blue-500 text-white rounded-lg font-bold text-2xl"> Tabla de Errores </button>
        
      </div>
      
      <div className="flex gap-6 w-full h-[75vh]">
      <div className="w-[60%] h-full border rounded-lg">
          <Editor 
          height="75vh" 
          //width="100vh"
          defaultLanguage="go" 
          className="w-full" 
          options={{ fontSize: 20 }}  
          value={entrada} 
          onChange={(value) => setEntrada(value || '')}
          />
          </div>
          <div className="w-[40%] h-full border rounded-lg p-4 bg-gray-100 overflow-auto">
          <h2 className="text-lg font-bold">Consola:</h2>
          <pre className="whitespace-pre-wrap text-3xl">{salida || "No output yet"}</pre>
          </div>
          
        </div>
    </div>

  

  );
}
