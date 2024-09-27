import java.util.Scanner;

public class Coincidencias {
    String[] frases = new String[]{"Hola Juan, cómo estás?", "5 manzanas y 3 peras", "Esta cadena no tiene numeros"};
    Scanner input = new Scanner(System.in);

    void encontrarCoincidencias() {
        System.out.println("Ingrese el caracter de la que desee encontrar las coincidencias....");
        char letra = input.nextLine().charAt(0);
        int contador = 0;

        for(int i = 0; i < 3; ++i) {
            int longitudFrase = frases[i].length();
            char[] letrasDeLaFrase = frases[i].toCharArray();

            for(int j = 0; j < longitudFrase; ++j) {
                if (letrasDeLaFrase[j] == letra) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("La letra " + letra + " fue encontrada " + contador + " veces en la frase " + frases[i]);
            } else {

                System.out.println("La letra no fue encontrada en la frase " + frases[i]);
            }

            contador = 0;
        }

    }
}