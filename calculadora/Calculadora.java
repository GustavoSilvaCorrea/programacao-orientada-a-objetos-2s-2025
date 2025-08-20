package calculadora;

public class Calculadora {
    public Double numeroA;
    public Double numeroB;

    public void soma(){
        Double resultadoSoma = this.numeroA + this.numeroB;
        
        System.out.println(this.numeroA + " + " + this.numeroB + " = " + resultadoSoma);
    }

    public void subtracao(){
        Double resultadoSub = this.numeroA - this.numeroB;

        System.out.println(this.numeroA + " - " + this.numeroB + " = " + resultadoSub);
        
    }
    public void multiplicacao(){
        Double resultadoMult = this.numeroA * this.numeroB;

        System.out.println(this.numeroA + " x " + this.numeroB + " = " + resultadoMult);

    }
    public void divisao(){
        Double resultadoDiv = this.numeroA / this.numeroB;

        System.out.println(this.numeroA + " / " + this.numeroB + " = " + String.format("%.2f", resultadoDiv));

    }
}