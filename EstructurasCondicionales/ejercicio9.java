import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("programa para ordenar 5 numero e inidicar cual es mayor y menor");
        System.out.println("ingrese el numero 1: ");
        a= leer.nextInt();
        System.out.println("ingrese el numero 2: ");
        b=  leer.nextInt();
        System.out.println("ingrese el numero 3: ");
        c= leer.nextInt();
        System.out.println("ingrese el numero 4: ");
        d= leer.nextInt();
        System.out.println("ingrese el numero 5: ");

        e= leer.nextInt();
        if (a > b && a > c && a > d && a > e)
        System.out.printf("El numero mayor es "+ a +" y ");

    if (b > a && b > c && b > d && b > e)
        System.out.printf("El numero mayor es "+ b +" y ");

    if (c > a && c > b && c > d && c > e)
        System.out.printf("El numero mayor es "+ c+" y ");

    if (d > a && d > b && d > c && d > e)
        System.out.printf("El numero mayor es "+ e+" y ");

    if (e > a && e > b && e > c && e > d)
        System.out.printf("El numero mayor es "+ e+" y ");

    ////////////////////////////////////////////////////////////////////
    if (a < b && a < c && a < d && a < e)
        System.out.printf("El numero menor es "+ a);

    if (b < a && b < c && b < d && b < e)
        System.out.printf("El numero menor es "+ b);

    if (c < a && c < b && c < d && c < e)
        System.out.printf("El numero menor es "+ c);

    if (d < a && d < b && d < c && d < e)
        System.out.printf("El numero menor es "+ d);

    if (e < a && e < b && e < c && e < d)
        System.out.printf("El numero menor es "+ e);
    }
}
