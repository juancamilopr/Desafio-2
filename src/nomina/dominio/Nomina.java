package nomina.dominio;
import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void calcularNomina(List<Empleado> empleados) {
        empleados.forEach(empleado ->
                System.out.println(empleado.getNombre() + "Su salario es de:" + empleado.calcularSalario()));
    }

    public void listarDirectos(List<Empleado> empleados) {
        empleados.forEach(empleado1 -> {
            if (empleado1 instanceof Vendedor) {
                System.out.println(empleado1.getNombre() + "Es trabajador Vendedor");
            } else if (empleado1 instanceof Directo) {
                System.out.println(empleado1.getNombre() + "Es trabajador Directo");
            }
        });
    }

        public void listarFreelance(List<Empleado> empleados) {
            empleados.forEach(empleado2 -> {
                if (empleado2 instanceof Freelance) {
                    System.out.println(empleado2.getNombre() + "Es trabajador Freelance");
                }
            });
        }

        public void listarPromotores(List<Empleado> empleados){
            empleados.forEach(empleado3 -> {
                if (empleado3 instanceof Promotor) {
                    System.out.println(empleado3.getNombre() + "Es trabajador Promotor");
                }
            });
        }
    }