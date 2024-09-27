//Michael Joseph Vintimilla Armijos

import java.util.Scanner;

public class Busqueda {
    String[] frase1 = new String[]{"Hola Juan, cómo estas?", "5 manzanas y 3 peras", "Esta cadena no tiene números"};
    Scanner entrada = new Scanner(System.in);

    // Método no estático
    void contarIncidencias() {
        System.out.println("Ingrese el caracter que desee encontrar:_");
        char letra = entrada.nextLine().charAt(0);
        int contador = 0;

        for (int i = 0; i < 3; ++i) {
            int longitudFrase = frase1[i].length();
            char[] letrasDeLaFrase = frase1[i].toCharArray();

            for (int j = 0; j < longitudFrase; ++j) {
                if (letrasDeLaFrase[j] == letra) {
                    contador++;
                }
            }
            if (contador > 0) {
                System.out.println("La letra " + letra + " fue encontrada " + contador + " veces en la frase: " + frase1[i]);
            } else {
                System.out.println("Letra no encontrada en: " + frase1[i]);
            }
            contador = 0;
        }
    }
}

