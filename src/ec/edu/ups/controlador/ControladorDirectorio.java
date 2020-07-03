/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio(String ruta) {
        this.ruta = ruta;

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

    public void eliminarDirectorio(String nombre) {
        
        for (File archivo1 : archivos) {
            if(archivo1.getName().equals(nombre)){
                File[] archivos=archivo1.listFiles();
                for (int i = 0; i < archivos.length; i++) {
                    archivos[i].delete();
                }
                archivo1.delete();
                break;
            }
        }
    }

    public void renombrarDirectorio(String actual, String nuevo) {
        for (File archivo1 : archivos) {
            if(archivo1.getName().equals(actual)){
                archivo1.renameTo(new File(nuevo));
                break;
            }
        }
    }

    public String mostrarInformacion(String nombre) {
        
    }
}
