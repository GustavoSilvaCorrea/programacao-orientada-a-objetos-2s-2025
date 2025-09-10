package ministeriofazenda;

public class Chacara extends imovel{
    private boolean possuiPocoArtesiano; 

    public Chacara(Municipio municipio, double aream2, Integer vagas, boolean possuiPocoArtesiano){
        super(municipio, aream2, vagas);
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

    public boolean getPossuiPocoArtesiano(){
        return this.possuiPocoArtesiano;
    }

    public void setPossuiPocoArtesiano(boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }
}
