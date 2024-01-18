package boletin4;

import java.sql.*;

public class Ejercicio8 {

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
            conn.setAutoCommit(false); // Desactivo el commit para cada sentencia
            PreparedStatement ps = conn.prepareStatement("UPDATE DEPT SET DNAME = (?) WHERE DEPTNO = (?);");
            ps.setString(1, newName);
            ps.setInt(2, numDep);
            i = ps.executeUpdate();
            conn.commit(); // Al finalizar sentencias hago commit
            conn.setAutoCommit(true); // Y vuelvo a activar autocommit para resto de aplicación
        } catch (SQLException e) {
            try {
                conn.rollback(); // Si algo falla hago rollback para dejarlo como antes
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

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
