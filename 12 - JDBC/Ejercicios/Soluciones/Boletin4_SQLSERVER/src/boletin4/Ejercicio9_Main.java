
package boletin4;

import java.util.ArrayList;


public class Ejercicio9_Main {

    public static void main(String[] args) {

        // Propiedades
        Ejercicio9 bd = new Ejercicio9();
        Departamento d = new Departamento(70, "POTTER", "UK");
        ArrayList<Departamento> lDep = new ArrayList<Departamento>();

        // Métodos
        bd.conectarBD();
        bd.insertarDepto(60, "TOPSECRET", "QUEEN");
        bd.insertarDepto(d);
        lDep = bd.listarDepartamentos();
        d = bd.cogerDepartamento(40);
        bd.actualizarDepartamento(d);
        bd.borraDepto(70);
        System.out.println("Filas afectadas: " + bd.borrarDeptConFilas(80));
        bd.actualizarDeptCallable(70, "HUESCA");
        d = bd.consultarDeptoCallable(40);
        System.out.println(d.getNumDep() + d.getNombreDep() + d.getLocalidad());
        bd.actualizarSalarios(1600.00, 10);
        bd.actualizarSalariosResultSet(1600.00, 10);
        bd.verInfo();
        bd.infoTablas("demodb", "dept");
        bd.infoTablasPrimarias("demodb", "dept");
        bd.infoTablasAjenas("demobd", "dept");
        bd.infoConsulta("SELECT * FROM dept");
        bd.cerrarConexion();

    }
}
