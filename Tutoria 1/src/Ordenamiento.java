import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Ordenamiento {

    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        String[] nombres = {
                "Juan Pérez",
                "Ana Sánchez",
                "Luis García",
                "María Rodríguez",
                "Pedro Martínez"
        };
        ArrayList<String> Nombres = new ArrayList<>();
        Nombres.add(nombres[0]);
        Nombres.add(nombres[1]);
        Nombres.add(nombres[2]);
        Nombres.add(nombres[3]);
        Nombres.add(nombres[4]);
        System.out.println(Arrays.toString(nombres) +"\n");
        int opcion;
        do {
            opcion = 0;
            System.out.println("\n---------------------");
            System.out.println("MENU PRINCIPAL ");
            System.out.println("1.Ordenar de A-Z");
            System.out.println("2.Ordenar de Z-A");
            System.out.println("3.Terminar");
            System.out.println("Ingrese la opcion: ");
            opcion = sc.nextInt();
            System.out.println("---------------------\n");

            switch (opcion) {
                case 1:
                    ArrayList<String> ordenado1 = Ordenar(Nombres, 1);
                    mostrarNombres(ordenado1);
                    break;
                case 2:
                    ArrayList<String> ordenado = Ordenar(Nombres, 2);
                    mostrarNombres(ordenado);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 3);

    }
    public ArrayList<String> Ordenar(ArrayList<String> nombres, int num){
        if(num == 1){
            nombres.sort((n1, n2) -> n1.compareTo(n2));
        } else {
            nombres.sort((n1, n2) -> n2.compareTo(n1));
        }
        return nombres;
    }
    public void mostrarNombres(ArrayList<String> nombres){
        for (String elemento : nombres) {
            System.out.println(elemento);
        }
    }

}
