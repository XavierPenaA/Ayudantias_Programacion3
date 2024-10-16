import java.util.Scanner;
import java.util.Stack;

public class Main  {
    static Stack<String> hacer = new Stack<>();
    static Stack<String> deshacer = new Stack<>();
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int opc;

        do {
            System.out.println("1. Agregar texto");
            System.out.println("2. Deshacer la última acción");
            System.out.println("3. Rehacer la última acción deshecha");
            System.out.println("4. Mostrar el contenido actual");
            System.out.println("5. Salr");

            opc = tecla.nextInt();
            tecla.nextLine();

            switch(opc) {
                case 1: agregarTexto();break;
                case 2: deshacerAccion();break;
                case 3: rehacerAccion(); break;
                case 4: mostrarContenido(); break;
            }

        } while(opc != 5);
    }

    public static void agregarTexto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el texto:");
        String texto = entrada.nextLine();
        hacer.push(texto);
    }

    public static void deshacerAccion() {
       deshacer.push(hacer.pop());
    }

    public static void rehacerAccion() {
        if(!deshacer.isEmpty()) {
            hacer.push(deshacer.peek());
            deshacer.pop();
        }
    }

    public static void mostrarContenido() {
        if(hacer.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("El contenido de la pila es: " + hacer);
        }
    }
}