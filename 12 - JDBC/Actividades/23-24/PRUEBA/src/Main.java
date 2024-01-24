import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            //1. Cargo el driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            //2. Intento conectarme a la base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Futbol;TrustServerCertificate=True";
            Connection conn = DriverManager.getConnection(url, "sa", "root");

            //3. Creamos el comando SQL
            Statement stmt = conn.createStatement();

            //4. Ejecutamos el comando SQL

            /*

                //A2.1 - Metemos a Ramón en el Celta
                stmt.executeUpdate("INSERT INTO Futbolistas (Codigo, Nombre, CodigoEquipo) VALUES ('#RAMON', 'Ramón Ríos', '#RCELTA')");

                //A2.2 - Actualizamos la edad de Sergio Ramos
                stmt.executeUpdate("UPDATE Futbolistas SET Edad = 37 WHERE Nombre = 'Sergio Ramos'");

                //A2.3 - Borramos a Leo Messi del Barcelona
                stmt.executeUpdate("DELETE FROM Futbolistas WHERE Nombre = 'Leo Messi'");

                //A2.4 - Mostrar a todos los futbolistas del Real Madrid
                ResultSet resultados = stmt.executeQuery("SELECT * FROM Futbolistas WHERE CodigoEquipo = '#RMDRID'");

                //Iteramos los resultados
                System.out.println("Los futbolistas que juegan en el Madrid son: ");
                while (resultados.next())
                {
                    System.out.println(resultados.getString("Nombre"));
                }

            //Repetimos el proceso para consultas PreparedStatement

            //A2.1-2 - Metemos a Dani en el Depor
            PreparedStatement consultaPreparada1 = conn.prepareStatement("INSERT INTO Futbolistas (Codigo, Nombre, CodigoEquipo) VALUES (?,?,?)");

            consultaPreparada1.setString(1, "#DANI");
            consultaPreparada1.setString(2, "Dani Rivas");
            consultaPreparada1.setString(3, "#DEPOR");

            consultaPreparada1.executeUpdate();
*/
            //A2.1-3 - Metemos a Andrés Luna en el Lugo

            try {
                conn.setAutoCommit(false);
                PreparedStatement consultaPreparada2 = conn.prepareStatement("INSERT INTO Futbolistas (Codigo, Nombre, CodigoEquipo) VALUES (?,?,?)");

                consultaPreparada2.setString(1, "#ANDRESIN");
                consultaPreparada2.setString(2, "Andres Luna");
                consultaPreparada2.setString(3, "#LUGO");

                consultaPreparada2.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);
            }
            catch (SQLException e){
                conn.rollback();
                System.out.println("LA HEMOS LIADO");
            }

            System.out.println("Funciona a la maravillosa perfección");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}