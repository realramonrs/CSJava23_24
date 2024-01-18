/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String cadenaSQL;
        ResultSet rs;
        
        //Paso 1: Importar driver y cargarlo
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //Paso 2: Conectamos con la BD
                String connectionUrl
                = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;"
                + "databaseName=JDBC;"
                + "user=sa;"
                + "password=montecastelo;";      
        Connection connection = DriverManager.getConnection(connectionUrl);
        
        //Paso 3: Creamos el statement
        Statement stmt = connection.createStatement();
        
        //Paso 4: Creamos la consulta SQL
        cadenaSQL = "SELECT numemp, nombre, apellidos, edad FROM empleados";
        
        //Paso 5: Ejecutamos la consulta
        rs = stmt.executeQuery(cadenaSQL);
        
        //Paso 6: Mostramos los resultados
        while (rs.next()) {            
            System.out.println("Numero empleado: " + rs.getInt("numemp"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Apellidos: " + rs.getString("apellidos"));
            System.out.println("Edad: " + rs.getInt("edad"));
        }
        
        rs.close();
        stmt.close();
        connection.close();
        
    }
    
}
