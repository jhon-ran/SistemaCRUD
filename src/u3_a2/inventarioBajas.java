//Ventana de bajas de inventario
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

public class inventarioBajas extends javax.swing.JInternalFrame {
    
    //Instanciar la clase conexion//lamar a objeto conexion
    conexion cc = new conexion();
    //Variable de conexcion con método conexion
    Connection cn = cc.conect; //genera erro si se usa conexion();

   //Inicializar los componentes
    public inventarioBajas() {
        initComponents();
        //Llamada a método para mostrar trabla        
        mostrartabla();
           
    }

    
    //Método para mostrar contenido de tabla "inventario"
    void mostrartabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo_baja_inv = new javax.swing.JTextField();
        sucursal_baja_inv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_inventario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bajas de inventario");

        jLabel1.setText("Código");

        jLabel2.setText("Sucursal");

        codigo_baja_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_baja_invActionPerformed(evt);
            }
        });

        jButton1.setText("Borrar");
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

        jButton3.setText("Confirmar");
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
        jScrollPane1.setViewportView(tabla_inventario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton3)
                                .addGap(33, 33, 33)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(codigo_baja_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(sucursal_baja_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo_baja_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sucursal_baja_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigo_baja_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_baja_invActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_baja_invActionPerformed
    //Boton "salir" de "baja de inventarios"
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
        
//Boton para confirmar eliminación de registro
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    //Fila seleccionada
    int fila = tabla_inventario.getSelectedRow();
    String valor = tabla_inventario.getValueAt(fila, 0).toString();
    
    if (fila>=0){
        try {
            //Instruccion SQL para borrar registro
            PreparedStatement pps = cn.prepareStatement("DELETE FROM inventario WHERE codigo='"+valor+"'");
            //Actualizar BD
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            mostrartabla();
        } catch (SQLException ex) {
            Logger.getLogger(inventarioBajas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    }//GEN-LAST:event_jButton3ActionPerformed
    

//Boton para limpiar campos
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        codigo_baja_inv.setText("");
        sucursal_baja_inv.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    //Boton "borrar"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Fila seleccionada
        int fila = tabla_inventario.getSelectedRow();
        
        //Comparación para saber si es correcta esa fila y popula datos en formulario
        if (fila>=0){
            //buscar.setText(tabla_personal.getValueAt(fila, 0).toString());
            codigo_baja_inv.setText(tabla_inventario.getValueAt(fila, 0).toString());
            sucursal_baja_inv.setText(tabla_inventario.getValueAt(fila, 1).toString());

            
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecciona una fila y haz clic en modificar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo_baja_inv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sucursal_baja_inv;
    private javax.swing.JTable tabla_inventario;
    // End of variables declaration//GEN-END:variables
}
