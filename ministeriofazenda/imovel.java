package ministeriofazenda;

public class imovel {

    private Municipio municipio;
    private double aream2;
    private Integer vagas;

    public imovel(Municipio municipio, double aream2, Integer vagas) {
        this.municipio = municipio;
        this.aream2 = aream2;
        this.vagas = vagas;
    }

    public Municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public double calcularIPTU() {
        return (this.aream2 * this.municipio.getPrecom2());
    }
}
