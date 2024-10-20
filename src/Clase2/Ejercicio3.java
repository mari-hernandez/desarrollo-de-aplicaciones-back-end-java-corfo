package Clase2;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;

public class Ejercicio3 {

    public static int MayorEnArray(int[] array){
        int mayor = array[0];

        for(int i=1; i< array.length; i++){
            if(array[i] > mayor){mayor = array[i];}
        }

        return  mayor;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);

        int mayor = MayorEnArray(arrayAleatorio);
        System.out.println("El mayor es: "+ mayor);
    }
}
