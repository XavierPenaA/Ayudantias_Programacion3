public class ManipulacionStrings {
    String texto = "juan tiene una bicicleta y juan tiene un choche, pero juan no tiene miedo";
    char[] letras;

    void eliminarLetra(char letra) {
        this.letras = texto.toCharArray();

        for(int i = 0; i < texto.length(); i++) {
            if (letras[i] == letra) {
                letras[i] = ' ';
            }
        }

        System.out.println("Nuevo texto: " + String.valueOf(letras));
    }

    void eliminarPrimeraPalabra() {
        letras = texto.toCharArray();
        int i = 0;
        while(letras[i] != ' '){
            letras[i] = ' ';
            i++;
        }


        System.out.println("Nuevo texto: " + String.valueOf(letras));
    }

    void separarPalabras(){
        char[] letras = texto.toCharArray();
        String[] nuevoArray = new String[14];
        String apoyo = new String();

        int i = 0, j = 0;


        for (i = 0; i < texto.length(); i++){
            if (letras[i] == ' '){
                nuevoArray[j] = apoyo;
                apoyo = new String();
                j++;
                i++;
            }

            apoyo = apoyo.concat(String.valueOf(letras[i]));

            if (i == (texto.length()-1)){
                nuevoArray[j] = apoyo;
                break;
            }

        }

        for (i = 0; i < 14; i++){
            System.out.println(nuevoArray[i] + " ");
        }

    }
}