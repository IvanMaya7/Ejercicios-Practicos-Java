import java.util.Scanner;

class cajaas {
    private double totalAPagar;
    private double montoPagado;

    public cajaas(double totalAPagar, double montoPagado) {
        this.totalAPagar = totalAPagar;
        this.montoPagado = montoPagado;
    }

    public double calcularCambio() {
        return montoPagado - totalAPagar;
    }

    public void mostrarCambio() {
        double cambio = calcularCambio();
        if (cambio < 0) {
            System.out.println("El monto pagado no es suficiente.");
            return;
        }

        System.out.println("Cambio a devolver: " + cambio);
        desglosarCambio(cambio);
    }

    public void pedir() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad a pagar: ");
        totalAPagar = scanner.nextDouble();

        System.out.print("Ingrese la cantidad con la que pagará: ");
        montoPagado = scanner.nextDouble(); 

        mostrarCambio();
    }

    private void desglosarCambio(double cambio) {
        int[] denominaciones = {1000, 500, 200, 100, 50, 20}; 
        double[] centavos = {10, 5, 2, 1, 0.50}; 

        for (int denom : denominaciones) {
            int cantidad = (int) (cambio / denom);
            if (cantidad > 0) {
                System.out.println(cantidad + " billete(s) de " + denom);
                cambio -= cantidad * denom;
            }
        }

        for (double centavo : centavos) {
            int cantidad = (int) (cambio / centavo);
            if (cantidad > 0) {
                System.out.println(cantidad + " moneda(s) de " + centavo);
                cambio -= cantidad * centavo;
            }
        }

        if (cambio > 0) {
            System.out.println("Cambio restante: " + cambio);
        }
    }
}


