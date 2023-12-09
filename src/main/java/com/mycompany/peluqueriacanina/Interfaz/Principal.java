/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueriacanina.Interfaz;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cargar = new javax.swing.JButton();
        Ver = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        jLabel1.setText("Peluqueria Canina");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Cargar.setText("Cargar datos");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        jPanel2.add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        Ver.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Ver.setText("Ver datos");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });
        jPanel2.add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 310, 50));

        Salir.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Salir.setText("Salir");
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 310, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\PeluqueriaCanina\\Imagenes\\Imagen1.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 320, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        Cargar_datos cargar_datos = new Cargar_datos();
        cargar_datos.setVisible(true);
        dispose();
    }//GEN-LAST:event_CargarActionPerformed

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        Ver_datos ver_datos = new Ver_datos();
        ver_datos.setVisible(true);
        ver_datos.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_VerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
