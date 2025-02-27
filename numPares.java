import java.util.Scanner;

public class numPares{
    

    public void metodoOne() {
        Scanner leer = new Scanner (System.in);
        int [] valores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero "+ (i+1));
            int num = leer.nextInt();
            if (num % 2 == 0){
                valores[i] = num;
            }else {
                valores[i]=0;
                System.out.println("Este numero no es par");
            }
        }
        System.out.println("----------------");
        for (int i = 0; i < 5; i++) {
            if (valores[i] > 0){
                System.out.println(valores[i]);
            }
        }
    }
}