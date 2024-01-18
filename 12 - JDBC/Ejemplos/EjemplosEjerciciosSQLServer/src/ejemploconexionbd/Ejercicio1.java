/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploconexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ResultSet resultado;
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String cadena = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;user=sa;password=montecastelo";
                
        Connection conn = DriverManager.getConnection(cadena);
        
        Statement query = conn.createStatement();
        
        resultado = query.executeQuery("SELECT Numemp, nombre, apellidos, edad FROM empleados");
        
        while(resultado.next()){
            System.out.println("Numero empleado: " + resultado.getString("Numemp"));
            System.out.println("Nombre: " + resultado.getString("nombre"));
            System.out.println("Apellidos: " + resultado.getString("apellidos"));
            System.out.println("Edad: " + resultado.getInt("edad"));
            System.out.println("--------------------------------");
        }
    }
    
}
