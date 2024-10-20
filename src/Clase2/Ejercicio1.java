package Clase2;

import java.util.Random;

public class Ejercicio1 {
    public static int[] ArrayAleatorio(int N){
        Random aleatorio = new Random();

        int[] Array = new int[N];

        for(int i=0; i<N; i++){
            Array[i] = aleatorio.nextInt(100);
        }
        return  Array;
    }

    public static void ImprimirArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print( array[i] + ",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);
    }
}
