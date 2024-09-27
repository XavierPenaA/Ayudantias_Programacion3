import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public String [] frases={"manzana","banana","naranja","pera","uva"};
    String palabra;
    int aux;
    public void menuPrincipal() {
        int opcion;
        do {
            Scanner entrada = new Scanner(System.in);
            opcion = 0;
            System.out.println("MENU PRINCIPAL ");
            System.out.println("1.Ingresar un termino");
            System.out.println("2.Mostrar las frases en las que aparece el termino");
            System.out.println("3.Salir");
            System.out.println("Ingrese la opcion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarPalabra();
                    break;
                case 2:
                    compararPalabras();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 3);

    }
    private void ingresarPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palabra:");
        palabra=sc.nextLine();
    }
    private void compararPalabras() {
        String [] subarray = new String[5];
        aux=0;
        for(int j=0;j<frases.length;j++) System.out.println("Frase " + (j+1) + ":" + frases[j]);
        for(String frase:frases) {
            if(frase.contains(palabra)) {
                subarray[aux]=frase;
                aux++;
            }
        }
        for (int i = 0; i < aux; i++) {
            if(subarray[i]!=null) {
                System.out.println("\nPalabra:" + subarray[i]+"\n");
            }
        }
    }

}
