import java.util.Scanner;
public class mayorymenor {
    public static void main(String[] args) {
        int num=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        num=leer.nextInt();
        int mayor=num;
        int menor=num;

        for (int i = 0; i < 4; i++) {
            System.out.println("escribe el siguiente numero: ");
            num=leer.nextInt();
            if (num>mayor){
                mayor = num;
            }
            else if (num<menor){
                menor=num;
            }
        }
        System.out.println("El numero mayor es " + mayor + ", y el numero menor es de " + menor);
    }
}
