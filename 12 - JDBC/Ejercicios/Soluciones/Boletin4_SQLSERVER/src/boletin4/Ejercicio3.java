package boletin4;

import java.sql.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Connection conexion = null;
        int id;
        try {
            // Cargar el driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Se obtiene una conexión con la base de datos.
            String connectionUrl
                = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;"
                + "databaseName=JDBC;"
                + "user=sa;"
                + "password=montecastelo;";                   
            conexion = DriverManager.getConnection(connectionUrl);

            // Se crea un Statement, para realizar el query
            Statement s = conexion.createStatement();

            // Se realiza la consulta
            // Queremos obtener el id del primer contacto con nombre Juan
            ResultSet rs = s.executeQuery("SELECT id FROM alumnos WHERE nombre='Pepito'");

            if (rs.next()) {   //Si rs.next() devuelve true significa que al menos hay un registro
                id = rs.getInt("id");  //se obtienen su id
                //se actualiza el registro
                s.executeUpdate("UPDATE alumnos SET telefono='625456789' WHERE id=" + id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally { // Se cierra la conexión con la base de datos.
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
