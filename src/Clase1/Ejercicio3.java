package Clase1;

public class Ejercicio3 {
    // Area y volumen de un cilindro

    public static double AreaCilindro(double radio, double altura) {
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaCirculo = 2 * Math.PI * radio * radio;

        return areaLateral + areaCirculo;
    }

    public static double VolumenCilindro(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    public static void main(String[] args) {
        double radio = 5;
        double altura = 10;

        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);
        System.out.println("Area del cilindro: " + AreaCilindro(radio, altura));
        System.out.println("Volumen del cilindro: " + VolumenCilindro(radio, altura));
    }

}
