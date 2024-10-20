package Clase1;

public class Ejercicio13 {
    // Determinar si un numero es primo
    public static boolean EsPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (EsPrimo(i)) {
                System.out.println(i + " es primo");
            }
        }
    }

}
