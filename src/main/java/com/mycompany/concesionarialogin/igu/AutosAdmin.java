
package com.mycompany.concesionarialogin.igu;

import com.mycompany.concesionarialogin.logica.Auto;
import com.mycompany.concesionarialogin.logica.Controladora;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AutosAdmin extends javax.swing.JFrame {
    Controladora control = null;
    
    public AutosAdmin() {
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        btnEditarAuto = new javax.swing.JButton();
        btnEliminarAuto = new javax.swing.JButton();
        btnAgregarAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Autos G&J");

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-izquierda (1).png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(352, 352, 352))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditarAuto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditarAuto.setText("Modificar Auto");
        btnEditarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutoActionPerformed(evt);
            }
        });

        btnEliminarAuto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminarAuto.setText("Eliminar Auto");
        btnEliminarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutoActionPerformed(evt);
            }
        });

        btnAgregarAuto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAgregarAuto.setText("Agregar Auto");
        btnAgregarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregarAuto)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAuto)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarAuto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PantallaAdmin pantalladmin = new PantallaAdmin();
        pantalladmin.setVisible(true);
        pantalladmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutoActionPerformed
        AgregarAuto agregarauto = new AgregarAuto();
        
        agregarauto.setVisible(true);
        agregarauto.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgregarAutoActionPerformed

    private void btnEliminarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutoActionPerformed
        if(tablaAutos.getRowCount() > 0){
            if(tablaAutos.getSelectedRow() != -1){
                int id = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
                control.eliminarAuto(id);
                JOptionPane.showMessageDialog(this, "Se elimino correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                cargarTabla();
                
            }else{
                JOptionPane.showMessageDialog(this, "No selecciono ningun auto", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay autos disponibles", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarAutoActionPerformed

    private void btnEditarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutoActionPerformed
        if(tablaAutos.getRowCount() > 0){
            if(tablaAutos.getSelectedRow() != -1){
                //aca se modifica
                int idAuto = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
                EditarAuto modifAuto = new EditarAuto(idAuto);  //paso el ID a la nueva IGU con el id
                modifAuto.setVisible(true);
                modifAuto.setLocationRelativeTo(null);
                //cerrar esta ventana:
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No se selecciono ningun auto!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay Autos disponibles!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnEditarAutoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAuto;
    private javax.swing.JButton btnEditarAuto;
    private javax.swing.JButton btnEliminarAuto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //titulo a las columnas
        String titulos[] = {"Id","Marca","Modelo","Año","Patente"};
        
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer autos de la base de datos.
        List <Auto> listaAutomoviles = control.traerAutos();
        
        //setear datos en la tabla 
        if(listaAutomoviles != null){
            for(Auto auto : listaAutomoviles){
                Object[] objeto = {auto.getId(),auto.getMarca(), auto.getModelo() , auto.getAnio() , auto.getPatente()};
                                       
                modeloTabla.addRow(objeto);
            }
        }
        //seteamos el modelo de la tabla a la TABLA REAL
        tablaAutos.setModel(modeloTabla);
    }
}
