import java.util.Scanner;

public class Menu {
    Ordenamiento ordenamiento = new Ordenamiento();
    Busqueda busqueda = new Busqueda();
    SubArrays SubArrays = new SubArrays();
    ManipulacionStrings manipulacionStrings = new ManipulacionStrings();

    void menuPrincipal(){
        int opcion;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("-1. Busqueda en strings");
            System.out.println("-2. Crear sub-Arrays");
            System.out.println("-3. Manipulacion de Strings");
            System.out.println("-4. Ordenamietno de Strings");
            System.out.println("-5. Salir");
            opcion = input.nextInt(); input.nextLine();

            switch (opcion){
                case 1: busqueda.Busqueda(); 
                break;
                case 2: SubArrays.subArrays(); 
                break;
                case 3: menuManipulacionStrings(); 
                break;
                case 4: menuOrdenamiento(); 
                break;
                case 5: System.out.println("Saliendo...."); 
                break;
                default: System.out.println("ERROR: Ha ingresado una opcion incorrecta. Escoja <1-5>");
                break;
            }
        }while(opcion != 5);
    }
    void menuManipulacionStrings(){
        int opcion;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("MENU MANIPULACION DE STRINGS");
            System.out.println("-1. Eliminar una letra");
            System.out.println("-2. Eliminar la primera palabra");
            System.out.println("-3. Separar en palabras");
            System.out.println("-4. Salir");
            opcion = input.nextInt(); input.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la letra que desee eliminar....");
                    char letra = input.nextLine().charAt(0);
                    manipulacionStrings.eliminarLetra(letra); 
                    break;
                case 2: manipulacionStrings.eliminarPrimeraPalabra(); 
                break;
                case 3: manipulacionStrings.separarPalabras(); 
                break;
                case 4: System.out.println("Saliendo...."); 
                break;
                default: System.out.println("ERROR: Ha ingresado una opcion incorrecta. Escoja <1-4>");
                break;
            }
        }while(opcion != 4);
    }

    void menuOrdenamiento(){
        int opcion;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("MENU ORDENAMIENTO DE STRINGS");
            System.out.println("1. Ordenar de A a la Z");
            System.out.println("2. Ordenar de Z a la A");
            System.out.println("3. Salir");
            opcion = input.nextInt(); input.nextLine();

            switch (opcion){
                case 1: ordenamiento.ordenarAtoZ(); 
                break;
                case 2: ordenamiento.ordenarZtoA(); 
                break;
                case 3: System.out.println("Saliendo...."); 
                break;
                default: System.out.println("ERROR: Ha ingresado una opcion incorrecta. Escoja <1-3>");
                break;
            }
        }while(opcion != 3);

    }
}