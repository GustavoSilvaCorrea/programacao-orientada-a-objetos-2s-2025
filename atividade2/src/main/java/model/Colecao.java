package model;

import interfaces.ItemEmprestavel;

public class Colecao implements ItemEmprestavel{
    private String propietario;
    private Integer quantidadeItens;

    public Colecao(String propietario, Integer quantidadeItens) {
        this.propietario = propietario;
        this.quantidadeItens = quantidadeItens;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Integer getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    @Override
    public void descricao(){
        System.out.println("Propietario: " + this.getPropietario());
        System.out.println("Quantidade de Materiais: " + this.getQuantidadeItens());
    }
}
