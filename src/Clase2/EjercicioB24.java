package Clase2;

import java.util.ArrayList;
import java.util.List;

import static Clase2.EjercicioB21.ListaAleatorio;

public class EjercicioB24 {
    public static List<Integer> InterseccionListas(List<Integer> lista1, List<Integer> lista2){

        List<Integer> ListaInterseccion = new ArrayList<>();

        for(int i=lista1.size()-1; i>=0; i--){
            int elemento = lista1.get(i);
            if(lista2.contains(elemento) && !ListaInterseccion.contains(elemento)){
                ListaInterseccion.add(elemento);
            }
        }
        return ListaInterseccion;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaAleatorio1 = ListaAleatorio(n);
        List<Integer> listaAleatorio2 = ListaAleatorio(n);

        List<Integer> listaInterseccion = InterseccionListas(listaAleatorio1, listaAleatorio2);

        System.out.println("La lista interseccion es: "+ listaInterseccion);
    }
}
