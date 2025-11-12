package model;

public class Livro extends Material {
    private String autor;

    public Livro(String titulo, Integer anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    @Override
    public void descricao() {
        System.out.println("Titulo: " + this.getTitulo() +
                "\t Ano de Publicacao: " + this.getAnoPublicacao() +
                "\t Autors: " + this.getAutor());
    }
}