package Clase1;

public class Ejercicio5 {
    // Distancia de metros a millas
    public static double MetrosAMillas(double metros) {
        double metroAKilometro = metros / 1000;

        return metroAKilometro / 0.62;
    }

    public static void main(String[] args) {
        double metros = 1000;

        System.out.println("Metros: " + metros);
        System.out.println("Millas: " + MetrosAMillas(metros));
    }
}
