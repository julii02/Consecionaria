
package com.mycompany.concesionarialogin.igu;

import com.mycompany.concesionarialogin.logica.Auto;
import com.mycompany.concesionarialogin.logica.Controladora;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Principal extends javax.swing.JFrame {
    Controladora control = null;
    public Principal() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Concesionaria G&J");

        btnLog.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLog.setText("Log in");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156)
                .addComponent(btnLog)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLog)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19))))
        );

        tablaAutos.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true)));
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

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por Marca");

        txtMarca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escoba.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar))
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        btnConsulta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images-removebg-preview (1).png"))); // NOI18N
        btnConsulta.setText("Consulta por WhatsApp");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(btnConsulta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cagarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if (tablaAutos.getRowCount() > 0) {
        if (tablaAutos.getSelectedRow() != -1) {
            String marca = String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0));
            String modelo = String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 1));

            String numeroWhatsApp = "+5491123836055";
            String mensaje = "Hola, estoy interesado en el auto de marca " + marca + " y modelo " + modelo + ".";
            String url = "";

            try {
                url = "https://wa.me/" + numeroWhatsApp + "?text=" + java.net.URLEncoder.encode(mensaje, "UTF-8");
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            } catch (Exception e) {
                e.printStackTrace();
                }
            }else{
            JOptionPane.showMessageDialog(this, "No selecciono ningun auto", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } 
        }else{
            JOptionPane.showMessageDialog(this, "No hay autos disponibles para consultar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        
        this.dispose();
        
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtMarca.setText("");
        
        cargarTabla("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        String marca = txtMarca.getText();
        
        cargarTabla(marca);
    }//GEN-LAST:event_btnBuscar1ActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables

    private void cagarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //titulo a las columnas
        String titulos[] = {"Marca","Modelo","Año","Patente"};
        
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer autos de la base de datos.
        List <Auto> listaAutomoviles = control.traerAutos();
        
        //setear datos en la tabla 
        if(listaAutomoviles != null){
            for(Auto auto : listaAutomoviles){
                Object[] objeto = {auto.getMarca(), auto.getModelo() , auto.getAnio() , auto.getPatente()};
                                       
                modeloTabla.addRow(objeto);
            }
        }
        //seteamos el modelo de la tabla a la TABLA REAL
        tablaAutos.setModel(modeloTabla);
    }

    private void cargarTabla(String marca) {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //titulo a las columnas
        String titulos[] = {"Marca","Modelo","Año","Patente"};
        
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer autos de la base de datos.
        List <Auto> listaAutomoviles = control.traerAutos();
        
        //setear datos en la tabla 
        if(!marca.equals("")){
            
            if(listaAutomoviles != null){
                for(Auto auto : listaAutomoviles){
                    if(auto.getMarca().equalsIgnoreCase(marca)){
                        Object[] objeto = {auto.getMarca(), auto.getModelo() , auto.getAnio() , auto.getPatente()};                   
                        modeloTabla.addRow(objeto);
                    }

                }
            }
        }else if(marca.equals("")){
            if(listaAutomoviles != null){
                for(Auto auto : listaAutomoviles){
                        Object[] objeto = {auto.getMarca(), auto.getModelo() , auto.getAnio() , auto.getPatente()};                   
                        modeloTabla.addRow(objeto);
                    }
            }
        }
        //seteamos el modelo de la tabla a la TABLA REAL
        tablaAutos.setModel(modeloTabla);
    }
}
