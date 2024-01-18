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
      ResultSet rs;
      String cadSQL = null;

      cadSQL = "SELECT * FROM profesores";
      rs = stmt.executeQuery(cadSQL);

      while(rs.next()) {
            System.out.print("Profesor ID: " + rs.getString(1));
            System.out.print("Nombre: " + rs.getString(2));
            System.out.print("Apellido: " + rs.getString(3) + "\n");
		}
rs.close();
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