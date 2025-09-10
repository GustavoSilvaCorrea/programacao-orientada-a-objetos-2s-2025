package ministeriofazenda;

public class Apartamento extends imovel{
    private boolean possuiElevador;

    public Apartamento(Municipio municipio, double aream2, boolean possuiElevador, Integer vagas){
        super(municipio, aream2, vagas);
        this.possuiElevador = possuiElevador;
    }

    public boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }
}
