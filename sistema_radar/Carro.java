public class Carro {
    private Integer ano;
    private String modelo;
    private String placa;
    private Integer velocidade;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    } // Método Construtor, assegura a inserção das informação.

    public Integer getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(Integer velocidade){
        if (velocidade != null && velocidade > 0) {
            this.velocidade = velocidade; 
        }
    };

    public String getPlaca(){
        return this.placa;
    }

    public void acelerar() {
        this.velocidade += 5;
    }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 5;
        }
    }

    public Integer getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }
}
