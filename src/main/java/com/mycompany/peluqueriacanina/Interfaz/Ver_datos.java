/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peluqueriacanina.Interfaz;

import com.mycompany.peluqueriacanina.Logica.Controladora;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ver_datos extends javax.swing.JFrame {
    
    Controladora control = null;
    
    public Ver_datos() {
        this.control = new Controladora();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setText("Visualizacion de datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        jLabel2.setText("Datos de mascotas: ");

        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 710, 450));

        jButton1.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jButton1.setText("Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Controlo que la tabla no este vacia
        if (tblTabla.getRowCount() > 0) {
            //Controlo que halla una fila seleccionada
            if (tblTabla.getSelectedRow() != -1) {
                //Obtengo el id de la mascota
                mostrarMensaje("","Confir","Eliminar mascota");
                int num_cliente = Integer.parseInt(String.valueOf(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0)));
                //Elimino la mascota de la base de datos
                control.eliminarMascota(num_cliente);
                //Aviso al usuario que se elimino correctamente
                mostrarMensaje("Mascota eliminado satisfactoriamente", "Info", "Proceso exitoso");
                cargarTabla();
            } else {
                mostrarMensaje("No ha seleccionado una mascota", "Error", "Mascota no seleccionada");
            }
        } else {
            mostrarMensaje("La tabla esta vacia!!", "Eror", "Tabla sin registros!!");
        } 
    }//GEN-LAST:event_btnEliminarActionPerformed
    
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
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (tblTabla.getRowCount() > 0) {
            //Controlo que halla una fila seleccionada
            if (tblTabla.getSelectedRow() != -1) {
                //Obtengo el id de la mascota               
                int num_cliente = Integer.parseInt(String.valueOf(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0)));
                Modificar_datos modificar_datos = new Modificar_datos(num_cliente);
                modificar_datos.setVisible(true);
                modificar_datos.setLocationRelativeTo(null);
                dispose();
            } else {
                mostrarMensaje("No ha seleccionado una mascota", "Error", "Mascota no seleccionada");
            }
        } else {
            mostrarMensaje("La tabla esta vacia!!", "Eror", "Tabla sin registros!!");
        } 
        
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir modelo de la tabla
        DefaultTableModel tabla = new DefaultTableModel() {
            //Filas y columnas no seas editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }; 
        //Establecer los nombres de las columnas
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At.Especial", "Dueño", "Cel.Deunio"};
        tabla.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la base de datos 
        List<Mascota> listaMascotas =  control.traerMascotas();
        
        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMascotas != null) {
            for (int i=0; i<listaMascotas.size(); i++) {
                Object[] objeto = {listaMascotas.get(i).getNum_Cliente(), listaMascotas.get(i).getNombre(), 
                listaMascotas.get(i).getColor(), listaMascotas.get(i).getRaza(), listaMascotas.get(i).getAlergico(), 
                listaMascotas.get(i).getAtencion_Especial(), listaMascotas.get(i).getDuenio().getNombre(), 
                listaMascotas.get(i).getDuenio().getCelDuenio()};
                //Añadimos el objeto a la una fila de la tabla
                tabla.addRow(objeto);
            }
            tblTabla.setModel(tabla);
        }
    }
}
