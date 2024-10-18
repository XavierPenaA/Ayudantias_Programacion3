import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pila {
    private StringBuilder frase = new StringBuilder();
    private Stack<String> papelera = new Stack();
    private Stack<String> pila = new Stack();
    static Scanner scanner;

    public Pila() {
    }

    public void Ingresar() {
        System.out.println("Ingrese: ");
        String entrada = scanner.nextLine();
        this.frase.append(entrada);
        this.pila.push(entrada);
        System.out.println("frase: " + String.valueOf(this.frase));
    }

    public void Rehacer() {
        if (this.papelera.isEmpty()) {
            System.out.println("No hay nada");
        } else {
            this.pila.push((String)this.papelera.pop());
            this.frase.append((String)this.pila.peek());
            System.out.println("++" + (String)this.pila.peek());
        }

    }

    public void Deshacer() {
        if (this.pila.isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            String deshacer = (String)this.pila.pop();
            this.papelera.push(deshacer);
            this.frase = new StringBuilder();
            Iterator var2 = this.pila.iterator();

            while(var2.hasNext()) {
                String s = (String)var2.next();
                this.frase.append(s);
            }

            PrintStream var10000 = System.out;
            String var10001 = (String)this.papelera.peek();
            var10000.println("sale: " + var10001 + ".." + deshacer);
            var10000 = System.out;
            var10001 = (String)this.pila.peek();
            var10000.println("Queda: " + var10001 + ".." + String.valueOf(this.frase));
        }

    }

    public void mostrar() {
        if (this.pila.isEmpty()) {
            System.out.println("No hay nada que mostrar");
        } else {
            System.out.println(this.frase);
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
