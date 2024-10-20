package Clase1;

public class Ejercicio10 {
    // Energía cinetica de un objeto
    public static double EnergiaCinetica(double masa, double velocidad) {
        return (masa * velocidad * velocidad) / 2;
    }

    public static void main(String[] args) {
        double masa = 10;
        double velocidad = 5;

        System.out.println("Masa: " + masa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Energia cinetica: " + EnergiaCinetica(masa, velocidad));
    }
}
