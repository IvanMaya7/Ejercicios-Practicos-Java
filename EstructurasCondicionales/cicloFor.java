import java.util.Scanner;
public class cicloFor {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int par=0;
            System.out.println("este programa lee 6 numeros y dice si son pares o impares");
            for (int i = 1; i <= 6; i++) {
                System.out.println("Ingresa un número: ");
                int n=leer.nextInt();
                int res = n%2;
                if (res ==0){
                    par=par+1;
                }
                else if (true) {
                    
                }
            }
            System.out.println("hay " + par + " pares");
    }
}
