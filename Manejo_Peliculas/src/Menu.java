
import java.util.Scanner;

public class Menu {
    private int opc;
    private Scanner leer = new Scanner(System.in);
    public Menu(){
        opc=0;
    }

    public void menuPrincipal(){
        manejoPeliculas pelis = new manejoPeliculas();
        do{
            System.out.println("""
                    ---- MENU ----
                    1) Ingresar
                    2) Mostrar
                    3) Modificar
                    4) Eliminar
                    5) Ordenar
                    6) Terminar
                    ---------------""");
            opc = ingresarNumero("Ingrese una opcion: ", 1,5);
            switch (opc){
                case 1:
                    System.out.println("El id es generado automaticamente");
                    String titulo= ingresarTexto("Ingrese el título: ");
                    int anio= ingresarNumero("Ingrese un número (entre 0 y 2024): ",0,2024);
                    String idioma= ingresarTexto("Ingrese el idioma: ");
                    String genero= ingresarTexto("Ingrese el género: ");
                    String director= ingresarTexto("Ingrese el director: ");
                    pelis.setPeliculas(titulo,anio,idioma,genero,director);
                    break;
                case 2:
                    pelis.mostrar();
                    break;
                case 3:
                    pelis.modificar();
                    break;
                case 4:
                    pelis.eliminar();
                    break;
                case 5:
                    pelis.ordenar();
                    pelis.mostrar();
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                default:
                    System.out.println("\n**Error, opcion invalida**\n");
            }
        }while(opc!=6);
    }

    public String ingresarTexto(String texto){
        String devolver;
        System.out.print(texto);
        devolver=leer.nextLine();
        return devolver;
    }

    public int ingresarNumero(String texto, int inf, int sup) {
        int num;
        System.out.print(texto);
        do {
            num = leer.nextInt();
            leer.nextLine();
            if (num < inf || num > sup) {
                System.out.println("\nError, el numero no se encuentra entre los rangos establecidos, ingreselo de nuevo");
            }
        } while (num < inf || num > sup);
        return num;
    }
}
