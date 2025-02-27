import java.util.Scanner;
public class descendente {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        n1=leer.nextInt();
        System.out.println("Escribe el segundo numero: ");
        n2=leer.nextInt();
        System.out.println("Escribe el tercer numero: ");
        n3=leer.nextInt();
        if(n1 > n2 && n2 > n3){
            System.out.println("El orden descendiente es: " + n1 + ", " + n2 + ", " + n3);
        } else if(n1 > n3 && n3 > n2){
            System.out.println("El orden descendiente es: " + n1 + ", " + n3 + ", " + n2);
        } else if (n2 > n1 && n1 > n3){
            System.out.println("El orden descendiente es: " + n2 + ", " + n1 + ", " + n3);
        } else if (n2 > n3 && n3 > n1){
            System.out.println("El orden descendiente es: " + n2 + ", " +n3 + ", " + n1);
        } else if(n3 > n2 && n2 > n1){
            System.out.println("El orden descendiente es: " + n3 + ", " + n2 + ", " + n1);
        } else{
            System.out.println("El orden descendiente es: " + n3 + ", " + n1 + ", " + n2);
        }
    }    
}
