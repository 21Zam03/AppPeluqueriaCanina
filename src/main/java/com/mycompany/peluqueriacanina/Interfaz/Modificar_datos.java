/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueriacanina.Interfaz;

import com.mycompany.peluqueriacanina.Logica.Controladora;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Modificar_datos extends javax.swing.JFrame {
    
    Controladora control = null;
    int num_cliente;
    Mascota mascota;
    
    public Modificar_datos(int num_cliente) {
        control = new Controladora();
        this.num_cliente = num_cliente;
        initComponents();
        cmbAlergico.addItem("-");
        cmbAlergico.addItem("SI");
        cmbAlergico.addItem("NO");
        cmbAtencionEspecial.addItem("-");
        cmbAtencionEspecial.addItem("SI");
        cmbAtencionEspecial.addItem("NO");
        cargarDatos(this.num_cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCelDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtDuenio = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\PeluqueriaCanina\\Imagenes\\Imagen1.jpg")); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 310, 230));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel2.setText("Nombre: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel3.setText("Raza: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel4.setText("Color: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel5.setText("Alergico: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel6.setText("Atencion Especial: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel7.setText("Nombre dueño: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel8.setText("Cel.Dueño: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel9.setText("Observaciones: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtCelDuenio.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jPanel2.add(txtCelDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 270, 140));

        txtDuenio.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jPanel2.add(txtDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, -1));

        txtColor.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, -1));

        txtRaza.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jPanel2.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, -1));

        txtNombre.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, -1));

        jPanel2.add(cmbAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 80, -1));

        cmbAtencionEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAtencionEspecialActionPerformed(evt);
            }
        });
        jPanel2.add(cmbAtencionEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 80, -1));

        btnLimpiar.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\PeluqueriaCanina\\Imagenes\\escoba.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 150, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, 560));

        btnGuardar.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\PeluqueriaCanina\\Imagenes\\guardar.png")); // NOI18N
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 160, 50));

        jButton1.setText("Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbAtencionEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAtencionEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAtencionEspecialActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Controladora control = new Controladora();
        
        String nombreMasco = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observaciones = txtObservaciones.getText();
        String alergico = String.valueOf(cmbAlergico.getSelectedItem());
        String atencionEspecial = String.valueOf(cmbAtencionEspecial.getSelectedItem());
        String nombreDuenio = txtDuenio.getText();
        String celDuenio = txtCelDuenio.getText();
        
        control.modificarMascota(mascota, nombreMasco, raza, color, observaciones, alergico, atencionEspecial, 
                nombreDuenio, celDuenio);
        
        this.mostrarMensaje("Los datos han sido modificados exitosamente!!", "Info", "Edicion correcta");
        Ver_datos ver_datos = new Ver_datos();
        ver_datos.setVisible(true);
        ver_datos.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        txtDuenio.setText("");
        txtCelDuenio.setText("");
        txtObservaciones.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("Confir")) {
            optionPane.setMessageType(JOptionPane.YES_NO_CANCEL_OPTION);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        this.mascota= control.traerMascota(num_cliente);
        txtNombre.setText(mascota.getNombre());
        txtRaza.setText(mascota.getRaza());
        txtColor.setText(mascota.getColor());
        
        if (mascota.getAlergico().equals("SI")) {
            cmbAlergico.setSelectedIndex(1);
        } else if (mascota.getAlergico().equals("NO")) {
            cmbAlergico.setSelectedIndex(2);
        } else {
            cmbAlergico.setSelectedIndex(0);
        }
        
        if (mascota.getAtencion_Especial().equals("SI")) {
            cmbAtencionEspecial.setSelectedIndex(1);
        } else if (mascota.getAtencion_Especial().equals("NO")) {
            cmbAtencionEspecial.setSelectedIndex(2);
        } else {
            cmbAtencionEspecial.setSelectedIndex(0);
        }
        
        txtDuenio.setText(mascota.getDuenio().getNombre());
        txtCelDuenio.setText(mascota.getDuenio().getCelDuenio());
        txtObservaciones.setText(mascota.getObervaciones());
    }
}
