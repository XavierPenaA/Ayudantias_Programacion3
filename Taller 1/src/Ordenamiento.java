import java.util.Arrays;
import java.util.Collections;

public class Ordenamiento {
    String[] nombres = {
            "Juan Pérez",
            "Ana Sánchez",
            "Luis García",
            "Maria Rodríguez",
            "Pedro Martínez"
    };

    void ordenarAtoZ() {
        Arrays.sort(nombres);

        for (int i = 0; i < 5; i++){
            System.out.println(nombres[i]);
        }
    }

    void ordenarZtoA(){
        Arrays.sort(nombres, Collections.reverseOrder());


        for (int i = 0; i < 5; i++){
            System.out.println(nombres[i]);
        }

    }
}
