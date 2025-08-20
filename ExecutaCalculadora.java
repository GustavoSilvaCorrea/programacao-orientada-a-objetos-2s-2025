import calculadora.Calculadora;
public class ExecutaCalculadora {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();

        calc1.numeroA = 2.0;
        calc1.numeroB = 3.0;

        calc1.soma();
        calc1.subtracao();
        calc1.multiplicacao();
        calc1.divisao();
    }
}
