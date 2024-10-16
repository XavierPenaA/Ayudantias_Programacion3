import java.util.Scanner;

public class Menu {

    protected void mostrarMenu(){
        System.out.println("1. Agregar Texto");
        System.out.println("2. Deshacer");
        System.out.println("3. Rehacer");
        System.out.println("4. Mostrar contenido");
        System.out.println("5. Salir");
    }

    protected static int validarOpcion(int min, int max){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingresa una opcion: ");
            opcion = sc.nextInt();
            if(opcion < min || opcion > max)
                System.out.println("Opción no válida");
        } while(opcion < min || opcion > max);

        return opcion;
    }

}

