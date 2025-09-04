public class Radar {
    private Integer limiteVelocidade;
    private String modelo;
    private String posicao;

    public Radar(String modelo, Integer limiteVelocidade, String posicao){
        this.modelo = modelo;
        this.limiteVelocidade = limiteVelocidade;
        this.posicao = posicao;
    } // Método Construtor, assegura a inserção das informação.

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: " + this.limiteVelocidade + 
        "\nVelocidade Avaliada: " + velocidadeAvaliada + "\nPlaca: " + placa);  
    }

    public void avaliarVelocidade(Carro c){
        if (c.getVelocidade() > this.limiteVelocidade) {
            emitirNotificacao(c.getPlaca(), c.getVelocidade());    
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getPosicao() {
        return posicao;
    }
}
