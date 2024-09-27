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

    // Orden ascendente
    void ordenar() {
        Arrays.sort(nombres);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    // Orden descendente
    void ordenarBack() {
        Arrays.sort(nombres, Collections.reverseOrder());

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
