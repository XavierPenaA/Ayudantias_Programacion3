import java.util.Scanner;

public class SubArrays {
    String[] palabras = new String[]{"manzana", "banana", "naranja", "pera", "uva"};

    void creacion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cadena de la que desee encontrar coincidencias....");
        String cadenaIngresada = input.nextLine();
        String[] nuevasPalabras = new String[5];

        int i;
        for(i = 0; i < 5; ++i) {
            if (palabras[i].contains(cadenaIngresada)) {
                nuevasPalabras[i] = palabras[i];
            }
        }

        for(i = 0; i < 5; ++i) {
            if (nuevasPalabras[i] != null) {
                System.out.print(nuevasPalabras[i] + " ");
            }
        }

    }
}