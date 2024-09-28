import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  Manipulación de Strings - Kenneth Ávila
 * */
public class Main {

    public static void main(String[] args) {
        int opcion;
        Menu menu = new Menu();

        do {
            opcion = menu.mostrarMenuPrincipal();
            manejarOpcion(opcion);
        } while (opcion != 0);
    }

    private static void manejarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ingresoBusquedaString();
                break;
            case 2:
                creacionSubArrays();
                break;
            case 3:
                manipulacionStrings();
                break;
            case 4:
                ordenarStrings();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }

    private static void ingresoBusquedaString() {
        String[] oraciones = {
                "Hola Juan, cómo estás?",
                "5 manzanas y 3 peras",
                "Esta cadena no tiene números"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el caracter: ");
        String busqueda = scanner.next();
        int[] recurrencias = buscarRecurrencias(busqueda, oraciones);

        mostrarRecurrencias(oraciones, busqueda, recurrencias);
    }

    private static int[] buscarRecurrencias(String busqueda, String[] oraciones) {
        int[] recurrencias = new int[3];
        int oracionActual = 0;

        // Itera a traves de todas las oraciones
        for (String oracion : oraciones) {
            // Itera a traves de cada letra de la oración
            if (oracion.contains(busqueda))
                recurrencias[oracionActual]++;

            oracionActual++;
        }

        return recurrencias;
    }

    private static void mostrarRecurrencias(String[] oraciones, String busqueda, int[] recurrencias) {
        int oracionActual = 0;

        for (String oracion : oraciones) {
            System.out.print("\n" + oracion + "->" + "'" + busqueda + "':" + recurrencias[oracionActual]);
            if (recurrencias[oracionActual] == 0)
                System.out.println("- No existen coincidencias");

            oracionActual++;
        }
        System.out.print("\n");
    }

    private static void creacionSubArrays() {
        String[] palabras = {
                "manzana", "banana", "naranja", "pera", "uva"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el término de búsqueda: ");
        String busqueda = scanner.next();

        ArrayList<String> coincidencias = crearSubArrayCoincidencias(busqueda, palabras);
        mostrarCoincidencias(busqueda, coincidencias);
    }

    private static ArrayList<String> crearSubArrayCoincidencias(String busqueda, String[] palabras) {
        ArrayList<String> coincidencias = new ArrayList<>();

        for (String palabra : palabras) {
            if (palabra.contains(busqueda))
                coincidencias.add(palabra);
        }

        return coincidencias;
    }

    private static void mostrarCoincidencias(String busqueda, ArrayList<String> palabras) {
        System.out.println("'" + busqueda + "':");

        if (palabras.isEmpty()) {
            System.out.println("No existen coincidencias");
            return;
        }

        for (String palabra : palabras)
            System.out.print(palabra + ", ");

        System.out.print("\n");
    }

    private static void manipulacionStrings() {
        //Eliminar todas las b
        //Eliminar primer Juan
        // Separar cada palabra en un array de strings
        String frase = "Juan tiene una bicicleta y Juan tiene un coche, pero juan no tiene miedo.";
        String fraseEliminada = frase.replaceFirst("Juan", "").replace('a', ' ');

        //Separar según espacios en blanco
        String[] separados = frase.split("\\s+");

        System.out.println("Original: " + frase);
        System.out.println("Eliminados: " + fraseEliminada);
        System.out.println("Separados: ");
        for (String separado : separados)
            System.out.println(separado);
    }

    private static void ordenarStrings() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Juan Pérez");
        frases.add("Ana Sánchez");
        frases.add("Luis García");
        frases.add("María Rodríguez");
        frases.add("Pedro Martínez");

        System.out.println("Desordenado:" + frases);
        Collections.sort(frases);
        System.out.println("Ordenado A-Z" + frases);
        Collections.reverse(frases);
        System.out.println("Ordenado Z-A" + frases);

    }

}
