package Clase1;

public class Ejercicio6 {
    // Convertir temperatura de grados Celsius a Fahrenheit
    public static double CelsiusAFahrenheit(float celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void main(String[] args) {
        float celsius = 37;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + CelsiusAFahrenheit(celsius));
    }
}
