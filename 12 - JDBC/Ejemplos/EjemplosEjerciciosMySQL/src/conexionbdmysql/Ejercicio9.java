/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MESACOCINA
 */
public class Ejercicio9 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://localhost/jdbc";
        String usuario = "sa";
        String password = "montecastelo";
        int filasAfectadas = 0;
        int Numero_Departamento = 55;
        String Nombre_Departamento = "ROBOTICA";
        String Localidad_Departamento = "VIGO";
                
        Connection connection = DriverManager.getConnection(connectionUrl, usuario, password);

        PreparedStatement queryConParametros = connection.prepareStatement("INSERT INTO DEPT VALUES (?,?,?)");
        queryConParametros.setInt(1, Numero_Departamento);
        queryConParametros.setString(2, Nombre_Departamento);
        queryConParametros.setString(3, Localidad_Departamento);
        filasAfectadas = queryConParametros.executeUpdate();
        queryConParametros.close();
        
        connection.close();

    }

}
