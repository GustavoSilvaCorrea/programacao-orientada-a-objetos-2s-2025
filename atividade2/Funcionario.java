class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome() +
                "\t Email: " + getEmail() +
                "\t Matrícula: " + getCargo());
    }
}