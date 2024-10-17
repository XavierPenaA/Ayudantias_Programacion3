import java.util.*;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int op=0;
        editorTexto editor = new editorTexto();

        do {
            System.out.println("Menu Principal ");
            System.out.println("1. Escribir");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Texto");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion");

            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {

                case 1: editor.agregarTexto();break;

                case 2: editor.deshacer();break;

                case 3: editor.rehacer();break;

                case 4: editor.mostrarTexto();break;

                case 5: editor.mostrarEnTiempoReal();break;

                default:
                    System.out.println("Ingrese una opcion valida."); break;
            }
        }while (op!=6);
    }
}
