package ministeriofazenda;

public class secretariaFazenda {
    public static void main(String[] args) {
        Municipio brasilia = new Municipio("Brasilia", "DF", 65.5);

        Apartamento apt = new Apartamento(brasilia, 52, true, 1);
        System.out.println("IPTU R$: " + apt.calcularIPTU());

        Casa casa = new Casa(brasilia, 100, 3);
        System.out.println("IPTU R$: " + casa.calcularIPTU());

        Chacara chacara = new Chacara(brasilia, 1000, 10, false);
        System.out.println("IPTU R$: " + chacara.calcularIPTU());
        
    }
}
