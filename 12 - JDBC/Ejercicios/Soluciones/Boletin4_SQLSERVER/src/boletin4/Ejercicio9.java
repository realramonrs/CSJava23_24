package boletin4;

import java.sql.*;
import java.util.ArrayList;

public class Ejercicio9 {

    // Propiedades
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    CallableStatement cs = null;
    DatabaseMetaData d = null;
    String url = "jdbc:sqlserver://DESKTOP-S65ABNK\\BD_MONTECASTELO:1433;databaseName=JDBC;";
    String user = "sa";
    String password = "montecastelo";
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

     // Métodos
    
     // EJERCICIO A
     public void conectarBD(){
         
          // Cargra del Driver
          try{
                Class.forName(driver);
          }
          catch(ClassNotFoundException e){
                e.printStackTrace();
          }
         
          // Conexión a Base de datos
          try{
                conn = DriverManager.getConnection(url, user, password);
          }
          catch(SQLException e){
                e.printStackTrace();
          }
     } // fin función conectarBD
    
     public void cerrarConexion(){
          if (conn != null){
                try{
                     conn.close();
                }
                catch(SQLException e){
                     e.printStackTrace();
                }
          }
     } // Fin función cerrarConexion()
    
     // EJERCICIO B
     public void insertarDepto(int numDep, String nombreDept, String localidad){
         
          try{
                conn.setAutoCommit(false); // Desactivo el commit para cada sentencia
                ps = conn.prepareStatement("INSERT INTO DEPT VALUES((?),(?),(?));");
                ps.setInt(1, numDep);
                ps.setString(2, nombreDept);
                ps.setString(3,localidad);
                ps.executeUpdate();
                conn.commit(); // Al finalizar sentencias hago commit
                conn.setAutoCommit(true); // Y vuelvo a activar autocommit para resto de aplicación
          }
          catch(SQLException e){
                try{
                     conn.rollback(); // Si algo falla hago rollback para dejarlo como antes
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }   
          }
          finally{
                if (ps != null){
                     try{
                          ps.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
     } // Fin función insertarDept(x, x, x)
    
     // EJERCICIO C
     public void insertarDepto(Departamento depto){
          Departamento d = depto;
         
          try{
                conn.setAutoCommit(false);
                ps = conn.prepareStatement("INSERT INTO DEPT VALUES((?), (?), (?));");
                ps.setInt(1, d.getNumDep());
                ps.setString(2, d.getNombreDep());
                ps.setString(3, d.getLocalidad());
                ps.execute();
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if (ps != null){
                     try{
                          ps.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
               
          }
     } // Fin función insertarDept(x)
    
     // EJERCICIO D
     public ArrayList<Departamento> listarDepartamentos(){
          Departamento d = new Departamento();
          ArrayList<Departamento> listaDep = new ArrayList<Departamento>();
         
          try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery("SELECT * FROM DEPT");
               
                while(rs.next()){
                     d.setNumDep(rs.getInt("DEPTNO"));
                     d.setNombreDep(rs.getString("DNAME"));
                     d.setNombreDep(rs.getString("LOC"));
                     listaDep.add(d);
                }
          }
          catch(SQLException e){
                e.printStackTrace();
          }
          finally{
                if (rs != null){
                     try{
                          rs.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
                if (stmt != null){
                     try{
                          stmt.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
         
          return listaDep;
     } // Fin función listarDepartamentos()
    
     // EJERCICIO E
     public Departamento cogerDepartamento(int numDep){
          Departamento d = new Departamento();
          try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery("SELECT * FROM DEPT WHERE DEPTNO = " + numDep + ";");
               
                while(rs.next()){
                     d.setNumDep(rs.getInt("DEPTNO"));
                     d.setNombreDep(rs.getString("DNAME"));
                     d.setLocalidad(rs.getString("LOC"));
                }
          }
          catch(SQLException e){
                e.printStackTrace();
          }
          finally{
                if (rs != null){
                     try{
                          rs.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
                if (stmt != null){
                     try{
                          stmt.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
          return d;
     } // Fin función cogerDepartamento()
    
     // EJERCICIO F
     public void actualizarDepartamento(Departamento depto){
          Departamento d = depto;
         
          try{
                conn.setAutoCommit(false);
                ps = conn.prepareStatement("UPDATE DEPT SET DNAME = ?, LOC = ? WHERE DEPTNO = ?");
                ps.setString(1, d.getNombreDep());
                ps.setString(2, d.getLocalidad());
                ps.setInt(3, d.getNumDep());
                ps.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if (ps != null){
                     try{
                          ps.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
               
          }
     } // Fin función actualizarDepartamento()
    
     // EJERCICIO G
     public void borraDepto(int n){
          try{
                conn.setAutoCommit(false);
               ps = conn.prepareStatement("DELETE FROM DEPT WHERE DEPTNO = (?)");
                ps.setInt(1, n);
                ps.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if(ps != null){
                     try{
                          ps.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
     } // Fin función borrarDepto()
    
     // EJERCICIO H
     public int borrarDeptConFilas(int n){
         
          int r = 0;
         
          try{
                conn.setAutoCommit(false);
                ps = conn.prepareStatement("DELETE FROM DEPT WHERE DEPTNO = (?)");
                ps.setInt(1, n);
                r = ps.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if(ps != null){
                     try{
                          ps.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }

          return r;
     } // Fin función borrarDeptConFilas()
    
     // EJERCICIO I
     public void actualizarDeptCallable(int n, String localidad){
          try{
                conn.setAutoCommit(false);
                cs = conn.prepareCall("{call actualizaDept(?,?)}");
                cs.setInt(1, n);
                cs.setString(2, localidad);
                cs.execute();
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if (cs != null){
                     try{
                          cs.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
     } // Fin función actualizarDeptCallable
    
     // EJERCICIO J
     public Departamento consultarDeptoCallable(int depto){
          Departamento r = new Departamento();
          try{
                conn.setAutoCommit(false);
                cs = conn.prepareCall("{call consultaDepar(?, ?, ?)}");
                cs.setInt(1, depto);
                cs.registerOutParameter(2, java.sql.Types.VARCHAR);
                cs.registerOutParameter(3, java.sql.Types.VARCHAR);
                cs.execute();
                r.setNumDep(depto);
                r.setNombreDep(cs.getString(2));
                r.setLocalidad(cs.getString(3));
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if (cs != null){
                     try{
                          cs.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
         
          return r;
     } // Fin función consultarDeptoCallable()
    
     // EJERCICIO K
     public void actualizarSalarios(double cantidad, int depto){
          try{
                conn.setAutoCommit(false);
                cs = conn.prepareCall("{call actualizarSalarios(?,?)}");
                cs.setDouble(1, cantidad);
                cs.setInt(2, depto);
                cs.execute();
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     ex.printStackTrace();
                }
          }
          finally{
                if (cs != null){
                     try{
                          cs.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
     } // Fin función actualizarSalarios()
    
     // EJERCICIO L
     public void actualizarSalariosResultSet(double cantidad, int depto){
          try{
                conn.setAutoCommit(false);
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = stmt.executeQuery("SELECT * FROM EMP WHERE DEPTNO = " + depto + ";");
                rs.beforeFirst(); // Situo al principio por si acaso
                while (rs.next()){
                     double salario = rs.getDouble("SAL") + cantidad;
                     rs.updateDouble("SAL", salario);
                     rs.updateRow();
                }
                conn.commit();
                conn.setAutoCommit(true);
          }
          catch(SQLException e){
                try{
                     conn.rollback();
                }
                catch(SQLException ex){
                     e.printStackTrace();
                }
          }
          finally{
                if (rs != null){
                     try{
                          rs.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
                if (stmt != null){
                     try{
                          stmt.close();
                     }
                     catch(SQLException e){
                          e.printStackTrace();
                     }
                }
          }
     } // Fin función actualizarSalariosResultSet()
    
     // EJERCICIO M
     public void verInfo(){
          if (conn != null){
                try{
                     d = (DatabaseMetaData)conn.getMetaData();
                     System.out.println("Gestor: " + d.getDatabaseProductName());
                     System.out.println("Usuario conectado: " + d.getUserName());
                     System.out.println("Driver utilizado: " + d.getDriverVersion());
                }
                catch(SQLException e){
                     e.printStackTrace();
                }
          }
     } // Fin función verInfo()
         
     // EJERCICIO N
     public void infoTablas(String esquema, String tabla){
          if (conn != null){
                try{
                     d = (DatabaseMetaData)conn.getMetaData();
                     rs = d.getColumns(conn.getCatalog(), esquema, "%", null);
                    
                     System.out.println("Esquema\tNombre\n");
                    
                     while(rs.next()){
                          System.out.println("Nombre: " + rs.getString(3) + "\tTamaño: " + rs.getString(7) + "\tTipo: " + rs.getString(6) + "\tValores nulos: " + rs.getString(18));
                     }
                }
                catch(SQLException e){
                     e.printStackTrace();
                }
                finally{
                     if (rs != null){
                          try{
                               rs.close();
                          }
                          catch(SQLException e){
                               e.printStackTrace();
                          }
                     }
                }
          }
     } // Fin función infoTablas()
        
     // EJERCICIO O
     public void infoTablasPrimarias(String esquema, String tabla){
          if (conn != null){
                try{
                     d = (DatabaseMetaData)conn.getMetaData();
                     rs = d.getPrimaryKeys(conn.getCatalog(), esquema, tabla);
                    
                     System.out.println("Schema\tTabla\tClave Primaria");
                     while (rs.next()){
                          System.out.println(rs.getString(1) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                     }
                }
                catch(SQLException e){
                     e.printStackTrace();
                }
                finally{
                     if (rs != null){
                          try{
                               rs.close();
                          }
                          catch(SQLException e){
                               e.printStackTrace();
                          }
                     }
                }
          }
     } // Fin función infoTablasPrimarias()
    
     // EJERCICIO P
     public void infoTablasAjenas(String esquema, String tabla){
          if (conn != null){
                try{
                     d = (DatabaseMetaData)conn.getMetaData();
                     rs = d.getExportedKeys(conn.getCatalog(), esquema, tabla);
                    
                     while(rs.next()){
                          System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                     }
                }
                catch(SQLException e){
                     e.printStackTrace();
                }
                finally{
                     if (rs != null){
                          try{
                               rs.close();
                          }
                          catch(SQLException e){
                               e.printStackTrace();
                          }
                     }
                }
          }
     } // Fin función infoTablasAjenas()
    
     // EJERCICIO Q
     public void infoConsulta(String select){
          if (conn != null){
                try{
                     stmt = conn.createStatement();
                     rs = stmt.executeQuery(select);
                    
                     while(rs.next()){
                          System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
                     }
                }
                catch(SQLException e){
                     e.printStackTrace();
                }
                finally{
                     if (stmt != null){
                          try{
                               stmt.close();
                          }
                          catch(SQLException e){
                               e.printStackTrace();
                          }
                     }
                     if (rs != null){
                          try{
                               rs.close();
                          }
                          catch(SQLException e){
                               e.printStackTrace();
                          }
                     }
                }
          }
     } // Fin función infoConsulta()
}