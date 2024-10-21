package Clase2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static Clase2.EjercicioB21.ListaAleatorio;

public class EjercicioB27 {
    public static List<Integer> desordenarLista(List<Integer> lista) {
        Random aleatorio = new Random();
        List<Integer> listaDesordenada = new ArrayList<>(lista);

        for (int i = listaDesordenada.size() - 1; i > 0; i--) {
            int j = aleatorio.nextInt(i + 1);
            Collections.swap(listaDesordenada, i, j);
        }

        return listaDesordenada;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaAleatorio = ListaAleatorio(n); // Supongo que esta función genera una lista aleatoria.

        List<Integer> listaDesordenada = desordenarLista(listaAleatorio);

        System.out.println("Lista desordenada: " + listaDesordenada);
    }
}
