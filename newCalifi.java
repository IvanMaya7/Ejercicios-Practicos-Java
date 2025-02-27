import java.util.Scanner;

public class newCalifi {
    int[] califica = new int[7];
    Scanner leer = new Scanner(System.in);

    public void calificaciones() {

        for (int i = 0; i < 7; i++) {
            System.out.println("Digite la calificación " + (i + 1) + ":");
            int si = leer.nextInt();
            if (si >= 0 && si <= 10) {
                califica[i] = si;
            } else {
                System.out.println("La calificación debe estar entre 0 y 10.");
                i--;
            }
        }

        int mayor = califica[0];
        int menor = califica[0];

        for (int b : califica) {
            if (b > mayor) {
                mayor = b;
            }
            if (b < menor) {
                menor = b;
            }
        }

        System.out.println("La calificación mayor es: " + mayor);
        System.out.println("La calificación menor es: " + menor);
    }
}
