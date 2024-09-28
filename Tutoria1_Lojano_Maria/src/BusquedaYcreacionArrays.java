import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class BusquedaYcreacionArrays {
    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("\nIngrese la cadena: ");
        //String frase = sc.nextLine();
        String[] palabras = {"manzana", "banana", "naranja", "pera", "uva"};
        String[] coincidencias = new String[10];
        buscarPalabras(palabras,coincidencias);

        System.out.println("Array:"+Arrays.toString(coincidencias));
    }
    public void buscarPalabras(String[] palabras, String[] coincidencias){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar una subCadena: ");
        String busqueda = sc.nextLine();
        int j=0;
        for(int i=0; i<palabras.length; i++){
            if(palabras[i].contains(busqueda)){
                coincidencias[j] = palabras[i];
                System.out.println("\n"+i+":"+coincidencias[j]);
                j++;
            }
        }
    }
}
