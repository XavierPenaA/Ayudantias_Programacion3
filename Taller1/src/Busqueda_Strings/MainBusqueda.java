package Busqueda_Strings;

import java.util.Scanner;

public class MainBusqueda {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] frases = new String[3];

        frases[0]="Hola Juan. cómo estás?";
        frases[1]="5 manzanas y 3 peras";
        frases[2]="Esta cadena no tiene números";

        int opc, num;
        do{
            System.out.println("MENU");
            System.out.println("1.- Buscar caracter");
            System.out.println("2.- Buscar frase");
            System.out.println("3.- Terminar");
            opc = entrada.nextInt();

            switch (opc){
                case 1:
                    System.out.println("INGRESE EL CARACTER");
                    char caracter = entrada.next().charAt(0);
                    for(int i = 0; i < 3; i++){
                        num = contarOcurrencias(frases[i], String.valueOf(caracter));
                        System.out.println("El caracter '" + caracter + "' se encuentra " + num + " veces en la frase " + i);
                    }
                    break;
                case 2:
                    System.out.println("INGRESE LA FRASE");
                    entrada.nextLine();
                    String frase = entrada.nextLine();
                    for(int i = 0; i < 3; i++){
                        num = contarOcurrencias(frases[i], frase);
                        System.out.println("La frase '" + frase + "' se encuentra " + num + " veces en la frase " + i);
                    }
                    break;
                case 3:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }
        } while(opc != 3);
    }

    private static int contarOcurrencias(String cadena, String busqueda) {
        int posicion = -busqueda.length(), contador = 0;

        do {
            posicion = cadena.indexOf(busqueda, posicion + busqueda.length());
            if (posicion != -1) contador++;
        } while(posicion != -1);

        return contador;
    }
}

