import java.util.Arrays;
import java.util.Scanner;

public class LeerCadenas {
    Scanner sc = new Scanner(System.in);
    public void menuPrincipal() {
        int opcion;
        String[] fraseIngresada = new String[]{"Hola Juan, cómo estás?",
                "5 manzanas y 3 peras",
                "Esta cadena no tiene números"};
        do {
            String frase = "";
            opcion = 0;
            System.out.println("\n---------------------");
            System.out.println("MENU PRINCIPAL ");
            System.out.println("0.HARD CODE");
            System.out.println("1.Ingresar string");
            System.out.println("2.Buscar una letra, numero o espacio");
            System.out.println("3.Buscar una palabra");
            System.out.println("4.Terminar");
            System.out.println("Ingrese la opcion: ");
            opcion = sc.nextInt();
            System.out.println("---------------------\n");

            switch (opcion) {
                case 0:
                    System.out.println(Arrays.toString(fraseIngresada));
                    break;
                case 1:
                    System.out.println("\nIngrese la cadena: ");
                    frase = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Ingrese un caracter: ");
                    char caracter = sc.next().charAt(0);
                    int contador =0;
                    if(frase.isEmpty()){
                        contador = contarCaracteres(Arrays.toString(fraseIngresada), caracter);
                    }else{
                        contador = contarCaracteres(frase, caracter);
                    }
                    if (contador == 0) {
                        System.out.print("\nNo existen coincidencias");
                    } else {
                        System.out.println("\nExisten" + contador + "coincidencias");
                    }
                    break;
                case 3:
                    int cont=0;
                    if(frase.isEmpty()){
                        cont = PalabraEnFrase(Arrays.toString(fraseIngresada));
                    }else{
                        cont = PalabraEnFrase(frase);
                    }
                    System.out.println("Existen " + cont + " coincidencias");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 4);

    }


    public int contarCaracteres (String cadena,char caracter){
        int longitud = cadena.length();
        int contador = 0;
        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i < longitud; i++) {
            if (caracter == caracteres[i]) {
                contador++;
            }
        }
        return contador;
    }

    public int PalabraEnFrase(String frase){
        sc.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        int contador=0;
        String[] palabras = frase.split("\\s+");
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }





}
