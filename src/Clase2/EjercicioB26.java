package Clase2;

import java.util.Stack;

public class EjercicioB26 {
    public static Boolean serieValida(String cadena){

        Stack<Character> pila= new Stack();

        for(int i=0; i< cadena.length(); i++){
            char elemento = cadena.charAt(i);
            if (elemento=='('){
                pila.push(elemento);
            }
            else if (elemento == ')'){
                if (pila.empty()){return false;}
                pila.pop();
            }
        }

        return pila.empty();

    }

    public static void main(String[] args) {
        int n = 10;
        String serieParentesis = ")(())";
        System.out.println("La cadena inicial es: "+ serieParentesis);

        Boolean serieValida = serieValida(serieParentesis);
        if(serieValida){
            System.out.println("La cadena es valida");
        }
        else{
            System.out.println("La cadena NO es valida");
        }

    }
}
