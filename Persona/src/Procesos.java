import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Procesos {

    private final ArrayList<Persona> listaPersonas = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public void inicializarPersonas(){
        listaPersonas.add(new Persona("Nicolas", "M", 21, "09888"));
        listaPersonas.add(new Persona("Camila", "F", 18, "09777"));
        listaPersonas.add(new Persona("Pepe", "M", 40, "09999"));
    }

    public void ingresarPersona(){

        System.out.println("Ingrese los datos de la nueva persona: ");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Genero: ");
        String genero = entrada.nextLine();

        System.out.println("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar Buffer

        System.out.println("Telefono: ");
        String telefono = entrada.nextLine();

        listaPersonas.add(new Persona(nombre, genero, edad, telefono));
    }

    public void mostrarRegistro(){
        if(listaPersonas.isEmpty()){
            System.out.println("El Registro esta vacio. Primero agregue personas");
        }
        else{

            for (Persona persona: listaPersonas){
                mostrarPersona(persona);
            }
        }
    }

    private void menuParametros(){

        System.out.println("1. Nombre");
        System.out.println("2. Genero");
        System.out.println("3. Edad");
        System.out.println("4. Telefono");

    }

    public void ordenarArray() {

        if (listaPersonas.isEmpty()){
            System.out.println("El Registro esta vacio. Primero agregue personas");
        }
        else{

            System.out.println("Elija el Parametro por el cual desea ordenar: ");
            menuParametros();
            int opc = entrada.nextInt();

            switch (opc) {

                // para ordenar de orden descendente colocar .reversed() al final
                case 1:
                    listaPersonas.sort(Comparator.comparing(Persona::getNombre));
                    System.out.println("Registro Ordenado por Nombre.");
                    break;

                case 2:
                    listaPersonas.sort(Comparator.comparing(Persona::getGenero));
                    System.out.println("Registro Ordenado por Genero.");
                    break;

                case 3:
                    System.out.println("Ordenar de: ");
                    System.out.println("1. Mayor a menor");
                    System.out.println("2. Menor a mayor");
                    int ordEdad = entrada.nextInt();
                    entrada.nextLine();

                    switch (ordEdad){

                        case 1:

                            listaPersonas.sort(Comparator.comparing(Persona::getEdad).reversed());
                            System.out.println("Registro Ordenado por Edad de Mayor a Menor");
                            break;

                        case 2:

                            listaPersonas.sort(Comparator.comparing(Persona::getEdad));
                            System.out.println("Registro Ordenado por Edad de Menor a Mayor.");
                            break;

                    }
                    break;

                case 4:
                    listaPersonas.sort(Comparator.comparing(Persona::getTelefono));
                    System.out.println("Registro Ordenado por Telefono.");
                    break;

                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }
    }

    private void mostrarPersona(Persona p){

        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Genero: "+p.getGenero());
        System.out.println("Edad: "+p.getEdad());
        System.out.println("Telefono: "+p.getTelefono());
        System.out.println("-----------------------");

    }

    private void noEncontrado(){

        System.out.println("No se encontraron coincidencias en el Registro");
    }

    private Persona buscarPorNombre(){

        Persona encontrado = null;
        System.out.println("Ingrese el Nombre de la persona a buscar:");
        String nombre = entrada.nextLine();

        for (Persona persona : listaPersonas){
            if(persona.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("Persona Encontrada: ");
                mostrarPersona(persona);
                encontrado = persona;
            }
        }
        if (encontrado==null){
            noEncontrado();
        }
        return encontrado;
    }

    public Persona buscar(){

        if (listaPersonas.isEmpty()){
            System.out.println("El Registro esta vacio. Primero agregue personas");
        }
        else{

            System.out.println("Ingrese el Parametro por el cual desea buscar: ");
            menuParametros();
            int opc = entrada.nextInt();
            entrada.nextLine();
            Persona encontrado = null;

            switch(opc){

                case 1:
                    encontrado = buscarPorNombre();
                    break;

                case 2:
                    System.out.println("Ingrese el Genero de la persona a buscar:");
                    String genero = entrada.nextLine();

                    for (Persona persona : listaPersonas){
                        if(persona.getGenero().equalsIgnoreCase(genero)) {

                            System.out.println("Persona(s) Encontrada(s): ");
                            mostrarPersona(persona);
                            encontrado = persona;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Ingrese la Edad de la persona a buscar:");
                    int edad = entrada.nextInt();
                    entrada.nextLine();

                    for (Persona persona : listaPersonas){
                        if(persona.getEdad() == edad) {

                            System.out.println("Persona(s) Encontrada(s): ");
                            mostrarPersona(persona);
                            encontrado = persona;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el telefono de la persona a buscar:");
                    String telefono = entrada.nextLine();

                    for (Persona persona : listaPersonas){
                        if(persona.getTelefono().equalsIgnoreCase(telefono)) {

                            System.out.println("Persona Encontrada: ");
                            mostrarPersona(persona);
                            encontrado = persona;
                        }
                    }
                    break;

                default: System.out.println("Ingrese una opción valida"); break;
            }

            if (encontrado == null){
                noEncontrado();
            }
            return encontrado;
        }
        return null;
    }

    public void modificarPersona(){

        if (listaPersonas.isEmpty()){
            System.out.println("El Registro esta vacio. Primero ingrese personas");
        }
        else{

            Persona personaAModificar = buscarPorNombre();
            if (personaAModificar!=null){

                System.out.println("Ingrese el parametro que desea modificar: ");
                menuParametros();
                int op = entrada.nextInt();
                entrada.nextLine();

                switch (op){

                    case 1:

                        System.out.println("Ingrese el nuevo nombre: ");
                        String nombre = entrada.nextLine();
                        personaAModificar.setNombre(nombre);
                        System.out.println("Nombre modificado Exitosamente");
                        mostrarPersona(personaAModificar);
                        break;

                    case 2:

                        System.out.println("Ingrese el nuevo genero: ");
                        String genero = entrada.nextLine();
                        personaAModificar.setGenero(genero);
                        System.out.println("Genero modificado Exitosamente");
                        mostrarPersona(personaAModificar);
                        break;

                    case 3:

                        System.out.println("Ingrese la nueva edad: ");
                        int edad = entrada.nextInt();
                        entrada.nextLine();
                        personaAModificar.setEdad(edad);
                        System.out.println("Edad modificada Exitosamente");
                        mostrarPersona(personaAModificar);
                        break;

                    case 4:

                        System.out.println("Ingrese el nuevo telefono: ");
                        String telf = entrada.nextLine();
                        personaAModificar.setTelefono(telf);
                        System.out.println("telefono modificado Exitosamente");
                        mostrarPersona(personaAModificar);
                        break;
                }
            }
        }
    }

    public void eliminarPersona(){

        Persona personaAEliminar = buscarPorNombre();

        if (personaAEliminar!=null){

            System.out.println("Esta seguro de querer eliminar a esta persona? (S/N)");
            String confirmacion = entrada.nextLine();

            if (confirmacion.equalsIgnoreCase("S")){

                listaPersonas.remove(personaAEliminar);
                System.out.println("Persona eliminada Exitosamente");
            }
            else {

                System.out.println("Porceso de Eliminacion cancelado.");
            }
        }
    }
}
