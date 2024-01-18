


				package montecastelo;
				import java.sql.*;

				public class TestConexion {
					static String bd = "MI_BIBLIOTECA";
					static String login = "root";
					static String password = "admin";
					static String url = "jdbc:mysql://localhost/" + bd;

				public static void main(String[] args) {
				try {
					  Class.forName("com.mysql.jdbc.Driver");
					  Connection conn = DriverManager.getConnection(url, login, password);
					  if (conn != null) {
							System.out.println("Conexión a la bd " + url + "....ok!!");
							conn.close();
					  }
				} catch (ClassNotFoundException cnfe) {
					  System.out.println("Driver JDBC no encontrado");
					  cnfe.printStackTrace();
				}
				catch (SQLException sqle) {
					  System.out.println("Error al conectarse a la BD");
					  sqle.printStackTrace();
				} catch (Exception e) {
					  System.out.println("Error general");
					  e.printStackTrace();
				}
				
				}
				
				}


			
			
			


