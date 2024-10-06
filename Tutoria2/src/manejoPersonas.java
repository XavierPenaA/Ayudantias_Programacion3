import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class manejoPersonas {



    // Crear un ArrayList de tipo Persona
    public ArrayList<Persona> personas;

    public manejoPersonas() {
        personas = new ArrayList<>();
    }

    public void agregarPersona() {
        // Agregar personas al ArrayList
        personas.add(new Persona("Juan", 25, "Calle 1"));
        personas.add(new Persona("María", 30, "Calle 2"));
        personas.add(new Persona("Pedro", 20, "Calle 3"));
    }

    public void ingresarPersona(){

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String direccion;

        System.out.println("Nombre: " );
        nombre = sc.nextLine();

        System.out.println("Edad: " );
        edad = sc.nextInt();

        System.out.println("Direccion: " );
        sc.nextLine();
        direccion = sc.nextLine();
        this.personas.add(new Persona(nombre, edad, direccion));
    }

    public   void mostrarPersona(){
        if(personas.isEmpty()){
            System.out.println("No existen personas ingresadas");
        }else{
            for(Persona person: personas){
                System.out.println("Nombre: "+person.getNombre());
                System.out.println("Edad: "+person.getEdad());
                System.out.println("Direccion: "+person.getDireccion());
            }
        }
    }

    public void ordenar(){
        int opcion=0;
        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("MENU BUSQUEDA ");
            System.out.println("1.Ordenar por NOMBRE");
            System.out.println("2.Ordenar por EDAD");
            System.out.println("3.Ordenar por DIRECCION");
            System.out.println("Ingrese la opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    personas.sort(Comparator.comparing(Persona::getNombre));

                    break;
                case 2:
                    personas.sort(Comparator.comparingInt(Persona::getEdad));
                    break;
                case 3:
                    personas.sort(Comparator.comparing(Persona::getDireccion));
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion > 3 && opcion<1);

        for(Persona person: personas){
            System.out.println("Nombre: "+person.getNombre());
            System.out.println("Edad: "+person.getEdad());
            System.out.println("Direccion: "+person.getDireccion());
        }
    }

    public Persona buscarPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String name = sc.nextLine();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(name)) {
                return persona;
            }
        }
        return null;
    }

    public void eliminarPersona(Persona persona){
        personas.remove(persona);
    }
}
