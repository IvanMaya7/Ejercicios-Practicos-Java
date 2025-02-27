import java.util.Scanner;

public class pirRomanos {
    public int numero;
    public String numeroRomano;

    public void recibir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        numero = leer.nextInt();

        if (numero < 1 || numero > 3999) {
            System.out.println("El número debe estar entre el 1 y el 3999.");
        } else {
            numeroRomano = convertirRomano();
            System.out.println(numero + " en número romano es: " + numeroRomano);
        }
    }

    public String convertirRomano() {
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] miles = {"", "M", "MM", "MMM"};

        int indexmil, indexcen, indexdec, indexuni;

        indexmil = numero / 1000;
        numero = numero % 1000;
        indexcen = numero / 100;
        numero = numero % 100;
        indexdec = numero / 10;
        indexuni = numero % 10;

        return miles[indexmil] + centenas[indexcen] + decenas[indexdec] + unidades[indexuni];
    }

}
