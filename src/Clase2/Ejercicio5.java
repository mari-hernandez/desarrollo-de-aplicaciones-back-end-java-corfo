package Clase2;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;
import static Clase2.Ejercicio3.MayorEnArray;
import static Clase2.Ejercicio4.MenorEnArray;

public class Ejercicio5 {
    public static int Rango(int[] array){
        int mayor = MayorEnArray(array);
        int menor = MenorEnArray(array);

        return mayor - menor;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);

        int rango = Rango(arrayAleatorio);
        System.out.println("El rango es: "+ rango);
    }
}
