package ejemploconexionbd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // write your code here
    static Connection conn = null;
    static Statement stmt = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    CallableStatement cs = null;
    DatabaseMetaData d = null;
    static String url = "jdbc:mysql://localhost/jdbc";
    static String user = "root";
    static String password = "";
    static String driver = "com.mysql.jdbc.Driver";
    static String url2 = "jdbc:mysql://localhost/jdbc";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        conectarBD();
        InsertarTablaBonus();
        cerrarConexion();

        conectarBD2();
        borrarPorEdad();
        cerrarConexion();

        conectarBD();
        actualizarProductos();
        departamentosYRegiones();
        cerrarConexion();

    }

    private static void departamentosYRegiones() {
        ArrayList<String> LocDept = new ArrayList<String>();
        ArrayList<String> NameDept = new ArrayList<String>();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM DEPT");

            while (rs.next()) {
                NameDept.add(rs.getString("DNAME"));
                LocDept.add(rs.getString("LOC"));
            }

            mostrarDept(LocDept, NameDept);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void mostrarDept(ArrayList<String> locDept, ArrayList<String> nameDept) {

        for (int i = 0; i < locDept.size(); i++) {
            System.out.println("El nombre del departamento es :" + nameDept.get(i));
            System.out.println("La Localización es : " + locDept.get(i));
        }
    }

    private static void actualizarProductos() {

        System.out.println("¿A cuanto quiere actualizar los importes de los productos con valor menor a 3?");
        int importe = sc.nextInt();
        try {
            conn.setAutoCommit(false);
            ps = conn.prepareStatement("UPDATE pedidos SET importe = ? WHERE importe < 3;");
            ps.setInt(1, importe);
            ps.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    private static void borrarPorEdad() {
        int edad = 40;
        int i = 0;

        try {
            PreparedStatement ps = conn.prepareStatement("DELETE from empleados WHERE edad > (?);");
            ps.setInt(1, edad);
            i = ps.executeUpdate();
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

    private static void conectarBD2() {
        // Cargra del Driver
        try {
            Class.forName(driver);
            System.out.println("Driver conectado");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Conexión a Base de datos
        try {
            conn = DriverManager.getConnection(url2, user, password);
            System.out.println("Base de datos conectada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void InsertarTablaBonus() {

        System.out.println("Nombre del bonus: ");
        String ename = sc.nextLine();
        System.out.println("Nombre trabajo: ");
        String job = sc.nextLine();
        //Creo recordar que aquí si no hacía un salto de línea rompía
        sc.nextLine();
        System.out.println("Salario: ");
        int salario = sc.nextInt();
        System.out.println("Comision: ");
        int comm = sc.nextInt();

        try {
            conn.setAutoCommit(false); // Desactivo el commit para cada sentencia
            ps = conn.prepareStatement("INSERT INTO bonus VALUES((?),(?),(?),(?));");
            ps.setString(1, ename);
            ps.setString(2, job);
            ps.setInt(3, salario);
            ps.setInt(4, comm);
            ps.executeUpdate();
            conn.commit(); // Al finalizar sentencias hago commit
            conn.setAutoCommit(true); // Y vuelvo a activar autocommit para resto de aplicación
        } catch (SQLException e) {
            try {
                conn.rollback(); // Si algo falla hago rollback para dejarlo como antes
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // EJERCICIO A
    public static void conectarBD() {

        // Cargra del Driver
        try {
            Class.forName(driver);
            System.out.println("Driver conectado");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Conexión a Base de datos
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Base de datos conectada");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } // fin función conectarBD

    public static void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } // Fin función cerrarConexion()
}
