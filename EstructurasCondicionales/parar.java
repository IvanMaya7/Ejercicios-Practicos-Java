import java.util.Scanner;
public class parar {
    public static void main(String[] args) {
        String pa = "", p="parar", val="";
        boolean i =true;
        int po=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        pa=leer.nextLine();
        val=val + pa;
        if (pa.equals(p)){
        }
        else{
            while (i == true) {
                System.out.println("Escriba otra palabra");
                pa=leer.nextLine();
                val=val+pa;
                po++;
                if(pa.equals(p)){
                    i=false;
                }
            }
        }
        System.out.println("Se detuvo, la cantidad de palabras ingresadas fue de " + po);
        System.out.println("Las palabras escritas son: " + val);
    }
}
