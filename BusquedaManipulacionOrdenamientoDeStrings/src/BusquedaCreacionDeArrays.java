import java.util.Scanner;

public class BusquedaCreacionDeArrays {
    String[] palabras = new String[]{"manzana", "banana", "naranja", "pera", "uva"};
    String termino; // String que almacena el término
    String[] agrupacion = new String[5]; // Arreglo corregido
    Scanner entrada = new Scanner(System.in);

    void crearArray() {
        System.out.println("Ingrese término para encontrar palabras:_");
        termino = entrada.nextLine();

        for (int i = 0; i < 5; i++) {
            if (palabras[i].contains(termino)) {
                agrupacion[i] = palabras[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            if (agrupacion[i] != null) {
                System.out.println(agrupacion[i] + " ");
            }
        }
    }
}

