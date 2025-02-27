import java.util.Scanner;
public class palabras {
    public static void main(String[] args) {
        String pal1= "", pal2 ="", pal3="";
        int cont= 0, cont2= 0, cont3=0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe la primer palabra: ");
        pal1=leer.nextLine();
        System.out.println("Escribe la segunda palabra: ");
        pal2=leer.nextLine();
        System.out.println("Escribe la tercera palabra: ");
        pal3=leer.nextLine();

        cont = pal1.length();
        cont2 = pal2.length();
        cont3 = pal3.length();

        if (cont > cont2 && cont > cont3){
            System.out.println("La palabra mas larga es: " + pal1 + " con " + cont);
        }
        else if (cont < cont2 && cont2 > cont3) {
            System.out.println("La palabra mas larga es: " + pal2 + " con " + cont2);
        }
        else if (cont < cont3 && cont3 > cont2){
            System.out.println("La palabra mas larga es: " + pal3 + " con " + cont3);
        }
    }
}

