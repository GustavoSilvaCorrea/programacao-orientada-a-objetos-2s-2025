package model;

import interfaces.ItemEmprestavel;
import interfaces.TomadorEmprestimo;

public class Emprestimo {
    private TomadorEmprestimo tomadorEmprestimo;
    private ItemEmprestavel itemEmprestavel;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, ItemEmprestavel itemEmprestavel, String dataEmprestimo,
            String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.itemEmprestavel = itemEmprestavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public TomadorEmprestimo getTomadorEmprestimo() {
        return this.tomadorEmprestimo;
    }

    public void setTomadorEmprestimo(TomadorEmprestimo tomadorEmprestimo) {
        this.tomadorEmprestimo = tomadorEmprestimo;
    }

    public ItemEmprestavel getItemEmprestavel() {
        return this.itemEmprestavel;
    }

    public void setItemEmprestavel(ItemEmprestavel itemEmprestavel) {
        this.itemEmprestavel = itemEmprestavel;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Empréstimo ===");
        System.out.println("Tomador de Emprestimo:");
        this.tomadorEmprestimo.exibirInfo();
        this.itemEmprestavel.descricao();
        System.out.println("Data Empréstimo: " + this.dataEmprestimo + " | Data Devolução: " + this.dataDevolucao);
    }
}
