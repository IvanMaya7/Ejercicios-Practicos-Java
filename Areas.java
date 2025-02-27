import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        formulas area = new formulas();
        boolean con = true;
        Scanner leer = new Scanner(System.in);

        while (con) { 
            System.out.println("Este programa brinda el área de las siguientes figuras:");
            System.out.println("1. Círculo");
            System.out.println("2. Trapecio");
            System.out.println("3. Rectángulo");
            System.out.println("4. Pentágono");
            System.out.println("Escribe el numero de la figura que quiera calcular el area "); 
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el radio");
                    area.setV1(leer.nextInt());
                    System.out.println("El area del círculo es: " + area.areaCir());
                    break;

                case 2:
                    System.out.println("Ingrese la base mayor del trapecio: ");
                    area.setV1(leer.nextInt());
                    System.out.println("Ingrese la base menor del trapecio: ");
                    area.setV2(leer.nextInt());
                    System.out.println("Ingrese la altura del trapecio: ");
                    area.setV3(leer.nextInt());
                    System.out.println("El área del trapecio es: " + area.areaTri());
                    break;

                case 3:
                    System.out.println("Ingrese la base del rectángulo: ");
                    area.setV1(leer.nextInt());
                    System.out.println("Ingrese la altura del rectángulo: ");
                    area.setV2(leer.nextInt());
                    System.out.println("El área del rectángulo es: " + area.areaRec());
                    break;

                case 4:
                    System.out.println("Ingrese el lado del pentágono: ");
                    area.setV1(leer.nextInt());
                    System.out.println("Ingrese la apotema del pentágono: ");
                    area.setV2(leer.nextInt());
                    System.out.println("El área del pentágono es: " + area.areaPen());
                    break;

                default:
                    System.out.println("Error, vuelva a intentar.");
                    break;
            }

            System.out.println("¿Desea calcular el área de otra figura (S/N)? ");
            char res = leer.next().charAt(0);
            if (res == 'n' || res == 'N') {
                con = false;
            }

            }
        }
    }