/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio() {
    }

    public List<String> listarArchivos() {
        List<String> lista = null;
        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                File[] archivos = directorio.listFiles();
                for (File archivo1 : archivos) {
                    if (archivo1.isFile()) {
                        String archivo = archivo1.getName();
                        lista.add(archivo);
                    }
                }
            }
        }
        return lista;
    }

    public List<String> listarDirectorios() {
        List<String> lista = null;
        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                String d = directorio.getName();
                lista.add(d);
            }
        }
        return lista;
    }

    public List<String> listarArchivosOcultos() {
        List<String> lista = null;
        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                File[] archivos = directorio.listFiles();
                for (File archivo1 : archivos) {
                    if (archivo1.isFile()) {
                        if (archivo1.isHidden()) {
                            String nombre = archivo1.getName();
                            lista.add(nombre);
                        }
                    }
                }
            }
        }
        return lista;
    }

    public List<String> listarDirectoriosOcultos() {
        List<String> lista = null;
        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                if (directorio.isHidden()) {
                    String nombre=directorio.getName();
                    lista.add(nombre);
                }
            }
        }
        return lista;
    }

    public void crearDirectorio(String nombre) {
        archivo=new File(nombre);
        if(!archivo.exists()){
            archivo.mkdir();
        }
    }
    public void eliminarDirectorio(File archivoEliminar) {
       File[] archivosLista = archivoEliminar.listFiles();

                for (int i = 0; i < archivosLista.length; i++) {
                    if(archivosLista[i].isDirectory()){
                        eliminarDirectorio(archivosLista[i]);
                    }else{
                        archivosLista[i].delete();
                    }
                }
                archivoEliminar.delete();
    }

    public void renombrarDirectorio(String actual, String nuevo) {
        
        for (File archivo1 : archivos) {
            
            if(archivo1.getName().equals(actual)){
                archivo1.renameTo(new File(nuevo));
                break;
            }
        }
    }

    public String mostrarInformacion(File informacionDeArchivo) {
        File[] nombreDeArchivos=informacionDeArchivo.listFiles();
        
        
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
           System.out.println(fecha.format(informacionDeArchivo.lastModified()));
                
        return "";
    }
    
    public String tamañoDeDirectorio(File informacionDeArchivo){
        File[] nombreDeArchivos=informacionDeArchivo.listFiles();
        Double tamaño=0.00;
        for (int i = 0; i < nombreDeArchivos.length; i++) {
            if(nombreDeArchivos[i].isFile()){
                tamaño+=((nombreDeArchivos[i].length()/1024.0)/1024.0);
                System.out.println(tamaño);
            }else{
               tamañoDeDirectorio(nombreDeArchivos[i]); 
            }
        }
        return ""; 
    }
}
