package boletin4;

import java.sql.*;

public class Ejercicio6 {

    // Propiedades
    Connection conn = null;
    Statement stmt;
    String url = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;";
    String user = "sa";
    String password = "montecastelo";

    // Métodos
    public void cargarDriver() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void conectarBD() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cambiarDepto(int numDep, String newName) {

        int i = 0;
        cargarDriver();
        conectarBD();

        try {
            stmt = conn.createStatement();
            i = stmt.executeUpdate("UPDATE DEPT SET DNAME = '" + newName + "' WHERE DEPTNO = " + numDep + ";");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Filas afectadas: " + i);
    }
}
