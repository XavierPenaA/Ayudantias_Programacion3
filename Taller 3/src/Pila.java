public class Pila {
    // Atributos
    private String[] array;   // El array que representa la pila (sin acceso)
    private int cima;         // Apunta al último elemento (-1 si está vacía)
    private final int capacidad;  // Capacidad de solo lectura de la pila

    // Constructor que acepta una capacidad específica
    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.array = new String[capacidad];
        this.cima = -1;  // La pila comienza vacía
    }

    // Constructor por defecto con una capacidad de 10
    public Pila() {
        this(10);  // Por defecto, la capacidad es 10
    }

    // Método para borrar toda la pila (borrarTodo)
    public void borrarTodo() {
        this.cima = -1;  // Reiniciar la pila estableciendo cima a -1
    }

    // Metodo para apilar un elemento en la pila (apilar)
    public boolean apilar(String elemento) {
        if (cima < capacidad - 1) {  // Comprobar si la pila no está llena
            array[++cima] = elemento;
            return true;
        } else {
            System.out.println("¡La pila está llena! No se puede apilar el elemento.");
            return false;
        }
    }

    // Método para desapilar un elemento de la pila (desapilar)
    public String desapilar() {
        if (cima >= 0) {  // Comprobar si la pila no está vacía
            return array[cima--];
        } else {
            System.out.println("¡La pila está vacía! No se puede desapilar ningún elemento.");
            return null;
        }
    }

    // Método para obtener el tamaño actual de la pila
    public int tamaño() {
        return cima + 1;
    }

    // Getter para la capacidad (solo lectura)
    public int getCapacidad() {
        return capacidad;
    }

    // Método para mostrar los elementos de la pila (para propósitos de prueba)
    @Override
    public String toString() {
        if (cima == -1) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= cima; i++) {
            sb.append(array[i]);
            if (i < cima) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}