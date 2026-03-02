package components;

public class Calculadora {
    private double numero1;
    private double numero2;
    private String operacion;

    public Calculadora(){
    }

    public double calcularOperacion(double numero1, double numero2, String operacion){
        switch (operacion){
            case "+": return numero1 + numero2;
            case "-": return numero1 - numero2;
            case "*": return numero1 * numero2;
            case "/": return numero1 / numero2;
            default: throw new IllegalArgumentException("Operación inválida");
        }
    }
}
