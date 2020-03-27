//Conecta una base de datos al programa
package u3_a2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;



public class conexion {
    
    Connection conect = null;
    com.mysql.jdbc.Connection conexion;
    //Metodo para establecer conexión
    public conexion(){
        try {
        //Se especifica el driver de conexión
        Class.forName("com.mysql.jdbc.Driver");
        //Se crea cadena de conexion hacia la bd que se llama prueba"
        conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            System.out.println("Conexión con la base de datos ha sido exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexión: "+e);
        }
       
       
    }
    
   
}
        
    

