import java.util.Scanner;

public class lector {
    public static void main(String[] args) {
        String mensaje= "";
        int cara= 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        mensaje=leer.nextLine();
        System.out.println(mensaje.length());
    }
}

