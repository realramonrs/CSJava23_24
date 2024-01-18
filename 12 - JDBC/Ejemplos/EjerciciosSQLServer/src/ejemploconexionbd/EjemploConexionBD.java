/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploconexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EjemploConexionBD {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String cadena = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;user=sa;password=montecastelo";
                
        Connection conn = DriverManager.getConnection(cadena);
        
        System.out.println("La conexion se realizo correctamente");
        
    }
    
}
