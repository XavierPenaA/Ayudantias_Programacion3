import java.util.ArrayList;
import java.util.Scanner;

public class Manipulacion {
    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("\nIngrese la cadena: ");
        //String frase = sc.nextLine();
        String frase = "juan tiene una bicicleta y juan tiene un coche, pero juan no tiene miedo.";
        System.out.println("\n"+frase+"\n");
        String[] palabras = new String[10];
        String[] coincidencias = new String[10];
        int opcion = 0;
        System.out.println("\n---------------------");
        System.out.println("MENU PRINCIPAL ");
        System.out.println("1.Eliminar una letra");
        System.out.println("2.Ingresar primer subString");
        System.out.println("3.Separar cada palabra");
        System.out.println("Ingrese la opcion: ");
        opcion = sc.nextInt();
        System.out.println("---------------------\n");

        do{
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un caracter: ");
                    char caracter = sc.next().charAt(0);
                    String newFrase =  eliminarCaracteres(frase, caracter);
                    mostrarFrase(newFrase);
                    break;
                case 2:
                    System.out.print("Ingrese un subString: ");
                    String subString = sc.next();
                    String nuevo = eliminarSubString(frase, subString);
                    mostrarFrase(nuevo);
                    break;
                case 3:
                    SepararEnPalabras(frase, palabras);
                    System.out.println(palabras);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        } while (opcion != 4);
    }
    public String eliminarCaracteres(String frase, char caracter){
        StringBuilder sb = new StringBuilder();

        for (char c : frase.toCharArray()) {
            if (c != caracter) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public String eliminarSubString(String frase, String subString){
        return frase.replace(subString, "");
        //String nuevaFrase = frase.replaceAll(subString, "");
    }
    public void SepararEnPalabras(String frase, String[] palabras) {
        palabras = frase.split("\\s+");
        int i=0;
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    public void mostrarFrase(String frase){
        System.out.println("\n:"+frase);
    }


}
