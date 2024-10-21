package Clase2;

import java.util.ArrayList;
import java.util.List;

import static Clase2.EjercicioB21.ListaAleatorio;

public class EjercicioB22 {
    public static List<Integer> ElementosUnicosLista(List<Integer> lista){

        List<Integer> ElementosUnicos = new ArrayList<>();

        for(int i=0; i<lista.size(); i++){
            int elemento = lista.get(i);
            if ( !ElementosUnicos.contains(elemento)){
                ElementosUnicos.add(elemento);
            }
        }
        return ElementosUnicos;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaAleatorio = ListaAleatorio(n);
        List<Integer> listaUnicos = ElementosUnicosLista(listaAleatorio);

        System.out.println("La lista de unicos es: "+ listaUnicos);
    }
}
