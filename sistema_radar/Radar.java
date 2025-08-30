public class Radar {
    public Integer limiteVelocidade;
    public String modelo;
    public String posicao;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: " + this.limiteVelocidade + 
        " Velocidade Avaliada: " + velocidadeAvaliada + " Placa: " + placa);  
    }

    public void avaliarVelocidade(Carro c){
        if (c.velocidade > this.limiteVelocidade) {
            emitirNotificacao(c.placa, c.velocidade);    
        }
    }
}
