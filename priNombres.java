import java.util.Scanner;
import javax.swing.JOptionPane;

public class priNombres {
    Scanner leer = new Scanner(System.in);
    int nElementos;
    
    public void cantidadNombres(){
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de nombres que ingresara"));

        String [] nombres = new String [nElementos]; 

        System.out.println("Digite los nombres del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+ ". Digite un nombre: ");
            nombres[i] = leer.next();
        }

        System.out.println("\n Los nombres son : ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(nombres[i]);
        }
    }
}
