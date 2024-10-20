package Clase1;

public class Ejercicio17 {
    // Sucesion de Fibonacci
    public static void main(String[] args) {
        int max = 50;
        int[] sucesion = new int[50];

        for(int i = 0; i < sucesion.length ; i ++){
            if(i == 0) {sucesion[i] = 0;}
            else if(i == 1) {sucesion[i] = 1;}
            else {
                sucesion[i] = sucesion[i-1] + sucesion[i-2];
            }
            System.out.println(sucesion[i]);
        }

    }
}
