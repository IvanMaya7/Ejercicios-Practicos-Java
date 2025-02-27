import java.util.Scanner;
public class multiplo {
    public static void main(String[] args) {
        int n1 = 0 ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        n1=leer.nextInt();
        double n2 =n1 % 7;
        if (n2 == 0){
            System.out.println("El numero " + n1 + " es multiplo de 7");
        }
        else{
            System.out.println("El numero " + n1 + " no es multiplo de 7");
        }
    }
}