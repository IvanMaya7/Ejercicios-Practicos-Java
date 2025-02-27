import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {
        int cat = 0 ;
        int cato = 0 ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el cateto adyacente: ");
        cat=leer.nextInt();
        System.out.println("Escribe el cateto opuesto: ");
        cato=leer.nextInt();
        double hipo = Math.pow(cat, 2);
        double hip = Math.pow(cato, 2);
        double hi =(hipo + hip);
        double h = Math.sqrt(hi);
        System.out.println("La hipotenusa es: "+ h );
    }
}