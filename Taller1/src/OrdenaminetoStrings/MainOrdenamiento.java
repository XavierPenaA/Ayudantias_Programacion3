package OrdenaminetoStrings;

import java.util.Arrays;
import java.util.Collections;

public class MainOrdenamiento {
    public static void main(String[] args) {

        String[] nombres = {
                "Juan Pérez",
                "Ana Sánchez",
                "Luis García",
                "María Rodríguez",
                "Pedro Martínez"
        };

        Arrays.sort(nombres);
        System.out.println("Nombres ordenados de A-Z:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        Arrays.sort(nombres, Collections.reverseOrder());
        System.out.println("\nNombres ordenados de Z-A:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

