package Manipulacion_Strings;

public class MainManipulacion {
    public static void main(String[] args) {
      
        String frase = "juan tiene una bicicleta y juan tiene un coche, pero juan no tiene miedo.";

        // 1. Eliminar todas las letras 'b' del string
        String SubString1 = frase.replace("b", "");
        System.out.println("Frase sin 'b': " + SubString1);

        // 2. Eliminar el primer substring 'juan' que encuentren en la frase
        String SubString2 = frase.replaceFirst("juan", "");
        System.out.println("Frase sin el primer 'juan': " + SubString2);

        // 3. Separar cada palabra de la frase y guardarlas en un array de strings
        String[] SubArray = frase.split(" ");

        // Imprimir las palabras del array
        System.out.println("Palabras separadas en el array:");
        for (String palabra : SubArray) {
            System.out.println(palabra);
        }
    }
}

