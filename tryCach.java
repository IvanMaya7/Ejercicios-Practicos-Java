import java.util.Scanner;

public class tryCach {
    public static void main(String[] args) {
        
        int  numero;
        boolean flag = true;
        do { 
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduce el numero: ");
            try{
                numero = leer.nextInt();
        } catch(Exception e) {
            System.err.println("Esta aplicacion solo acepta numeros.");
        }
        } while (flag);
    }    
}
