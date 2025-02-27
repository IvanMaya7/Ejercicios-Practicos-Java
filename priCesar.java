import java.util.Scanner;

public class priCesar {
    Scanner leer = new Scanner(System.in);
    String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    public void solicitar() {
        System.out.println("Dame una frase: ");
        String frase = leer.nextLine(); 

        String texto = codificar(frase);
        System.out.println("Texto codificado: " + texto);
    }

    public String codificar(String texto) {
        String textoCodificado = "";

        texto = texto.toUpperCase();

        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            int pos = letras.indexOf(caracter);

            if (pos == -1) {
                textoCodificado += caracter;
            } else {
                textoCodificado += letras.charAt((pos + 2) % letras.length());
            }
        }

        return textoCodificado;
    }
}

