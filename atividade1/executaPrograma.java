package atividade1;

public class executaPrograma {
    public static void main(String[] args) {
        Computador maquina = new Computador(16, 500, 6, 12f);
        SistemaOperacional windows = new SistemaOperacional(maquina);
        Programa explorer = new Programa(1, 120, 2, 4, "Explorer");
        Programa vscode = new Programa(2, 100, 3, 5, "Vscode");
        Programa discord = new Programa(6, 200, 4, 2, "Discord");

        windows.executarPrograma(explorer);
        windows.executarPrograma(vscode);
        windows.executarPrograma(discord);
    }
}
