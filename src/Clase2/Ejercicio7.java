package Clase2;

import static Clase2.Ejercicio1.ArrayAleatorio;
import static Clase2.Ejercicio1.ImprimirArray;
import static Clase2.Ejercicio2.PromedioArray;
import static Clase2.Ejercicio6.DesviacionEstandarArray;

public class Ejercicio7 {
    public static double CoeficienteVariacionArray(int[] array){
        double desviacionEstandar = DesviacionEstandarArray(array);

        double valorAbsolutoMedia = Math.abs(PromedioArray(array));

        return desviacionEstandar/valorAbsolutoMedia;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arrayAleatorio = ArrayAleatorio(n);
        ImprimirArray(arrayAleatorio);

        double CV = CoeficienteVariacionArray(arrayAleatorio);
        System.out.println("La coeficiente de variacion es: "+ CV);
    }
}
