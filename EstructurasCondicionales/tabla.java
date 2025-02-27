import java.util.Scanner;
public class tabla {
    public static void main(String[] args) {
        System.out.println("Este programa lee un numero y si es par imprime su tabla de multiplicar.");
        int n1 = 0, res=0, i =1 ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        n1=leer.nextInt();
        res=(n1 % 2);
        if (res == 0 ){
            System.out.println("Este numero es par");
            for (i = 1; i <= 10;) {
                res=(n1*i);
                System.out.println(n1 + " * " + i + " = " + res);
                i++;
            }
        }
        else{
            System.out.println("Este numero es impar");
        }
    }
}
