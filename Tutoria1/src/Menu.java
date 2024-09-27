import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {

    //private Persona[] arregloPersonas;
    Scanner sc = new Scanner(System.in);

    public void menuPrincipal() {

        int opc;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Busqueda de string");
            System.out.println("2. Busqueda de Sub-Arrays");
            System.out.println("3. Manipulacion de string");
            System.out.println("4. Ordenamiento de Strings");
            System.out.println("5. Terminar");
            System.out.println(">");

            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    busquedaStrings();
                    break;
                case 2://Busqueda y Sub-arrays
                    busquedaSubArrays();
                    break;
                case 3://Manipulacion de Strings
                    manipulacion();
                    break;
                case 4://Ordenamiento de Strings
                    ordenamiento();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opc != 5);

    }

    private void busquedaStrings() {
        int op;
        //llenar el Array de frases
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Hola Juan, cómo estás?");
        frases.add("5 manzanas y 3 peras");
        frases.add("Esta cadena no tiene números");

        int[] coincidencias;

        do {
            System.out.println("Buscar por:");
            System.out.println("1. Caracter");
            System.out.println("2. Palabra:");
            System.out.println("3. Salir");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Caracter a buscar > ");
                    char buscar = sc.next().charAt(0);
                    //Inicializa con el mismo tamano de las frases
                    coincidencias = new int[frases.size()];
                    buscarCoincidencias(buscar, frases, coincidencias);
                    break;
                case 2:
                    System.out.print("Palabra a buscar > ");
                    String buscarStr = sc.next();
                    //Inicializa con el mismo tamano de las frases
                    coincidencias = new int[frases.size()];
                    buscarCoincidenciasStr(buscarStr, frases, coincidencias);
                    break;
            }
        } while (op != 3);

    }

    private void buscarCoincidencias(char buscar, ArrayList<String> frases, int[] coincidencias) {
        int i = 0;
        //Recorre por las oraciones
        for (String frase : frases) {
            //Recorre por los caracteres de las oraciones
            for (char c : frase.toCharArray()) {
                if (c == buscar)
                    coincidencias[i]++;
            }
            i++;
        }
        mostrarCoincidencias(coincidencias, frases);
    }

    private void buscarCoincidenciasStr(String buscarStr, ArrayList<String> frases, int[] coincidencias) {
        int i = 0;
        for (String frase : frases) {
            if (frase.contains(buscarStr)) {
                coincidencias[i]++;
            }
            i++;
        }
        mostrarCoincidencias(coincidencias, frases);
    }

    private void mostrarCoincidencias(int[] coincidencias, ArrayList<String> frases) {
        for (int i = 0; i < frases.size(); i++) {
            if (coincidencias[i]==0) System.out.println("[No existen coincidencias]");
            else {
                System.out.println("La frase \"" + frases.get(i) + "\" tiene " + coincidencias[i] + " coincidencias");
            }
        }
    }

    private void busquedaSubArrays() {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("manzana");
        palabras.add("banana");
        palabras.add("naranja");
        palabras.add("pera");
        palabras.add("uva");

        //mostrar listado de palabras original
        for (String p : palabras) {
            System.out.println(p);
        }

        ArrayList<String> coincidencias = new ArrayList<>();
        System.out.print("Ingrese el termino > ");
        String term= sc.next();

        for (String palabra : palabras){
            if (palabra.contains(term))
                coincidencias.add(palabra);
        }

        //mostrar listado de palabras buscadas
        if (coincidencias.isEmpty()){
            System.out.println("[No existen coincidencias]");

        }
        else {
            System.out.println("\nCoincidencias");
            for (String coincidencia : coincidencias) {
                System.out.println(coincidencia);
            }

            System.out.println("\n");
        }

    }

    private void manipulacion() {
        String frase= "Juan tiene una bicicleta y Juan tiene un coche, pero Juan no tiene miedo.";
        String frase2= frase.replace('a',' ');
        String frase3=frase.replaceFirst("Juan","");

        String [] palabras = frase.split(" ");

        System.out.println("Frase original: "+frase);
        System.out.println(" Frase sin 'a': "+frase2);
        System.out.println(" Frase sin \"Juan\" : "+frase3);

        System.out.println(" Separado por palabras: ");
        for(String palabra: palabras){
            System.out.println(palabra);
        }

    }

    private void ordenamiento() {
        String[] nombres = {
                "Juan Pérez",
                "Ana Sánchez",
                "Luis García",
                "María Rodríguez",
                "Pedro Martínez"
        };

        ArrayList<String> sort = new ArrayList<>();
        sort.add("Juan Pérez");
        sort.add("Ana Sánchez");
        sort.add("Luis García");
        sort.add("María Rodríguez");
        sort.add("Pedro Martínez");

        Collections.sort(sort);

        System.out.println("Nombres: ");
        for(String nombre: nombres){
            System.out.println(nombre);
        }
        System.out.print("\n");

        System.out.println("Ordenado A-Z: ");
        for(String sor: sort){
            System.out.println(sor);
        }
        System.out.print("\n");

        Collections.reverse(sort);
        System.out.println("Ordenado Z-A: ");
        for(String sor: sort){
            System.out.println(sor);
        }
    }



}//end


