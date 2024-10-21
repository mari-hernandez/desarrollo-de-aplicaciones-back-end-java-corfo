package Clase2;

import java.util.Stack;

public class EjercicioB25 {
    public static String InvertirCadenaUsandoPila(String cadena){

        Stack<Character> pila= new Stack();

        for(int i=0; i< cadena.length(); i++){
            pila.push(cadena.charAt(i));
        }

        String cadenaInvertida = new String();
        for(int i=0; i< cadena.length(); i++){
            cadenaInvertida+= pila.pop();
        }

        return cadenaInvertida;
    }

    public static void main(String[] args) {
        int n = 10;
        String cadena = "Prueba invertir ProyectoA";
        System.out.println("La cadena inicial es: "+ cadena);

        String cadenaInvertida = InvertirCadenaUsandoPila(cadena);

        System.out.println("La cadena invertida es: "+ cadenaInvertida);
    }
}
