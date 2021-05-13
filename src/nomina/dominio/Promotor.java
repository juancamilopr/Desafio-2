package nomina.dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre,int volantesRepartidos,long valorVolante, int comprasVolante){
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    public int getVolantesRepartidos(){
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos){
        this.volantesRepartidos = volantesRepartidos;
    }

    public long getValorVolante(){
        return valorVolante;
    }

    public void setValorVolante(long valorVolante){
        this.valorVolante = valorVolante;
    }

    public int getComprasVolante(){
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante){
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario(){
        return (getVolantesRepartidos() * getValorVolante()) + (17000 * getComprasVolante()); //falta...
    }
}