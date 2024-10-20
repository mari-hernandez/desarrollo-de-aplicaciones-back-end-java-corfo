package Clase1;

public class Ejercicio7 {
    // Distancia euclidiana
    public static double DistanciaEuclidiana(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 4;
        double y2 = 5;

        System.out.println("Punto 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Punto 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Distancia euclidiana: " + DistanciaEuclidiana(x1, y1, x2, y2));
    }
}
