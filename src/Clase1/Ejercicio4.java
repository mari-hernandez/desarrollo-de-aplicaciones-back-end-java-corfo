package Clase1;

public class Ejercicio4 {
    // Promedio aritmetico de 3 numeros
    public static float PromedioAritmetico(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Promedio armonico de 3 numeros
    public static float PromedioArmonico(float num1, float num2, float num3) {
        return 3 / ((1 / num1) + (1 / num2) + (1 / num3));
    }

    public static void main(String[] args) {
        float num1 = 5;
        float num2 = 10;
        float num3 = 15;

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("Promedio aritmetico: " + PromedioAritmetico(num1, num2, num3));
        System.out.println("Promedio armonico: " + PromedioArmonico(num1, num2, num3));
    }
}
