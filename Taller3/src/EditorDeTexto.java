import java.util.Scanner;
import java.util.Stack;

public class EditorDeTexto {
    private static StringBuilder texto = new StringBuilder();
    private static final Stack<String> pilaDeshacer = new Stack<>();
    private static final Stack<String> pilaRehacer = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar contenido actual");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el texto: ");
                    String nuevoTexto = scanner.nextLine();
                    agregarTexto(nuevoTexto);
                    break;
                case 2:
                    deshacer();
                    break;
                case 3:
                    rehacer();
                    break;
                case 4:
                    mostrarContenido();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void agregarTexto(String nuevoTexto) {
        pilaDeshacer.push(texto.toString()); // Guardar el estado actual
        texto.append(nuevoTexto);
        pilaRehacer.clear();  // Limpiar la pila de rehacer
        System.out.println("Texto agregado.");
    }

    public static void deshacer() {
        if (!pilaDeshacer.isEmpty()) {
            pilaRehacer.push(texto.toString()); // Guardar el estado actual en rehacer
            texto = new StringBuilder(pilaDeshacer.pop()); // Recuperar el último estado deshecho
            System.out.println("Última acción deshecha.");
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }

    public static void rehacer() {
        if (!pilaRehacer.isEmpty()) {
            pilaDeshacer.push(texto.toString()); // Guardar el estado actual en deshacer
            texto = new StringBuilder(pilaRehacer.pop()); // Recuperar el último estado rehacer
            System.out.println("Última acción rehecha.");
        } else {
            System.out.println("No hay acciones para rehacer.");
        }
    }

    public static void mostrarContenido() {
        System.out.println("Contenido actual del editor:");
        System.out.println(!texto.isEmpty() ? texto.toString() : "Texto vacío.");
    }
}
