import java.util.Scanner;

public class priCalifi {
    Scanner leer = new Scanner(System.in);
    int nElementos;

    public void cali() {
        System.out.println("Ingrese la cantidad de calificaciones");
        nElementos = leer.nextInt();
        
        if (nElementos > 0) {
            int[] nombres = new int[nElementos]; 
            System.out.println("Digite las calificaciones del arreglo (deben estar entre 0 y 10): ");
            
            for (int i = 0; i < nElementos; i++) {
                int calificacion;
                while (true) {
                    System.out.print((i + 1) + ". Digite la calificacion: ");
                    calificacion = leer.nextInt();

                    if (calificacion >= 0 && calificacion <= 10) {
                        nombres[i] = calificacion;
                        break;
                    } else {
                        System.out.println("Error: La calificación debe estar entre 0 y 10. Inténtelo de nuevo.");
                    }
                }
            }
            
            System.out.println("\nLas calificaciones son: ");
            for (int i = 0; i < nElementos; i++) {
                System.out.println(nombres[i]);
            }

            double promedio;
            double suma = 0;
            for (double a : nombres) {
                suma = suma + a;
            }
            promedio = suma / nElementos;

            System.out.println("El promedio de las calificaciones es: " + promedio);
        } else {
            System.out.println("Debe ingresar al menos una calificacion");
        }
    }
}


