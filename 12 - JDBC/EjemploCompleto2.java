package montecastelo;
import java.sql.*;

public class TestExecuteUpdate {
      final static String bd = "MI_BIBLIOTECA";
      final static String login = "root";
      final static String password = "admin";
      final static String url = "jdbc:mysql://localhost/" + bd;
      Connection conn;
      Statement stmt;

public TestExecuteUpdate() throws SQLException, ClassNotFoundException {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(url, login, password);
      stmt = conn.createStatement();
}
public void operacionesBD() throws SQLException {
      int r = 0;
      String cadSQL = null;
      cadSQL = "INSERT INTO profesores VALUES(127,'Martín','García')";
      r = stmt.executeUpdate(cadSQL);
      System.out.println(r + " registro agregado.");
      cadSQL = "INSERT INTO profesores VALUES(128,'Ramón','Ríos')";
      r = stmt.executeUpdate(cadSQL);
      System.out.println(r + " registro agregado.");
      cadSQL = "UPDATE profesores SET nombreProfesor='Fran' WHERE nombreProfesor='Enrique'";
      r = stmt.executeUpdate(cadSQL);
      System.out.println(r + " registro modificado.");
      cadSQL = "DELETE FROM profesores WHERE nombreProfesor='Roberto'";
      r = stmt.executeUpdate(cadSQL);
      System.out.println(r + " registro eliminado.");
      cadSQL = "DELETE FROM profesores WHERE nombreAutor='Antonio'";
      r = stmt.executeUpdate(cadSQL);
      System.out.println(r + " registro eliminado.");
      stmt.close();
      conn.close();
}
public static void main(String[] args) {
      try {
            TestExecuteUpdate test = new TestExecuteUpdate();
            test.operacionesBD();
      } catch (SQLException sqle) {
            System.out.println(sqle);
      } catch (Exception e) {
            System.out.println(e);
      }
	  }
	  }
