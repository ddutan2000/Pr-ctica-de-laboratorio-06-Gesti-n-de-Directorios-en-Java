/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private GestionarDirectorios gestionarDirectorios;

    private ControladorDirectorio controladorDirectorio;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        //inizializar controlador 
        this.controladorDirectorio = new ControladorDirectorio();

        //vista
        gestionarDirectorios = new GestionarDirectorios(controladorDirectorio);

        desktopPane.add(gestionarDirectorios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        GestionarDirectorioVentana = new javax.swing.JMenuItem();
        itemTabCrear = new javax.swing.JMenuItem();
        itemTabEliminar = new javax.swing.JMenuItem();
        ItemTabRenombrar = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setLayout(null);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        GestionarDirectorioVentana.setMnemonic('o');
        GestionarDirectorioVentana.setText("GESTIONAR DIRECTORIO");
        GestionarDirectorioVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarDirectorioVentanaActionPerformed(evt);
            }
        });
        fileMenu.add(GestionarDirectorioVentana);

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
        exitMenuItem.setText("SALIR");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void itemTabCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTabCrearActionPerformed

        String dato = JOptionPane.showInputDialog("Ingrese la ruta que desea crear");

        
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        } else {
            if (dato.contains(".")) {
                try {
                    File archivo1 = new File(dato);
                    archivo1.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
                    controladorDirectorio.crearDirectorio(dato);
                }
                

        }


    }//GEN-LAST:event_itemTabCrearActionPerformed

    private void ItemTabRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTabRenombrarActionPerformed
        String dato = JOptionPane.showInputDialog("Ingrese la ruta que desea renombrar");
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        } else {
            String dato1 = JOptionPane.showInputDialog("Ingrese la nueva ruta");
            if (dato1.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Vacio");
            } else {
                controladorDirectorio.renombrarDirectorio(dato, dato1);
            }

        }

    }//GEN-LAST:event_ItemTabRenombrarActionPerformed

    private void GestionarDirectorioVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarDirectorioVentanaActionPerformed
        gestionarDirectorios.setVisible(true);
    }//GEN-LAST:event_GestionarDirectorioVentanaActionPerformed

    private void itemTabEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTabEliminarActionPerformed

        String dato = JOptionPane.showInputDialog("Ingrese la ruta que desea Eliminar");
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Vacio");
        } else {
            controladorDirectorio.eliminarDirectorio(dato);

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GestionarDirectorioVentana;
    private javax.swing.JMenuItem ItemTabRenombrar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemTabCrear;
    private javax.swing.JMenuItem itemTabEliminar;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
