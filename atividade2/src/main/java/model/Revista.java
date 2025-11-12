package model;

public class Revista extends Material {
    private Integer edicao;

    public Revista(String titulo, Integer anoPublicacao, Integer edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public Integer getEdicao() {
        return this.edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Titulo: " + this.getTitulo() +
                "\t Ano de  Publicacao: " + this.getAnoPublicacao() +
                "\t Edicao: " + this.getEdicao());
    }
}