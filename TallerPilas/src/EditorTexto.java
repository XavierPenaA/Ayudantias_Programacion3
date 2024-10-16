import java.util.Stack;

public class EditorTexto {
    private StringBuilder contenido;
    private Stack<String> pilaHacer;
    private Stack<String> pilaDeshacer;

    public EditorTexto(){
        contenido = new StringBuilder();
        pilaHacer = new Stack<>();
        pilaDeshacer = new Stack<>();
    }

    public void agregarTexto(String texto){
        pilaHacer.push(contenido.toString()); //se guarda el estado actual en la pila
        contenido.append(texto); //agrega el texto
        pilaDeshacer.clear(); //se limpia la pila deshacer
    }

    public void deshacerTexto(){
        if(!pilaHacer.isEmpty()){
            pilaDeshacer.push(contenido.toString()); //guarda el estado actual de deshacer
            contenido = new StringBuilder(pilaHacer.pop()); //llega al ultimo estado desde hacer
        }else {
            System.out.println("No se puede deshacer el texto");
        }
    }

    public void rehacerTexto(){
        if (!pilaDeshacer.isEmpty()){
            pilaHacer.push(contenido.toString());//guarda el estado actual de hacer
            contenido = new StringBuilder(pilaDeshacer.pop());//llega al ultimo estado desde deshacer
        }else{
            System.out.println("No se puede rehacer el texto");
        }
    }

    public String mostrar(){
        return contenido.toString();
    }

}


