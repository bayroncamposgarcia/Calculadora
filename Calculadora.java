import java.util.Scanner;

public class Calculadora {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        } else {
            return a / b;
        }
    }

    public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora en Java");
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static int calcular(int a, int b, int operacion) {
        switch (operacion) {
            case 1:
                return suma(a, b);
            case 2:
                return resta(a, b);
            case 3:
                return multiplicacion(a, b);
            case 4:
                return division(a, b);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}