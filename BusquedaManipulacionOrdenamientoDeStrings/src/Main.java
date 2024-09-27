//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases involucradas
        Busqueda busqueda = new Busqueda();
        BusquedaCreacionDeArrays busquedaCreacionDeArrays = new BusquedaCreacionDeArrays();
        Manipulacion manipulacion = new Manipulacion(); // Se elimina el argumento 'b'
        Ordenamiento ordenamiento = new Ordenamiento();

        // Función menú principal
        menuPrincipal(busqueda, busquedaCreacionDeArrays, manipulacion, ordenamiento);
    }

    // Método para mostrar y manejar el menú principal
    public static void menuPrincipal(Busqueda busqueda,
                                     BusquedaCreacionDeArrays busquedaCreacionDeArrays,
                                     Manipulacion manipulacion,
                                     Ordenamiento ordenamiento) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.- Búsqueda en strings");
            System.out.println("2.- Búsqueda y creación de sub-arrays");
            System.out.println("3.- Manipular strings");
            System.out.println("4.- Ordenar strings");
            System.out.println("5.- Salir");
            System.out.print("Ingresar la opción entre <1-5>: ");
            opc = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opc) {
                case 1:
                    busqueda.contarIncidencias();
                    break;
                case 2:
                    busquedaCreacionDeArrays.crearArray();
                    break;
                case 3:
                    manipulacion.procesarFrase();
                    break;
                case 4:
                    ordenamiento.ordenar();
                    ordenamiento.ordenarBack();
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opc != 5);
    }
}
