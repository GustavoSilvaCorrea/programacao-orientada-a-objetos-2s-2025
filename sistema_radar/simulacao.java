public class simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ABC123", 0, 76, "Comodoro");
        Radar radar = new Radar("pardal", 60, "Pistão Sul");

        opala.acelerar(); //5
        opala.acelerar(); //10
        opala.acelerar(); //15
        opala.acelerar(); //20
        opala.acelerar(); //25
        opala.acelerar(); //30
        opala.acelerar(); //35
        opala.acelerar(); //40
        opala.acelerar(); //45
        opala.acelerar(); //50
        opala.acelerar(); //55
        opala.acelerar(); //60

        radar.avaliarVelocidade(opala);

        opala.acelerar(); //65

        radar.avaliarVelocidade(opala);
    }
}
