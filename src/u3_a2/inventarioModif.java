//Ventana de modificación de inventarios
package u3_a2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class inventarioModif extends javax.swing.JInternalFrame {

    //Instanciar la clase conexion//lamar a objeto conexion
    conexion cc = new conexion();
    //Variable de conexcion con método conexion
    Connection cn = cc.conect; //genera erro si se usa conexion();
 
    public inventarioModif() throws SQLException {
        initComponents();
        
        //Llamada a método para mostrar trabla 
        mostrartabla();
    }
    
    //Método para mostrar contenido de tabla "inventario"
    void mostrartabla() throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Códido");
        modelo.addColumn("Artículo");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Existencia");
        modelo.addColumn("Marca");
        // Se le añaden las columnas a la tabla
        tabla_inventario.setModel(modelo);
        
        //Seleccionar todos los datos de la tabla "inventario
        String sql = "SELECT * FROM inventario";
        
        //Arreglo para guardar los datos de la tabla (5 campos)
        String datos[] = new String[5];
        
              
        try {
            // Variable statement que contiene conector
            Statement st = cn.createStatement();
            //Variable result state
            ResultSet rs = st.executeQuery(sql);
            // Loop para llenar el arreglo conforme se avanza
            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            
            tabla_inventario.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(inventarioModif.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigo_mod_inv = new javax.swing.JTextField();
        articulo_mod_inv = new javax.swing.JTextField();
        existencia_mod_inv = new javax.swing.JTextField();
        sucursal_mod_inv = new javax.swing.JTextField();
        marca_mod_inv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_inventario = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar inventarios");

        jLabel1.setText("Código");

        jLabel2.setText("Artículo");

        jLabel3.setText("Sucursal");

        jLabel4.setText("Existencia");

        jLabel5.setText("Marca");

        codigo_mod_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_mod_invActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabla_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla_inventario);

        jLabel6.setText("Código de artículo seleccionado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sucursal_mod_inv, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(marca_mod_inv)
                                .addComponent(codigo_mod_inv))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26)
                                    .addComponent(articulo_mod_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(existencia_mod_inv))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGap(33, 33, 33)
                            .addComponent(jButton1)
                            .addGap(26, 26, 26)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(codigo_mod_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo_mod_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(existencia_mod_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucursal_mod_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(marca_mod_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Evento que permite abrir ventana al hacer clic en menú principal
    private void codigo_mod_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_mod_invActionPerformed
        
    }//GEN-LAST:event_codigo_mod_invActionPerformed
    //Boton "salir" de ventana "modificacion de invetarios"
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    //Boton para limpiar campos
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        codigo_mod_inv.setText("");
        articulo_mod_inv.setText("");
        sucursal_mod_inv.setText("");
        existencia_mod_inv.setText("");
        marca_mod_inv.setText("");
        buscar.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed
        //Boton para modificar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //Fila seleccionada
        int fila = tabla_inventario.getSelectedRow();
        
        //Comparación para saber si es correcta esa fila
        if (fila>=0){
            buscar.setText(tabla_inventario.getValueAt(fila, 0).toString());
            codigo_mod_inv.setText(tabla_inventario.getValueAt(fila, 0).toString());
            articulo_mod_inv.setText(tabla_inventario.getValueAt(fila, 1).toString());
            sucursal_mod_inv.setText(tabla_inventario.getValueAt(fila, 2).toString());
            existencia_mod_inv.setText(tabla_inventario.getValueAt(fila, 3).toString());
            marca_mod_inv.setText(tabla_inventario.getValueAt(fila, 4).toString());
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No seleccionaste una fila");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //Boton "actualizar" inventario
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //Sentencia en SQL para modificar cada campo de la tabla "inventario" 
            PreparedStatement pps = cn.prepareStatement("UPDATE inventario SET codigo='"+codigo_mod_inv.getText()
                    +"',articulo='"+articulo_mod_inv.getText()
                    +"',sucursal='"+sucursal_mod_inv.getText()
                    +"',existencia='"+existencia_mod_inv.getText()
                    +"',existencia='"+existencia_mod_inv.getText()
                    +"' WHERE codigo='"+buscar.getText()+"'");
            
            
            //Actualizar registro en tabla
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro ha sido actualizado con éxito");
            
            //Llamar mostrar tabla
            mostrartabla();
        } catch (SQLException ex) {
            Logger.getLogger(inventarioModif.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField articulo_mod_inv;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField codigo_mod_inv;
    private javax.swing.JTextField existencia_mod_inv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marca_mod_inv;
    private javax.swing.JTextField sucursal_mod_inv;
    private javax.swing.JTable tabla_inventario;
    // End of variables declaration//GEN-END:variables
}
