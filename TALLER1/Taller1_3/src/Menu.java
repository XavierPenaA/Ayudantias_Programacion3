import java.util.Scanner;

public class Menu {
    String[] nombres = {
            "Juan Pérez",
            "Ana Sánchez",
            "Luis García",
            "María Rodríguez",
            "Pedro Martínez"};
    public void menuPrincipal() {
        int opcion;
        do {
            Scanner entrada = new Scanner(System.in);
            opcion = 0;
            System.out.println("\nMENU PRINCIPAL ");
            System.out.println("1.Ordenar nombres ascendente");
            System.out.println("2.Ordenar nombres descendente");
            System.out.println("3.Salir");
            System.out.println("Ingrese la opcion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ordenarAscendente();
                    break;
                case 2:
                   ordenarDescendente();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 3);
    }
    private void ordenarAscendente(){
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                String nombre1 = nombres[j].split(" ")[0];
                String nombre2 = nombres[j + 1].split(" ")[0];
                    if (nombre1.compareTo(nombre2) > 0) {
                    String temp = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = temp;
                    }
            }
        }
        System.out.println("Nombre ordenados ascendentemente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    private void ordenarDescendente(){
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                String nombre1 = nombres[j].split(" ")[0];
                String nombre2 = nombres[j + 1].split(" ")[0];
                    if (nombre1.compareTo(nombre2) < 0) {
                    String temp = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = temp;
                    }
            }
        }
        System.out.println("Nombres ordenados descendentemente:");
            for (String nombre  : nombres) {
            System.out.println(nombre);
        }
    }
}
