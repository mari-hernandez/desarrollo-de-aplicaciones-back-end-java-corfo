package Clase2;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;
import static Clase2.Ejercicio2.PromedioArray;
import static Clase2.Ejercicio6.DesviacionEstandarArray;

public class Ejercicio8 {
    public static int[][] MatrizDiferenciaElementosArray(int[] array){
        int[][] matriz = new int[array.length][array.length];

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                matriz[i][j] = array[j]-array[i];
            }
        }

        return matriz;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arrayAleatorio = ArrayAleatorio(n);
        System.out.println("Array original: ");
        ImprimirArray(arrayAleatorio);

        int[][] matrizDiferencia = MatrizDiferenciaElementosArray(arrayAleatorio);

        System.out.println("Matriz diferencia: ");
        for(int i = 0; i<matrizDiferencia.length; i++){
            ImprimirArray(matrizDiferencia[i]);
        }
    }
}
