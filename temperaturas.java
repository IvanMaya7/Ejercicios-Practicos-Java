import java.util.Scanner;

public class temperaturas {
    public static void main(String[] args) {
        System.out.println("Este programa le la temperatura de 7 dias e imprime la media.");  
        Scanner leer = new Scanner(System.in);
        Scanner ele = new Scanner(System.in);
        int nTem;
        String [] dias = {"", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.println("Ingrese la cantidad de temperaturas que desea calcular");
        nTem = ele.nextInt();
        if (nTem > 1){
            int [] nombres = new int [nTem]; 
            System.out.println("Digite las temperaturas del arreglo: ");
            for (int i = 0; i < nTem; i++) {
                System.out.println((i+1)+ ". Digite la temperatura: ");
                nombres[i] = leer.nextInt();
            }

            double promedio= 0;
            double suma = 0;
            for (double a : nombres) {
                suma= suma + a;
                promedio = suma / nTem;
            }
            System.out.println("El promedio de las temperaturas es: " + Math.round(promedio));
            
            int incre = 0;
            int igual = 0;
            double r = 0;
            for (double j : nombres){

                r = Math.round(promedio);
                incre++;
                if (r == j){
                    igual++;
                    System.out.println("igual a la media son: " + igual);
                    System.out.println("La posicion igual a la media es: " + incre);
                    System.out.println("El dia es " + dias[incre]);
                    System.out.println("y el valor es " + r);

                }
            }

        }else{
            System.out.println("Debe ingresar al menos una temperatura.");
        }


    }
}

