import java.util.Scanner;
import java.util.Stack;

public class EditorTexto {
    Scanner sc = new Scanner(System.in);
    private StringBuilder contenido = new StringBuilder();

    Stack<String> Deshacer = new Stack<>();
    Stack<String> Rehacer = new Stack<>();

    public void agregar(){
        String texto;
        System.out.print("Ingrese texto > ");
        texto = sc.nextLine();

        //Guardamos el estado actual de la pila
        Deshacer.push(contenido.toString());
        Rehacer.clear(); // limpio ya que agregue nuevo texto
        //Añadimos el texto al contenido
        contenido.append(texto).append(" ");

    }

    public void deshacer (){
        if (!Deshacer.isEmpty()){
            //Guardamos el estado actual de la Pila antes de deshacer
            Rehacer.push(contenido.toString());

            //Estado anterior (pop de Deshacer)
            contenido = new StringBuilder(Deshacer.pop());
        }else {
            System.out.println("No hay accion por deshacer");
        }

    }

    public void rehacer (){
        if(!Rehacer.isEmpty()){
            //Guardo el estado actual antes de rehacer
           Deshacer.push(contenido.toString());

           //Restauro el estado (pop de Rehacer)
            contenido= new StringBuilder(Rehacer.pop());
        }
        else {
            System.out.println("No hay accion por reahcer");
        }
    }

    public void mostrar (){
        System.out.print(contenido);

    }



}
