package Clase1;

public class Ejercicio16 {
    //Factorial de un numero
    public static int Factorial(int n) {
        if(n==0) {return 1;}
        return n * Factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        int factorialDeN = Factorial(n);
        System.out.println("El factorial de " + n + " es "+ factorialDeN);
    }
}
