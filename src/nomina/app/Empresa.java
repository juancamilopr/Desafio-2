package nomina.app;

import nomina.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Directo empleado1 = new Directo("Juan",5360000);
        Vendedor empleado2 = new Vendedor("Julian",2450000,55510000);
        Freelance empleado3 = new Freelance("Johana",76000,85);
        Vendedor empleado4 = new Vendedor("Carolina",990000,62487000);
        Promotor empleado5 = new Promotor("Pedro",1500,250,48);
        Directo empleado6 = new Directo("David",2895000);
        Freelance empleado7 = new Freelance("Gustavo",52500,60);

        //Lista de empleados

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        empleados.add(empleado6);
        empleados.add(empleado7);

        //nomina

        System.out.println("Los directos son: ");
        nomina.listarDirectos(empleados);
        System.out.println("\nLos freelancers son: ");
        nomina.listarFreelance(empleados);
        System.out.println("\nLos promotores son: ");
        nomina.listarPromotores(empleados);
        System.out.println("\n");
        nomina.calcularNomina(empleados);
    }
}