import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    EditorTexto editor = new EditorTexto();
    public void menuPrincipal() {
        int op;
        do {

            System.out.println("\n----Menu----");
            System.out.println("1. Agregar texto");
            System.out.println("2. Deshacer la ultima accion");
            System.out.println("3. Rehacer la ultima accion");
            System.out.println("4. Mostrar el contenido actual");
            System.out.println("5. Salir");
            System.out.print("> ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    editor.agregar();
                    break;
                case 2:
                    editor.deshacer();
                    break;
                case 3:
                    editor.rehacer();
                    break;
                case 4:
                    editor.mostrar();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
            }
        }while (op!=5);
    }
}
