import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public manejoPersonas manejo = new manejoPersonas();


    public void menuPrincipal() {
        int opcion =0;
        int n = 0;
        int bandera = 0;
        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("MENU PRINCIPAL ");
            System.out.println("1.Ingresar Persona");
            System.out.println("2.Mostrar Persona");
            System.out.println("3.Ordenar Persona");
            System.out.println("4.Ordenar Persona");
            System.out.println("5.Eliminar Persona");
            System.out.println("6.Terminar");
            System.out.println("Ingrese la opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    manejo.ingresarPersona();
                    break;
                case 2:
                    manejo.mostrarPersona();
                    break;
                case 3:
                    manejo.ordenar();
                    break;
                case 4:
                    Persona pEncontrada = manejo.buscarPersona();
                    if(pEncontrada == null){
                        System.out.println("No existen coincidencias");
                    }else{
                        System.out.println("Encontrado\n");
                        System.out.println("Nombre: "+pEncontrada.getNombre());
                        System.out.println("Edad: "+pEncontrada.getEdad());
                        System.out.println("Direccion: "+pEncontrada.getDireccion());
                    }
                    break;
                case 5:
                    Persona pEncontrada1 = manejo.buscarPersona();
                    if(pEncontrada1 == null){
                        System.out.println("No existen coincidencias");
                    }else{
                        manejo.eliminarPersona(pEncontrada1);
                        System.out.println("Persona Eliminada");
                    }
                    break;
                case 6:
                    manejo.ordenar();
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 3);
    }



}
