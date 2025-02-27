import java.util.Scanner;
public class caja {
    public static void main(String[] args) {
        int n1 = 0 ;
        int n2 = 0 ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Valor del articulo: ");
        n1=leer.nextInt();
        System.out.println("con cuanto pagará: ");
        n2=leer.nextInt();
        int n3 = (n2 - n1);
        if (n1 > n2){
            System.out.println("Saldo insuficiente");
        }
        else {
            System.out.println("Compra exitosa, tu cambio es de " + n3);
        }
    }
}