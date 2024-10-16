import java.util.Scanner;
import java.util.Stack;

public class EditorTexto {
    Stack<String> pilaDeshacer;
    Stack<String> pilaRehacer;
    StringBuilder texto;

    public Stack<String> getPilaDeshacer() {
        return pilaDeshacer;
    }

    public Stack<String> getPilaRehacer() {
        return pilaRehacer;
    }

    public StringBuilder getTexto() {
        return texto;
    }

    public EditorTexto() {
        this.pilaDeshacer = new Stack<>();
        this.pilaRehacer = new Stack<>();
        this.texto = new StringBuilder();
    }

    protected void agregarTexto() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        texto.append(input);
        pilaDeshacer.push(input);
        System.out.println("\"" + input + "\" Agregado");
    }

    protected void deshacer() {
        if(pilaDeshacer.isEmpty()) return;

        String pop = pilaDeshacer.pop();

        texto.delete(
                texto.lastIndexOf(pop),
                texto.lastIndexOf(pop) + pop.length()
        );
        pilaRehacer.push(pop);

        System.out.println("\"" + pop + "\" Deshecho");
    }

    protected void rehacer() {
        if(pilaRehacer.isEmpty()) return;

        String pop = pilaRehacer.pop();
        texto.append(pop);
        pilaDeshacer.push(pop);

        System.out.println("\"" + pop + "\" Rehecho");

    }

    protected void mostrar() {
        System.out.println(
                texto.toString()
        );
    }
}
