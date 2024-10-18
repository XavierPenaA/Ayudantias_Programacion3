import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public void menuPrincipal() {
        Pila pila = new Pila();
        Scanner scanner = new Scanner(System.in);
        int opcion = false;

        int opcion;
        do {
            System.out.println("\nElige una opción:");
            System.out.println("1. Agregar Texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar contenido");
            System.out.println("5. Salir");
            System.out.print(">>> Ingrese la opcion <1-5>: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    pila.Ingresar();
                    break;
                case 2:
                    pila.Deshacer();
                    break;
                case 3:
                    pila.Rehacer();
                    break;
                case 4:
                    pila.mostrar();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while(opcion != 5);

    }
}
