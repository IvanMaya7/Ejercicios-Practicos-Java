import java.util.Scanner;
public class mayor {
    public static void main(String[] args) {
        int n1 = 0 ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número 1: ");
        n1=leer.nextInt();
        int n2 = 0 ;
        System.out.println("Escribe el número 2: ");
        n2=leer.nextInt();
        if (n1>n2){
            System.out.println("El numero " + n1 + " es mayor que " + n2);
        }
        else if (n1 == n2){
            System.out.println("Estos numeros son iguales");
        }
        else{
            System.out.println("El numero " + n2 + " es mayor que " + n1);
        }
    }
    }