import java.util.Scanner;
import javax.swing.JOptionPane;

public class priPar {
    public int nElementos;
    public int[] nombres;
    public int pares = 0;
    public int impares = 0;

    public void llenarArreglo() {
        Scanner leer = new Scanner(System.in);
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de números que ingresará"));

        nombres = new int[nElementos]; 

        System.out.println("Digite los números del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite los números: ");
            nombres[i] = leer.nextInt();
        }
        System.out.println("\nLos números son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(nombres[i]);
        }   
    }

    public void numerosPares() {
        
        for (int b : nombres) {
            if (b % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nhay " + pares + " números pares en el arreglo");
        System.out.println("hay " + impares + " números impares en el arreglo");
    }
}
