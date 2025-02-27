import java.util.Scanner;
public class porcentaje {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner hombre = new Scanner(System.in);
        System.out.println("Escribe el numero de hombres: ");
        n1=hombre.nextInt();
        Scanner mujeres = new Scanner(System.in);
        System.out.println("Escribe el número de mujeres: ");
        n2=mujeres.nextInt();
        int suma = (n1 + n2);
        double porh = (n1 * 100 / suma);
        double porm = (n2 * 100 / suma);
        System.out.println("la suma es " + suma);
        System.out.println("el porcentaje de hombres es %" + porh);
        System.out.println("el porcentaje de mujeres es %" + porm);
    }
}