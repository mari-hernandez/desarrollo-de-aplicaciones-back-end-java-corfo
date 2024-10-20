package Clase1;

public class Ejercicio15 {
    // Determinar si una cadena es palindromo
    public static Boolean esPalindromo(String cadena) {
        int puntero1 = cadena.length() - 1;
        int puntero2 = 0;
        while (puntero1 >= 0) {
            char letra1 = cadena.charAt(puntero1);
            char letra2 = cadena.charAt(puntero2);
            if (letra1 == letra2) {
                puntero1-=1;
                puntero2+=1;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String cadena = "HannaH";
        Boolean esPalindromo = esPalindromo(cadena);
        if(esPalindromo){
            System.out.println("La cadena '" + cadena + "' es palindromo");
        }
        else{
            System.out.println("La cadena '" + cadena + "' NO es palindromo");
        }
    }
}
