package Clase2;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;
import static Clase2.Ejercicio2.PromedioArray;

public class Ejercicio6 {
    public static double DesviacionEstandarArray(int[] array){
        double promedio = PromedioArray(array);
        double factor1 = 0;

        for(int i=0; i< array.length; i++){
            factor1 += Math.pow(array[i]-promedio, 2);
        }

        double factor2 = factor1/array.length;

        return Math.sqrt(factor2);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);

        double desviacion = DesviacionEstandarArray(arrayAleatorio);
        System.out.println("La desviacio estandar es: "+ desviacion);
    }
}
