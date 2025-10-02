class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome() +
                "\t Email: " + getEmail() +
                "\t Matrícula: " + getMatricula());
    }
}