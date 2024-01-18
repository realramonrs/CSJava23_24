package montecastelo;

import java.sql.*;

public class Ejercicio6 {

    // Propiedades
    Connection conn = null;
    Statement stmt;
    String url = "jdbc:mysql://localhost/supermercado";
    String user = "alumno";
    String password = "abc123.";

    // Métodos
    public void cargarDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
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
