/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MESACOCINA
 */
public class ConexionBDMysql {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://localhost/jdbc";
        String usuario = "root";
        String password = "";
                
        Connection connection = DriverManager.getConnection(connectionUrl, usuario, password);
        System.out.println("Conexion realizada con éxito");

    }

}
