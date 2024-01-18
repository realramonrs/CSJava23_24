/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        int filasAfectadas;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String cadena = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;user=sa;password=montecastelo";

        Connection conn = DriverManager.getConnection(cadena);

        Statement query = conn.createStatement();

        filasAfectadas = query.executeUpdate("UPDATE alumnos SET Telefono = 112 WHERE nombre = 'Cristiano'");
        
        System.out.println("Filas afectadas: " + filasAfectadas);
        
        query.close();
        conn.close();
    }

}
