/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;

/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        File directorio = new File("/Users/Practica/Hola");
        if (!directorio.exists()) {
            directorio.mkdir();
        }
        ControladorDirectorio controladorDirectorio = new ControladorDirectorio();
        //controladorDirectorio.mostrarInformacion(new File("/Users/Practica/Hola"));
        controladorDirectorio.tamañoDeDirectorio(new File("/Users/Practica/Hola"));
    }
}
