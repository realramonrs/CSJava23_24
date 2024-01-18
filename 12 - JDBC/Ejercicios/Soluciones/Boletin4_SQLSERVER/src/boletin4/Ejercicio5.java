package boletin4;

import java.sql.*;

public class Ejercicio5 {

    public static void main(String[] args) {
         // Propiedades
          Connection conn = null;
          Statement stmt;
          ResultSet rs;
          String url = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;";
          String user = "sa";
          String password = "montecastelo";

          // Métodos
         
          // Importo driver
          try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          }
          catch(ClassNotFoundException e){
                e.printStackTrace();
          }
         
          // Trabajo con base de datos
          try{
                conn = DriverManager.getConnection(url, user, password);
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select deptno, dname from dept");
               
                while(rs.next()){
                     int numDept = rs.getInt("deptno");
                     String nombre = rs.getString("dname");
                     System.out.println("Departamento: " + numDept + ". Nombre: " + nombre);
                }
               
                rs.close();
                stmt.close();
          }
          catch(SQLException e){
                e.printStackTrace();
          }
          finally{
                if(conn != null){
                     try{
                          conn.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
     }

}

