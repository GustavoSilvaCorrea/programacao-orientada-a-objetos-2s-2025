package ministeriofazenda;

public class Municipio {
    private String nome;
    private String estado;
    private double precom2;

    public Municipio(String nome, String estado, double precom2){
        this.nome = nome;
        this.estado = estado;
        this.precom2 = precom2;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecom2() {
        return this.precom2;
    }

    public void setPrecom2(double precom2) {
        this.precom2 = precom2;
    }
}
