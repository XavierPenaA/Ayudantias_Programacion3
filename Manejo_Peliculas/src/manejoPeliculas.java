import java.util.*;
public class manejoPeliculas extends Menu {
    public ArrayList<Peliculas> peliculas= new ArrayList<>();
    private int id;
    public manejoPeliculas() {
        this.id = 0;
    }

    public void setPeliculas(String titulo, int anio, String idioma, String genero, String director){
        peliculas.add(new Peliculas(Integer.toString(id),titulo,anio,idioma,genero,director));
        id++;
    }
    public void mostrar(int i){
        System.out.println("Id: "+ peliculas.get(i).getId());
        System.out.println("Titulo: "+ peliculas.get(i).getTitulo());
        System.out.println("Año: "+ peliculas.get(i).getAnio());
        System.out.println("Idioma: "+ peliculas.get(i).getIdioma());
        System.out.println("Genero: "+ peliculas.get(i).getGenero());
        System.out.println("Director: "+ peliculas.get(i).getDirector());

    }

    public void mostrar(){
        if(peliculas.isEmpty()){
            System.out.println("Ingrese una película primero");
        }
        else{
            for (Peliculas pelicula : peliculas) {
                System.out.println(pelicula);
            }
//            for (Peliculas pelicula : peliculas) {
//                System.out.println("Id: " + pelicula.getId());
//                System.out.println("Titulo: " + pelicula.getTitulo());
//                System.out.println("Año: " + pelicula.getAnio());
//                System.out.println("Idioma: " + pelicula.getIdioma());
//                System.out.println("Genero: " + pelicula.getGenero());
//                System.out.println("Director: " + pelicula.getDirector());
//            }
        }
    }
    public int verificarIdBuscado(ArrayList <Integer> encontrado){
        int id_return;
        boolean encontradoId=false;
        do{
            id_return=ingresarNumero("Ingrese un Id de las peliculas encontradas para seleccionar: ",0,peliculas.size());
            for (Integer integer : encontrado) {
                if (id_return == integer) {
                    encontradoId = true;
                    break;
                }
            }
            if(!encontradoId){
                System.out.println("El Id no pertenece a las peliculñas encontradas");
            }
        }while(!encontradoId);
        return id_return;
    }
    public int buscar(){
        int b=-1, c=0,opc;
        ArrayList<Integer> encontrado= new ArrayList<>();
        do{
            System.out.println("""
                    ----Buscar película por:----
                    1) Id
                    2) Titulo
                    3) Año
                    4) Idioma
                    5) Genero
                    6) Director
                    ---------------""");
            opc = ingresarNumero("Ingrese una opcion: ", 1,6);
            switch (opc){
                case 1:
                    String id_buscar=ingresarTexto("Ingrese un Id a buscar: ");
                    System.out.println("La busqueda por Id solo encuentra 1 coincidencia, pelicula encontrada: ");
                    for(int i=0; i<peliculas.size();i++){
                        b++;
                        if(id_buscar.equals(peliculas.get(i).getId())) {
                            mostrar(i);
                            c++;
                            return b;
                        }
                    }
                    if(c==0){
                        System.out.println("No se encontró la pelicula");
                        return -1;
                    }
                    break;
                case 2:
                    String titulo_buscar=ingresarTexto("Ingrese el título que desea buscar: ");
                    System.out.println("Películas encontradas (título): ");
                    for(int i=0; i<peliculas.size();i++){
                        if(titulo_buscar.equals(peliculas.get(i).getTitulo())) {
                            mostrar(i);
                            encontrado.add(Integer.valueOf(peliculas.get(i).getId()));
                            c++;
                        }
                    }
                    if(c==0){
                        System.out.println("No se encontró la pelicula");
                        return -1;
                    }
                    else {
                        return verificarIdBuscado(encontrado);
                    }
                case 3:
                    int anio_buscar=ingresarNumero("Ingrese el año por el que desea buscar: ",0,2024);
                    System.out.println("Películas encontradas (año): ");
                    for(int i=0; i<peliculas.size();i++){
                        if(anio_buscar==peliculas.get(i).getAnio()) {
                            mostrar(i);
                            encontrado.add(Integer.valueOf(peliculas.get(i).getId()));
                            c++;
                        }
                    }
                    if(c==0){
                        System.out.println("No se encontró la pelicula");
                        return -1;
                    }
                    else {
                        return verificarIdBuscado(encontrado);
                    }
                case 4:
                    String idioma_buscar=ingresarTexto("Ingrese el idioma que desea buscar: ");
                    System.out.println("Películas encontradas (idioma): ");
                    for(int i=0; i<peliculas.size();i++){
                        if(idioma_buscar.equals(peliculas.get(i).getIdioma())) {
                            mostrar(i);
                            encontrado.add(Integer.valueOf(peliculas.get(i).getId()));
                            c++;
                        }
                    }
                    if(c==0){
                        System.out.println("No se encontró la pelicula");
                        return -1;
                    }
                    else {
                        return verificarIdBuscado(encontrado);
                    }
                case 5:
                    String genero_buscar=ingresarTexto("Ingrese el genero que desea buscar: ");
                    System.out.println("Películas encontradas (genero): ");
                    for(int i=0; i<peliculas.size();i++){
                        if(genero_buscar.equals(peliculas.get(i).getGenero())) {
                            mostrar(i);
                            encontrado.add(Integer.valueOf(peliculas.get(i).getId()));
                            c++;
                        }
                    }
                    if(c==0){
                        System.out.println("No se encontró la pelicula");
                        return -1;
                    }
                    else {
                        return verificarIdBuscado(encontrado);
                    }
                case 6:
                    String director_buscar=ingresarTexto("Ingrese el director que desea buscar: ");
                    System.out.println("Películas encontradas (director): ");
                    for(int i=0; i<peliculas.size();i++){
                        if(director_buscar.equals(peliculas.get(i).getDirector())) {
                            mostrar(i);
                            encontrado.add(Integer.valueOf(peliculas.get(i).getId()));
                            c++;
                        }
                    }
                    if(c==0){
                        System.out.println("No se encontró la pelicula");
                        return -1;
                    }
                    else {
                        return verificarIdBuscado(encontrado);
                    }
                default:
                    System.out.println("\n**Error, opcion invalida**\n");
            }
        }while(true);
    }
    public void modificar(){
        if(peliculas.isEmpty()){
            System.out.println("Ingrese una película primero");
        }
        else{
            int b=buscar();
            int opc;
            if (b!=-1){
                do{
                    System.out.println("""
                            ----Modificar por:----
                            1) Titulo
                            2) Año
                            3) Idioma
                            4) Genero
                            5) Director
                            6) Salir
                            ---------------""");
                    opc = ingresarNumero("Ingrese una opcion: ", 1,6);
                    switch (opc){
                        case 1:
                            String titulo= ingresarTexto("Ingrese el titulo: ");
                            peliculas.get(b).setTitulo(titulo);
                            System.out.println("Dato cambiado correctamente");
                            break;
                        case 2:
                            int anio= ingresarNumero("Ingrese el numero (entre 0 a 2024): ",0,2024);
                            peliculas.get(b).setAnio(anio);
                            System.out.println("Dato cambiado correctamente");
                            break;
                        case 3:
                            String idioma= ingresarTexto("Ingrese el idioma: ");
                            peliculas.get(b).setIdioma(idioma);
                            System.out.println("Dato cambiado correctamente");
                            break;
                        case 4:
                            String genero= ingresarTexto("Ingrese el genero: ");
                            peliculas.get(b).setGenero(genero);
                            System.out.println("Dato cambiado correctamente");
                            break;
                        case 5:
                            String director= ingresarTexto("Ingrese el director: ");
                            peliculas.get(b).setDirector(director);
                            System.out.println("Dato cambiado correctamente");
                            break;
                        default:
                            System.out.println("\n**Error, opcion invalida**\n");
                    }
                }while(opc!=6);
            }
        }
    }
    public void eliminar(){
        if(peliculas.isEmpty()){
            System.out.println("Ingrese una película primero");
        }
        else {
            int b = buscar();
            peliculas.remove(b);
            System.out.println("Elemento Eliminado correctamente");
        }
    }
    public void ordenar(){
        int opc;
        boolean ordenado=false;
        do{
        System.out.println("""
                ----Ordenar película por:----
                1) Id
                2) Titulo
                3) Año
                4) Idioma
                5) Genero
                6) Director
                ---------------""");
        opc = ingresarNumero("Ingrese una opcion: ", 1, 6);
        switch (opc) {
            case 1:
                peliculas.sort(Comparator.comparing(Peliculas::getId));
                System.out.println("Ordenado completado");
                ordenado=true;
                break;
            case 2:
                peliculas.sort(Comparator.comparing(Peliculas::getTitulo));
                System.out.println("Ordenado completado");
                ordenado=true;
                break;
            case 3:
                peliculas.sort(Comparator.comparingInt(Peliculas::getAnio));
                System.out.println("Ordenado completado");
                ordenado=true;
                break;
            case 4:
                peliculas.sort(Comparator.comparing(Peliculas::getIdioma));
                System.out.println("Ordenado completado");
                ordenado=true;
                break;
            case 5:
                peliculas.sort(Comparator.comparing(Peliculas::getGenero));
                System.out.println("Ordenado completado");
                ordenado=true;
                break;
            case 6:
                peliculas.sort(Comparator.comparing(Peliculas::getDirector));
                System.out.println("Ordenado completado");
                ordenado=true;
                break;
        }
    }while(ordenado==false);
    }
}
