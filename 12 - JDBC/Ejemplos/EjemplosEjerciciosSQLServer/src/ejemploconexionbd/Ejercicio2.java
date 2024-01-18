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

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        int filasAfectadas;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String cadena = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=Prueba1;user=sa;password=montecastelo";

        Connection conn = DriverManager.getConnection(cadena);

        Statement query = conn.createStatement();

        query.executeUpdate("DROP TABLE IF EXISTS Alumnos; CREATE TABLE Alumnos (nombre varchar(50), apellidos varchar(50), dni varchar(9))");

        PreparedStatement consultaPreparada = conn.prepareStatement("INSERT INTO Alumnos VALUES (?,?,?)");

        for (int i = 0; i < 3; i++) {
            consultaPreparada.setString(1, "Nombre" + i);
            consultaPreparada.setString(2, "Apellido" + i);
            consultaPreparada.setString(3, "DNI" + i);
            filasAfectadas = consultaPreparada.executeUpdate();
            System.out.println("Consulta ejecutada. Filas afectadas: " + filasAfectadas);
        }

        consultaPreparada.close();
        conn.close();
    }

}
