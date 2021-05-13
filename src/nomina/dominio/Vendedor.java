package nomina.dominio;

public class Vendedor extends Directo {
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes){
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long getVentasDelMes(){
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes){
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public long calcularPension(){
        return super.calcularPension();
    }

    @Override
    public long calcularSalud(){
        return super.calcularSalud();
    }

    public long calcularComision() {
        long ventasDelMes = this.ventasDelMes;
        long resultado = 0;

        if (getSalario() < 999999){
            resultado = (ventasDelMes * 5) / 100;
        }

        else if (getSalario() >= 1000000){
            resultado = (long)((ventasDelMes * 4.5) / 100);
        }
        return resultado;
    }

    @Override
    public long calcularSalario(){
        return getSalario() +  calcularComision() - calcularPension() -calcularSalud();
    }
}