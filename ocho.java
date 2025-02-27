import java.util.Scanner;

public class ocho {

    public void aplicacion() {
        int[] numeros = new int[8];
        Scanner leer = new Scanner(System.in);

        // Paso 1: Ingresar 8 números
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ":");
            numeros[i] = leer.nextInt();
        }

        // Paso 2: Mostrar los números ingresados
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Paso 3: Pedir al usuario que elija un número
        int num = -1;
        boolean numeroValido = false;
        
        while (!numeroValido) {
            System.out.println("Ingresa el número que deseas elegir (debe estar en el arreglo):");
            num = leer.nextInt();

            // Validar que el número ingresado esté en el arreglo
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == num) {
                    numeroValido = true; // El número está en el arreglo
                    break; // Salimos del ciclo
                }
            }

            if (!numeroValido) {
                System.out.println("El número que ingresaste no está en el arreglo. Por favor, intenta nuevamente.");
            }
        }

        // Paso 4: Mostrar los números menores que el número elegido
        boolean hayMenores = false;
        System.out.println("Los números menores a " + num + " son:");

        // Recorrer todo el arreglo y mostrar los números menores
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < num) {
                System.out.print(numeros[i] + " ");
                hayMenores = true;
            }
        }

        // Si no hay números menores, mostrar mensaje
        if (!hayMenores) {
            System.out.println("No hay números menores a " + num);
        }

        leer.close();
    }
}






/*import java.util.Scanner;
public class ocho {

    public void aplicacion(){
    int [] numeros = new int [8];
    for (int i =0; i < 8; i++) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero " + (i+1) + ":" );
        numeros[i] = leer.nextInt();
    }
    System.out.println("Los numeros ingresados son: ");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
        System.out.println(" ");
    }

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa el numero que deseas elegir:");
    int num = leer.nextInt();
    for (int i = 0; i < 8; i++) {
        if (num == numeros[i]){
            boolean hayMenores = false;
            for (int y = 0; y < numeros.length; y++) {
                if (numeros[i] < num) {
                    System.out.print("Los numeros menores a " + num + "son " + numeros[i] + " ");
                    hayMenores = true;
                }
            }    
        }
    }
    }
} */
