package Clase1;

import java.lang.reflect.Array;

public class Ejercicio9 {
    // Convertir segundo en horas, minutos y segundos
    public static int[] SegundosAFormato(double segundosTotales) {
        int horas = (int) (segundosTotales / 3600);
        int minutos = (int) ((segundosTotales % 3600) / 60);
        int segundos = (int) (segundosTotales % 60);

        return new int[]{horas, minutos, segundos};

    }

    public static void main(String[] args) {
        double segundos = 3661;

        int[] horasMinutosSegundos =  SegundosAFormato(segundos);
        System.out.printf("Horas: %d%n", horasMinutosSegundos[0]);
        System.out.printf("Minutos: %d%n", horasMinutosSegundos[1]);
        System.out.printf("Segundos: %d%n", horasMinutosSegundos[2]);

    }
}
