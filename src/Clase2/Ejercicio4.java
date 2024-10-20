package Clase2;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;

public class Ejercicio4 {

    public static int MenorEnArray(int[] array){
        int menor = array[0];

        for(int i=1; i< array.length; i++){
            if(array[i] < menor){menor = array[i];}
        }

        return  menor;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);

        int mayor = MenorEnArray(arrayAleatorio);
        System.out.println("El menor es: "+ mayor);
    }
}
