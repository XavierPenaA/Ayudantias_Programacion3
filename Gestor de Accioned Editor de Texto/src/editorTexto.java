import java.util.Scanner;
import java.util.Stack;

public class editorTexto {

    Scanner entrada = new Scanner(System.in);
    Stack<String> piladeshacer = new Stack<>();
    Stack<String> pilarehacer = new Stack<>();
    StringBuilder texto = new StringBuilder();

    public editorTexto() {

        this.texto = new StringBuilder();
    }

    public void agregarTexto(){

        pilarehacer.clear();
        System.out.println("Texto a agregar: ");
        String nuevoTexto = entrada.nextLine();

        piladeshacer.push(texto.toString());
        texto.append(" ");
        texto.append(nuevoTexto) ;
    }

    public void deshacer(){

        if(piladeshacer.isEmpty())
            System.out.println("no hay mas por deshacer");
        else{

            pilarehacer.push(texto.toString());
            texto = new StringBuilder(piladeshacer.pop());
        }
    }

    public void rehacer(){

        if(pilarehacer.isEmpty())
            System.out.println("No hay mas por rehacer");
        else{

            piladeshacer.push(texto.toString());
            texto = new StringBuilder(pilarehacer.pop());
        }
    }

    public void mostrarTexto(){

        System.out.println(texto);
    }

    public void mostrarEnTiempoReal(){

        int op = 0;
        do {
            System.out.printf("Presione 1 para agregar texto\n2 para deshacer\n3 para rehacer\n5 salir\n\n");
            mostrarTexto();

            op = entrada.nextInt();
            entrada.nextLine();

            switch (op){

                case 1: agregarTexto(); break;
                case 2: deshacer(); break;
                case 3: rehacer(); break;
            }
        }while(op!=5);
    }
}
