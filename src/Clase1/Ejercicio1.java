package Clase1;

public class Ejercicio1 {
    // Area y perimetro de un rectangulo
    public static float AreaRectangulo(float base, float altura) {
        return base * altura;
    }

    public static float PerimetroRectangulo(float base, float altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        float base = 5;
        float altura = 3;

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area del rectangulo: " + AreaRectangulo(base, altura));
        System.out.println("Perimetro del rectangulo: " + PerimetroRectangulo(base, altura));
    }
}
