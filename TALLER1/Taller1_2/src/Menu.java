import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    String frase="juan tiene una bicicleta y juan tiene un coche, pero juan no tiene miedo";
    char c;
    String palabra, sinCaracter, sinPalabra;
    public void menuPrincipal() {
        int opcion;
        do {
            Scanner entrada = new Scanner(System.in);
            opcion = 0;
            System.out.println("\nMENU PRINCIPAL ");
            System.out.println("1.Ingresar un caracter");
            System.out.println("2.Ingresar un termino");
            System.out.println("3.Mostrar la frase");
            System.out.println("4.Salir");
            System.out.println("Ingrese la opcion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    reemplazarCaracter(frase,c);
                    break;
                case 2:
                    ingresarPalabra();
                    break;
                case 3:
                    sygFrase();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 4);

    }
    public String reemplazarCaracter(String frase, char c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Caracter: ");
        c = sc.nextLine().charAt(0);
        sinCaracter = frase.replace(Character.toString(c), "");
        return sinCaracter;
    }
    private void ingresarPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palabra:");
        palabra=sc.nextLine();
        sinPalabra = sinCaracter.replaceFirst(palabra,"");
    }
    private void sygFrase(){
        String[] palabras = sinPalabra.split("\\s+");
        System.out.println("Frase original: " + frase);
        for (String palabraF : palabras) {
            System.out.println(palabraF);
        }
    }
}
