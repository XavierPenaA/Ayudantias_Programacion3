import java.util.Scanner;

/*
 *  Manipulación de Strings - Kenneth Ávila
 * */

public class Menu implements Cloneable{
    public int mostrarMenuPrincipal() {
        System.out.println("-----------------------");
        System.out.println("1. Búsqueda en Strings");
        System.out.println("2. Creacion de Subarrays");
        System.out.println("3. Manipulación en Strings");
        System.out.println("4. Ordenamiento en Strings");
        System.out.println("5. Salir");
        System.out.println("-----------------------");

        return validarOpcion(1, 5);
    }

    public static int validarOpcion(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            opcion = scanner.nextInt();
            if (opcion < min && opcion > max)
                System.out.println("Opcion invalida");
        } while (opcion < min && opcion > max);
        return opcion;
    }
}
