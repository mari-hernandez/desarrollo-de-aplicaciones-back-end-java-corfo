package Clase2;

import java.util.Random;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;

public class Ejercicio2 {

    public static double PromedioArray(int[] array){
        double promedio = 0;

        for(int i=0; i< array.length; i++){
            promedio += array[i];
        }

        return  promedio / array.length;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);

        double promedio = PromedioArray(arrayAleatorio);
        System.out.println("El promedio es: "+ promedio);
    }
}
