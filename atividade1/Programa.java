package atividade1;

public class Programa {
    private String nome;
    private Integer memoriaRamAlocada;
    private Integer SSDOcupado;
    private Integer nucleosP;
    private Integer quantidadeOperacoes;
    
    public Programa(Integer memoriaRamAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes, String nome){
        this.memoriaRamAlocada = memoriaRamAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleosP = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
        this.nome = nome;
    }

    public Integer getMemoriaRamAlocada() {
        return this.memoriaRamAlocada;
    }

    public void setMemoriaRamAlocada(Integer memoriaRamAlocada) {
        this.memoriaRamAlocada = memoriaRamAlocada;
    }

    public Integer getSSDOcupado() {
        return this.SSDOcupado;
    }

    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getNucleosP() {
        return this.nucleosP;
    }

    public void setNucleosP(Integer nucleosP) {
        this.nucleosP = nucleosP;
    }

    public Integer getQuantidadeOperacoes() {
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
