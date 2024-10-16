import java.util.Scanner;

public class Menu {
    public void menu(){
        int opc = 0;
        Scanner input = new Scanner(System.in);
        EditorTexto editor = new EditorTexto();
        while (opc != 5){
            System.out.println("=====<MENU>====");
            System.out.println("1. Agregar texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar");
            System.out.println("5. Salir");
            opc = input.nextInt();
            input.nextLine();

            switch (opc){
                case 1:
                    agregarTexto(editor);
                    break;
                case 2:
                    deshacer(editor);
                    break;
                case 3:
                    rehacer(editor);
                    break;
                case 4:
                    mostrar(editor);
                    break;
                case 5:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Opcion invalida...");
                    break;
            }
        }
    }

    private void agregarTexto(EditorTexto E){
        Scanner input = new Scanner(System.in);
        String aux;
        System.out.println("Ingrese una palabra: ");
        aux = input.nextLine();
        if (E.pilaPrincipal.isEmpty()){
            E.pilaPrincipal.push(aux);
        }else {
            aux = E.pilaPrincipal.peek().concat(aux);
            E.pilaPrincipal.push(aux);
        }

    }

    private void deshacer(EditorTexto E){
        if (E.pilaPrincipal.isEmpty()){
            System.out.println("No existen elementos que eliminar...");

        }else {
            E.pilaPapeleria.push(E.pilaPrincipal.pop());
        }
    }

    private void rehacer(EditorTexto E){
        if (E.pilaPapeleria.isEmpty()){
            System.out.println("No existen elementos para rehacer....");

        }else {
            E.pilaPrincipal.push(E.pilaPapeleria.pop());

        }
    }

    private void mostrar(EditorTexto E){
        if (E.pilaPrincipal.isEmpty()){
            System.out.println("No existen elementos en la pila...");
        }else {
            System.out.println(E.pilaPrincipal.peek());
        }
    }
}
