/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class GestionarDirectorio extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;

    /**
     * Creates new form GestionarDirectorio
     */
    public GestionarDirectorio() {
        initComponents();
        this.controladorDirectorio = new ControladorDirectorio();
    }

    public void listar(List<String> listaDeArchivos) {
        int aux = 0;
        String vector[] = new String[listaDeArchivos.size()];
        for (String archivo : listaDeArchivos) {
            vector[aux] = archivo;
            aux = aux + 1;
        }
        listaDeDatos.setListData(vector);

    }
    //eliminar metodo

    /*String dato = JOptionPane.showInputDialog("Ingrese la ruta que desea Eliminar");
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        } else {
            controladorDirectorio.eliminarDirectorio(dato);

        }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMostrarInformacion = new javax.swing.JButton();
        botonListarA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtRuta = new javax.swing.JTextField();
        botonListarD = new javax.swing.JButton();
        botonListarArchivosOcultos = new javax.swing.JButton();
        botonListarDirectorios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeDatos = new javax.swing.JList<>();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemTabCrear = new javax.swing.JMenuItem();
        itemTabEliminar = new javax.swing.JMenuItem();
        ItemTabRenombrar = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonMostrarInformacion.setText("Mostrar Informacion");
        botonMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarInformacionActionPerformed(evt);
            }
        });

        botonListarA.setText("Listar Archivos");
        botonListarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarAActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(204, 204, 204));
        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setText("INFORMACION:\n\n");
        jScrollPane2.setViewportView(txtArea);

        txtRuta.setText("/Users/Practica");

        botonListarD.setText("Listar Directorios");
        botonListarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarDActionPerformed(evt);
            }
        });

        botonListarArchivosOcultos.setText("Listar Archivos Ocultos");
        botonListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarArchivosOcultosActionPerformed(evt);
            }
        });

        botonListarDirectorios.setText("Listar Directorios Ocultos");
        botonListarDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarDirectoriosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaDeDatos);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        itemTabCrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itemTabCrear.setMnemonic('s');
        itemTabCrear.setText("CREAR");
        itemTabCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTabCrearActionPerformed(evt);
            }
        });
        fileMenu.add(itemTabCrear);

        itemTabEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemTabEliminar.setMnemonic('a');
        itemTabEliminar.setText("ELIMINAR");
        itemTabEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTabEliminarActionPerformed(evt);
            }
        });
        fileMenu.add(itemTabEliminar);

        ItemTabRenombrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        ItemTabRenombrar.setMnemonic('a');
        ItemTabRenombrar.setText("RENOMBRAR");
        ItemTabRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTabRenombrarActionPerformed(evt);
            }
        });
        fileMenu.add(ItemTabRenombrar);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonListarA, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonListarD, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonListarArchivosOcultos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonListarDirectorios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(botonMostrarInformacion)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListarD)
                    .addComponent(botonListarArchivosOcultos)
                    .addComponent(botonListarDirectorios)
                    .addComponent(botonListarA))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(botonMostrarInformacion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void botonMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarInformacionActionPerformed
        String archivo = txtRuta.getText() + "/" + listaDeDatos.getSelectedValue();
        File ruta = new File(archivo);
        String informacion = controladorDirectorio.mostrarInformacion(ruta);
        String lectura = "";
        String escritura = "";
        if (ruta.canRead()) {
            lectura = "Verdadero";
        } else {
            lectura = "Falso";
        }
        if (ruta.canWrite()) {
            escritura = "Verdadero";
        } else {
            escritura = "Falso";
        }
        DecimalFormat formato = new DecimalFormat("#0.000");
        String tamaño = formato.format(controladorDirectorio.tamañoDeDirectorio(ruta));

        txtArea.setText(archivo + "\nTamaño de Archivo: " + tamaño + "\nAcceso de Lectura: " + lectura + "\nAcceso de escritura: " + escritura + "\nUltima fecha modificada: " + informacion);
    }//GEN-LAST:event_botonMostrarInformacionActionPerformed

    private void botonListarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarAActionPerformed
        String ruta = txtRuta.getText();
        File archivo = new File(ruta);
        listar(controladorDirectorio.listarArchivos(archivo));
    }//GEN-LAST:event_botonListarAActionPerformed

    private void botonListarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarDActionPerformed
        String ruta = txtRuta.getText();
        File directorio = new File(ruta);
        listar(controladorDirectorio.listarDirectorios(directorio));
    }//GEN-LAST:event_botonListarDActionPerformed

    private void botonListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarArchivosOcultosActionPerformed
        String ruta = txtRuta.getText();
        File archivoOculto = new File(ruta);
        listar(controladorDirectorio.listarArchivosOcultos(archivoOculto));
    }//GEN-LAST:event_botonListarArchivosOcultosActionPerformed

    private void botonListarDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarDirectoriosActionPerformed
        String ruta = txtRuta.getText();
        File directorioOculto = new File(ruta);
        listar(controladorDirectorio.listarArchivosOcultos(directorioOculto));
    }//GEN-LAST:event_botonListarDirectoriosActionPerformed

    private void itemTabCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTabCrearActionPerformed

        String dato = JOptionPane.showInputDialog("Ingrese nombre para el nuevo documento");
        
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        } else {
            if (dato.contains(".")) {
                try {
                    File archivo1 = new File(txtRuta.getText()+"/"+dato);
                    archivo1.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(GestionarDirectorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                controladorDirectorio.crearDirectorio(txtRuta.getText()+"/"+dato);
            }

        }

    }//GEN-LAST:event_itemTabCrearActionPerformed

    private void ItemTabRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTabRenombrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "desea renombrar este archivo", "Confirmacion", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            String dato = JOptionPane.showInputDialog("Ingrese nuevo nombre");
            if (dato.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Vacio");
            } else {
                String nombreActual=txtRuta.getText()+"/"+listaDeDatos.getSelectedValue();
                String nuevoNombre=txtRuta.getText()+"/"+dato;
                controladorDirectorio.renombrarDirectorio(nombreActual, nuevoNombre);
            }
        }
    }//GEN-LAST:event_ItemTabRenombrarActionPerformed

    private void itemTabEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTabEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "desea eliminar este archivo", "Confirmacion", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            String ruta = txtRuta.getText() + "/" + listaDeDatos.getSelectedValue();
            controladorDirectorio.eliminarDirectorio(ruta);
        }


    }//GEN-LAST:event_itemTabEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionarDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarDirectorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarDirectorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemTabRenombrar;
    private javax.swing.JButton botonListarA;
    private javax.swing.JButton botonListarArchivosOcultos;
    private javax.swing.JButton botonListarD;
    private javax.swing.JButton botonListarDirectorios;
    private javax.swing.JButton botonMostrarInformacion;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemTabCrear;
    private javax.swing.JMenuItem itemTabEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaDeDatos;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

}
