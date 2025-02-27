import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        String pal= "";
        int can=0;
        int ca= 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        pal=leer.nextLine();
        can=pal.length();
        System.out.println("hola");
        for (int i = 0; i < can; i++) {
            System.out.println(pal);
        }
        //System.out.println(pal.length());

    }
}
