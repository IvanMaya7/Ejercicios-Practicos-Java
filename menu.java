import java.util.Scanner;
public class menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = {"manzana", "banana", "naranja", "uva", "pera"};
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("a) Mostrar palabras");
            System.out.println("b) Reemplazar palabra");
            System.out.println("c) Salir");
            System.out.print("Selecciona una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    mostrarPalabras(palabras);
                    break;
                case "b":
                    System.out.print("Ingresa la palabra a reemplazar: ");
                    String palabraVieja = scanner.nextLine();
                    System.out.print("Ingresa la nueva palabra: ");
                    String nuevaPalabra = scanner.nextLine();
                    reemplazarPalabra(palabras, palabraVieja, nuevaPalabra);
                    break;
                case "c":
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }

    private static void mostrarPalabras(String[] palabras) {
        System.out.println("Palabras en el arreglo:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    private static void reemplazarPalabra(String[] palabras, String palabraVieja, String nuevaPalabra) {
        boolean encontrado = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraVieja)) {
                palabras[i] = nuevaPalabra;
                encontrado = true;
                System.out.println("Palabra reemplazada con éxito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La palabra no existe.");
        }
    }
}

