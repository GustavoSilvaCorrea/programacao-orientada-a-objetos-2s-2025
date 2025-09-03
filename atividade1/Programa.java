package atividade1;

public class Programa {
    private Integer memoriaRamAlocada;
    private Integer SSDOcupado;
    private Integer nucleosP;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRamAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes){
        this.memoriaRamAlocada = memoriaRamAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleosP = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
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
}
