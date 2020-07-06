/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    public List<String> listarArchivos(File buscarArchivos) {
        List<String> lista = new ArrayList<>();
        archivo = buscarArchivos;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {
            if (!directorio.isDirectory()) {
                if(!directorio.isHidden()){
                  lista.add(directorio.getName());  
                }   
            }
        }

        return lista;

    }

    public List<String> listarDirectorios(File buscarDirectorio) {
        List<String> lista = new ArrayList<>();
        archivo = buscarDirectorio;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                if(!directorio.isHidden()){
                 lista.add(directorio.getName());   
                } 
            }
        }
        return lista;
    }

    public List<String> listarArchivosOcultos(File buscarArchivosOcultos) {
        List<String> lista = new ArrayList<>();
        archivo = buscarArchivosOcultos;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {
            if (!directorio.isDirectory()) {
                if (directorio.isHidden()) {
                    lista.add(directorio.getName());
                }
            }
        }
        return lista;
    }

    public List<String> listarDirectoriosOcultos(File BuscarDirectorioOculto) {
        List<String> lista = new ArrayList<>();
        archivo = BuscarDirectorioOculto;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {
            if (directorio.isDirectory()) {
                if (directorio.isHidden()) {
                    lista.add(directorio.getName());
                }
            }
        }
        return lista;
    }

    public void crearDirectorio(String ruta) {
        archivo = new File(ruta);
        if (!archivo.exists()) {
            archivo.mkdir();
        }
    } 

    public void eliminarDirectorio(String EliminarArchivo) {
        archivo = new File(EliminarArchivo);
        File[] archivosLista = archivo.listFiles();
        if(archivo.isDirectory()){
        for (int i = 0; i < archivosLista.length; i++) {
            if (archivosLista[i].isDirectory()) {
                eliminarDirectorio(archivosLista[i].toString());
            } else {
                archivosLista[i].delete();
            }
        }
        }
        archivo.delete();
    }

    public void renombrarDirectorio(String actual, String nuevo) {
        archivo = new File(actual);
        if (archivo.exists()) {
            archivo.renameTo(new File(nuevo));
        }
    }

    public String mostrarInformacion(File informacionDeArchivos) {

        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String datos = fecha.format(informacionDeArchivos.lastModified());

        return datos;
    }

    public Double tamañoDeDirectorio(File informacionDeArchivo) {
        File[] nombreDeArchivos = informacionDeArchivo.listFiles();
        Double tamaño = 0.00;
        if (informacionDeArchivo.isDirectory()) {
            for (int i = 0; i < nombreDeArchivos.length; i++) {
                if (nombreDeArchivos[i].isFile()) {
                    tamaño += ((nombreDeArchivos[i].length() / 1024.0) / 1024.0);
                } else {
                    tamaño += tamañoDeDirectorio(nombreDeArchivos[i]);
                }
            }
        }else{
            tamaño=((informacionDeArchivo.length()/ 1024.0) / 1024.0);
        }

        return tamaño;
    }
}
