package atividade1;

public class Computador {
    private Integer memoriaRam;
    private Integer SSD;
    private Integer nucleos;
    private float operacoesPorSegundo;

    public Computador(Integer memoriaRam, Integer SSD, Integer nucleos, Float operacoesPorSegundo) {
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public Integer getMemoriaRam() {
        return this.memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Integer getSSD() {
        return this.SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getNucleos() {
        return this.nucleos;
    }

    public float getOperacoesPorSegundo() {
        return this.operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(float operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
}
