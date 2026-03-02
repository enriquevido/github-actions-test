import components.Calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("\n--- CALCULADORA DE OPERACIONES ---");
        System.out.print("Introduce un número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce otro número: ");
        double num2 = sc.nextDouble();

        System.out.print("Selecciona la operación (+ - * /): ");
        String op = sc.next();

        double resultado = calculadora.calcularOperacion(num1, num2, op);
        System.out.print("El resultado es: " + resultado);

        sc.close();
    }
}
