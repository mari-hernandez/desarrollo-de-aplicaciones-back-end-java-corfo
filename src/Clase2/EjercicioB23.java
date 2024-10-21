package Clase2;

import java.util.ArrayList;
import java.util.List;

import static Clase2.EjercicioB21.ListaAleatorio;

public class EjercicioB23 {
    public static List<Integer> InvertirElementosLista(List<Integer> lista){

        List<Integer> ListaInvertida = new ArrayList<>();

        for(int i=lista.size()-1; i>=0; i--){
            int elemento = lista.get(i);
            ListaInvertida.add(elemento);
        }
        return ListaInvertida;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaAleatorio = ListaAleatorio(n);
        List<Integer> listaInvertida = InvertirElementosLista(listaAleatorio);

        System.out.println("La lista invertida es: "+ listaInvertida);
    }
}
