import java.util.Scanner;
import java.lang.String;
public class Menu {
    private int opc;
    private Scanner leer=new Scanner(System.in);
    public Menu() { opc=0; }

    public void menuPrincipal() {
        EditorTexto e = new EditorTexto();
        do{
            System.out.println("""
                   --- MENU ---
                   1.-Agregar Texto
                   2.-Deshacer
                   3.-Rehacer
                   4.-Mostrar Contenido
                   5.-Salir
                   ------------""");
            opc = ingresarNum("Ingrese una opcion <1-5>",1,5);
            switch (opc){
                case 1:
                    String texto = ingresarTexto("Ingrese el texto: ");
                    e.agregarTexto(texto);
                    break;
                case 2:
                    e.deshacerTexto();
                    break;
                case 3:
                    e.rehacerTexto();
                    break;
                case 4:
                    System.out.println("Contenido actual: "+ e.mostrar());
                    break;
                case 5:
                    System.out.println("Has salido del programa"+ "\n");
                    break;
            }
        }while (opc!=6);
    }

    public String ingresarTexto(String texto){
        String devolver;
        System.out.println(texto);
        devolver = leer.nextLine();
        return devolver;
    }

    public int ingresarNum(String texto, int inf, int sup){
        int num;
        System.out.println(texto);
        do{
            num=leer.nextInt();
            leer.nextLine();
            if(num<inf || num>sup){
                System.out.println("\nERROR: El numero se encuentra fuera de rango. Intente de nuevo.");
            }
        }while(num<inf || num>sup);
        return num;
    }
}
