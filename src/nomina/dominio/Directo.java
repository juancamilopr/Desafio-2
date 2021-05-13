package nomina.dominio;

public class Directo extends Empleado {
    public static final int porcentajeNro1 = 7;
    public static final double porcerajeNro2 = 6.5;
    private long salario;

    public Directo(String nombre, long salario){
        super(nombre);
        this.salario = salario;
    }

    public long getSalario() {
        return salario;
    }

    public void getSalario(long salario) {
        this.salario = salario;
    }



    public long calcularSalud(){
        long resultado;
        resultado = (getSalario() * porcentajeNro1) / 100;
        return resultado;

    }

    public long calcularPension(){
        long resultado;
        resultado = (long) ((getSalario() * porcerajeNro2 / 100));
        return resultado;
    }

    @Override
    public long calcularSalario(){
        return getSalario() - calcularSalud() - calcularPension();
    }
}