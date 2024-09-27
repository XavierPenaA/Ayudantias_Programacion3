import java.util.Scanner;

public class Manipulacion {
    String frase = "juan tiene una bicicleta y juan tiene un coche, pero juan no tiene miedo.";

    // Constructor sin parámetros
    public Manipulacion() {
    }

    public void procesarFrase() {
        char letra = 'b';
        // Mostrar frase original
        System.out.println("Frase original: " + frase);

        // Eliminar todas las letras 'b'
        String fraseSinB = frase.replace("b", "");
        System.out.println("Frase sin 'b': " + fraseSinB);

        // Eliminar el primer substring 'juan'
        String fraseSinPrimerJuan = fraseSinB.replaceFirst("juan", "");
        System.out.println("Frase sin primer 'juan': " + fraseSinPrimerJuan);

        // Separar en palabras y almacenar en un array
        String[] palabras = fraseSinPrimerJuan.split(" ");
        System.out.println("Palabras en la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void main(String[] args) {
        // Crear objeto de Manipulacion y procesar la frase
        Manipulacion manipulacion = new Manipulacion(); // Se elimina el argumento 'b'
        manipulacion.procesarFrase();
    }
}


