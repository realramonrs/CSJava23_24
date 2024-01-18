/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploconexionbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author olall
 */
public class Tarea4SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ResultSet resultado;
        int filasAfectadas;
        int r = 0;
        Statement stmt;
      String cadSQL = null;
 
       //ejercicio 1
       
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        //String cadena = "jdbc:sqlserver://LAPTOP-J54FOKH0\\olall:1433;databaseName=JDBC;user=sa;password=montecastelo";
        String cadena = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;user=sa;password=montecastelo";


        Connection conn = DriverManager.getConnection(cadena);
        stmt=conn.createStatement();
           System.out.println("Conexion realizada con éxito");
       
          /*-----------------*/
       //ejercicio2
        java.sql.Statement query =  conn.createStatement();
        
        resultado = query.executeQuery(" select ciudad,region from oficinas where region='Galicia'");
        
        while(resultado.next()){
           
            System.out.println("Ciudad: " + resultado.getString("ciudad"));
            System.out.println("Region: " + resultado.getString("region"));
            System.out.println("--------------------------------");
        }
        //ejercicio3
        
  
        String consulta1 = "INSERT INTO EMP VALUES (?,?,?,?,?,?,?,?)";
        System.out.println("Conexion realizada con éxito");
        PreparedStatement consultaPreparada = conn.prepareStatement(consulta1);
        consultaPreparada.setInt(1,4321);
        consultaPreparada.setString(2, "vaio");
        consultaPreparada.setString(3, "CLERK");
        consultaPreparada.setInt(4, 7123);
        consultaPreparada.setString(5, "1988/08/20");
        consultaPreparada.setInt(6, 1150);
        consultaPreparada.setInt(7,100);
        consultaPreparada.setInt(8,10);
        filasAfectadas = consultaPreparada.executeUpdate();
        System.out.println("Consulta ejecutada. Filas afectadas: " + filasAfectadas);
        consultaPreparada.close();
        
         
        //EJERCICIO 4
      cadSQL = "UPDATE PEDIDOS SET IMPORTE=importe+0.10";
       r=stmt.executeUpdate(cadSQL);
      System.out.println(r + " registro modificado.");
 
      
      //ejercicio 5
  cadSQL = "delete from salgrade";
       r=stmt.executeUpdate(cadSQL);
      System.out.println(r + " registros eliminados.");
 
 
 
 
 
 
 
 
    }

} 
        
        
        
        
        
        
        
    
    

