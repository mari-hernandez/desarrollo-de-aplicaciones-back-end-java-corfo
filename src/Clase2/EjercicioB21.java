package Clase2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EjercicioB21 {
    public static List<Integer> ListaAleatorio(int N){
        Random aleatorio = new Random();

        List<Integer> listaNumerosAleatorios = new ArrayList<>();

        for(int i=0; i<N; i++){
            listaNumerosAleatorios.add(aleatorio.nextInt(50));
        }

        System.out.println("La lista es: "+ listaNumerosAleatorios);
        return listaNumerosAleatorios;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaAleatorio = ListaAleatorio(n);
    }
}
