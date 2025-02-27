import java.util.Scanner;

public class condicionalSimple {
    public static void main(String[] args) {
        int numero = 0 ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero=leer.nextInt();
        if (numero>= 8){
            System.out.println("Aprobaste, tu calificacion es " + numero);
        }
        else{
            System.out.println("Has reprobado, tu calificacion es " + numero);
        }
        System.out.println("El número es: " + numero);
    }
}