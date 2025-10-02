class Livro extends Material {
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
        System.out.println("Nome: " + getTitulo() +
                "\t Email: " + getAnoPublicacao() +
                "\t Matrícula: " + getAutor());
    }
}