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
public class Ejercicio6 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://localhost/jdbc";
        String usuario = "sa";
        String password = "montecastelo";
        String nombre = "FUTBOL";
        int numero = 20, filasAfectadas = 0;
                
        Connection connection = DriverManager.getConnection(connectionUrl, usuario, password);
        
        //Statement normal
//        Statement queryNormal = connection.createStatement();
//        filasAfectadas = queryNormal.executeUpdate("UPDATE DEPT SET DNAME = '" + nombre + "' WHERE DEPTNO= " + numero);
//        queryNormal.close();
        
        //Prepared Statement
        PreparedStatement queryConParametros = connection.prepareStatement("UPDATE DEPT SET DNAME = ? WHERE DEPTNO= ?");
        queryConParametros.setString(1, nombre);
        queryConParametros.setInt(2, numero);
        filasAfectadas = queryConParametros.executeUpdate();
        queryConParametros.close();
        
        connection.close();

    }

}
