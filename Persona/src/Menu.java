import java.util.Scanner;

public class Menu extends Procesos {

    public void menuPrincipal(){

        inicializarPersonas();
        Scanner entrada=new Scanner(System.in);
        int opc;
        
        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ingresar Persona");
            System.out.println("2. Mostrar Registro");
            System.out.println("3. Ordenar Registro");
            System.out.println("4. Modificar Persona");
            System.out.println("5. Buscar Persona");
            System.out.println("6. Eliminar Persona");
            System.out.println("7. Salir");

            opc = entrada.nextInt();
            
            switch(opc){
                
                case 1: ingresarPersona(); break;
                case 2: mostrarRegistro(); break;
                case 3: ordenarArray(); break;
                case 4: modificarPersona(); break;
                case 5: buscar(); break;
                case 6: eliminarPersona(); break;
                case 7: System.out.println("PROGRAMA FINALIZADO"); break;
                default: System.out.println("Ingrese una opción valida"); break;
            }
        } while(opc!=7);
    }
}
