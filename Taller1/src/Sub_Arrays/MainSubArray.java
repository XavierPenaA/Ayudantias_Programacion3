package Sub_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSubArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] frutas = {"manzana", "banana", "naranja", "pera", "uva"};

        System.out.println("Ingrese el término de búsqueda:");
        String busqueda = entrada.nextLine();

        String[] subArray = crearSubArray(frutas, busqueda);

        if (subArray.length > 0) {

            System.out.println("Resultados de la búsqueda:");
            for (String fruta : subArray) System.out.println(fruta);

        } else System.out.println("No se encontraron coincidencias.");

    }

    private static String[] crearSubArray(String[] original, String busqueda) {
        ArrayList<String> coincidencias = new ArrayList<>();

        for (String elemento : original) {
            if (elemento.contains(busqueda)) {
                coincidencias.add(elemento);
            }
        }

        return coincidencias.toArray(new String[0]);
    }
}
