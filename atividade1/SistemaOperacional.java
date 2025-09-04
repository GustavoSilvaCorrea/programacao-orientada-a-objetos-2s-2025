package atividade1;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        System.out.println("Executando programa...");

        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: Armezenamento necessario maior que o disponível pelo Computador");
            return false;
        }

        if (p.getMemoriaRamAlocada() > computador.getMemoriaRam()) {
            System.out.println("Erro: Memoria ram necessaria maior que a disponível pelo Computador");
            return false;
        }

        float tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.printf("Programa " + p.getNome() + ", executado com sucesso! %nTempo de resposta: %.2f segundos %n", tempoExecucao);
        
        return true;
    }

    public Computador getComputador() {
        return this.computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
