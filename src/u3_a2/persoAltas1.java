//Ventana alta de personal
package u3_a2;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class persoAltas1 extends javax.swing.JInternalFrame {
    //Instanciar la clase conexion//lamar a objeto conexion
    conexion cc = new conexion();
    //Variable de conexcion con método conexion
    Connection cn = cc.conect; //genera erro si se usa conexion();
    

     // inicializador de componentes
    public persoAltas1() {
        initComponents();
        
        //Bloquear botones al inicio
        matri_alt_pers.setEnabled(false);
        nom_alt_pers.setEnabled(false);
        apell_alt_pers.setEnabled(false);
        edad_alt_pers.setEnabled(false);
        puesto_alt_pers.setEnabled(false);
        area_alt_pers.setEnabled(false);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        matri_alt_pers = new javax.swing.JTextField();
        nom_alt_pers = new javax.swing.JTextField();
        apell_alt_pers = new javax.swing.JTextField();
        edad_alt_pers = new javax.swing.JTextField();
        puesto_alt_pers = new javax.swing.JTextField();
        area_alt_pers = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Altas de personal");

        jLabel1.setText("Matrícula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Edad");

        jLabel5.setText("Puesto");

        jLabel6.setText("Area");

        matri_alt_pers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matri_alt_persActionPerformed(evt);
            }
        });

        area_alt_pers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_alt_persActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nom_alt_pers, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(apell_alt_pers)
                    .addComponent(matri_alt_pers)
                    .addComponent(area_alt_pers, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(puesto_alt_pers)
                    .addComponent(edad_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(matri_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(apell_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(puesto_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(area_alt_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matri_alt_persActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matri_alt_persActionPerformed
        
    }//GEN-LAST:event_matri_alt_persActionPerformed

    private void area_alt_persActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_alt_persActionPerformed
        
    }//GEN-LAST:event_area_alt_persActionPerformed
    
    //Limpiar campos
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        matri_alt_pers.setText("");
        nom_alt_pers.setText("");
        apell_alt_pers.setText("");
        edad_alt_pers.setText("");
        puesto_alt_pers.setText("");
        area_alt_pers.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
    //Boton para desbloquear y poder editar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        matri_alt_pers.setEnabled(true);
        nom_alt_pers.setEnabled(true);
        apell_alt_pers.setEnabled(true);
        edad_alt_pers.setEnabled(true);
        puesto_alt_pers.setEnabled(true);
        area_alt_pers.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Boton "salir" de ventana "alta de personal"
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    //Boton "guardar" en ventana "alta de personal" 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        //Variable temporal para almacenar caja de texto
        String mat, nom, apell, edad, puesto, area ;
        //Variable para sentencia sql
        String sql = "";
        //Almacenar en variables el texto de cada caja
        mat = matri_alt_pers.getText();
        nom = nom_alt_pers.getText();
        apell = apell_alt_pers.getText();
        edad = edad_alt_pers.getText();
        puesto = puesto_alt_pers.getText();
        area = area_alt_pers.getText();
        
              
        //Sentencia sql para insertar datos en bd
        sql ="INSERT INTO personal (matricula, nombre, apellidos, edad, puesto, area) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            //Preparar sentencia SQL
            PreparedStatement pst = cn.prepareStatement(sql);
            
            //Orden de asignacion de cajas a campos de bd
            pst.setString(1, mat);
            pst.setString(2, nom);
            pst.setString(3, apell);
            pst.setString(4, edad);
            pst.setString(5, puesto);
            pst.setString(6, area);
            
            //Se ejecuta el statement o hacer actualizacion en la bd
            pst.executeUpdate();
            //Mensaje de confrimación
            JOptionPane.showMessageDialog(null,"Los datos se guardaron correctamente");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(inventario1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de conexion con la base de datos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apell_alt_pers;
    private javax.swing.JTextField area_alt_pers;
    private javax.swing.JTextField edad_alt_pers;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField matri_alt_pers;
    private javax.swing.JTextField nom_alt_pers;
    private javax.swing.JTextField puesto_alt_pers;
    // End of variables declaration//GEN-END:variables
}
