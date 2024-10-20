package Clase1;

public class Ejercicio8 {
    // Distancia Geodesica entre dos puntos
    public static double gradosARadianes(double grados){
        return grados * Math.PI / 180;
    }

    public static double distanciaGeodesica(double lon1, double lat1, double lon2, double lat2) {
        final int R = 6371;

        lon1 = gradosARadianes(lon1);
        lat1 = gradosARadianes(lat1);
        lon2 = gradosARadianes(lon2);
        lat2 = gradosARadianes(lat2);

        double factor1 = Math.pow((lon2-lon1)*Math.cos((lat1+lat2)/2), 2);
        double factor2 = Math.pow(lat2 - lat1, 2);

        return R * Math.sqrt(factor1 + factor2);
    }

    public static void main(String[] args) {
        double lon1 = -70.6483;
        double lat1 = -33.4569;
        double lon2 = -74.0060;
        double lat2 = 40.7128;

        double distancia = distanciaGeodesica(lon1, lat1, lon2, lat2);
        System.out.printf("La distancia geodésica es: %.2f km%n", distancia);

    }

}
