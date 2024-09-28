import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            opcion = 0;
            System.out.println("MENU PRINCIPAL ");
            System.out.println("1.Parte 1: Búsqueda en Strings");
            System.out.println("2.Parte 1.2: Búsqueda y Creación de Sub-Arrays");
            System.out.println("3.Parte 2: Manipulación de Strings");
            System.out.println("4.Parte 3: Ordenamiento de Strings");
            System.out.println("5.Terminar");
            System.out.println("Ingrese la opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    LeerCadenas a = new LeerCadenas();
                    a.menuPrincipal();
                    break;
                case 2:
                    BusquedaYcreacionArrays b = new BusquedaYcreacionArrays();
                    b.menuPrincipal();
                    break;
                case 3:
                    Manipulacion c = new Manipulacion();
                    c.menuPrincipal();
                    break;
                case 4:
                    Ordenamiento d = new Ordenamiento();
                    d.menuPrincipal();
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 3);

    }
}