package Clase1;

public class Ejercicio14 {
    // Invertir order cadena de texto
    public static String InvertirCadena(String cadena) {
        String newCadena = "";
        int i = cadena.length() - 1;
        while (i >= 0) {
            char letra = cadena.charAt(i);
            newCadena += letra;
            i -= 1;
        }
        return newCadena;
    }


    public static void main(String[] args) {
        String cadena = "Hola mundo";
        String cadenaIversa = InvertirCadena(cadena);

        System.out.println("La cadena es: " + cadena);
        System.out.println("La cadena invertida es: " + cadenaIversa);
    }
}
