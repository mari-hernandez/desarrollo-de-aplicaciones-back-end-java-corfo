package Clase1;

public class Ejercicio2 {
    //Area y perimetro de un circulo
    public static float AreaCirculo(float radio) {
        return (float) (Math.PI * radio * radio);
    }

    public static float PerimetroCirculo(float radio) {
        return (float) (2 * Math.PI * radio);
    }

    public static void main(String[] args) {
        float radio = 5;

        System.out.println("Radio: " + radio);
        System.out.println("Area del circulo: " + AreaCirculo(radio));
        System.out.println("Perimetro del circulo: " + PerimetroCirculo(radio));
    }
}
