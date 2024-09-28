import java.util.Scanner;

public class Busqueda {
    String[] texto = new String[]{"Hola Juan, cómo estás?", "5 manzanas y 3 peras", "Esta cadena no tiene numeros"};
    Scanner input = new Scanner(System.in);

    void busquedaCoicidencias(){
        System.out.println("Ingrese un caracter para encontrar su coincidencia: ");
        char caracter=input.nextLine().charAt(0);
        int i, j, cont=0;

        for(i=0; i<3; i++){
            int longTexto=texto[i].length();
            char letrasTexto=texto[i].toCharArray();

            for(j=0; i<longTexto; j++){
                if(letrasTexto[j]== caracter){
                    cont++;
                }
            }
            if(cont > 0){
                System.out.println("El caracter "+caracter + "fue encontrado" + cont + "veces en "+ texto[i]);
            }else {
                System.out.println("El caracter no fue enconttrado en " +texto[i]);
            }

            cont =0;
        }
    }
}


