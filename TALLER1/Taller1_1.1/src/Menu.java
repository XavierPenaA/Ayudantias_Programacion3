import java.util.Scanner;

public class Menu {
   public String [] frases={"Hola Juan, como estas?","5 manzanas y 3 peras","Esta cadena no tiene numeros"};
   char letra;
   String palabra;
   int aux;
    public void menuPrincipal() {
        int opcion;
        do {
            Scanner entrada = new Scanner(System.in);
            opcion = 0;
            System.out.println("\nMENU PRINCIPAL ");
            System.out.println("1.Ingresar caracter,numero o letra");
            System.out.println("2.Ingresar palabra");
            System.out.println("3.Mostrar el num de veces que se repite el caracter");
            System.out.println("4.Mostrar el num de veces que se repite la palabra");
            System.out.println("5.Salir");
            System.out.println("Ingrese la opcion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarCaracter();
                    break;
                case 2:
                    ingresarPalabra();
                    break;
                case 3:
                    compararaCaracteres();
                    break;
                case 4:
                    compararPalabras();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 5);

    }
    private void ingresarCaracter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Caracter, letra o numero: ");
        letra = sc.nextLine().charAt(0);
    }

    private void compararaCaracteres() {

        for(int j=0;j<frases.length;j++) System.out.println("Frase " + (j+1) + ":" + frases[j]);
        for(int i=0;i<frases.length;i++) {
            aux=0;
            for(int j=0;j<frases[i].length();j++) {
                if(letra==frases[i].charAt(j)) {
                    aux++;
                }
            }
            System.out.println("El numero de veces en la frase "+ (i+1) +" es:" + aux);
        }
    }
    private void ingresarPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palabra:");
        palabra=sc.nextLine();
    }
    private void compararPalabras() {
        int i=0;
        for(int j=0;j<frases.length;j++) System.out.println("Frase " + (j+1) + ":" + frases[j]);
        for(String frase:frases) {
            aux=0;
            i++;
           if(frase.contains(palabra)){
               aux++;
           }
            System.out.println("El numero de veces en la frase "+ i +" es:" + aux);
        }
    }

}

