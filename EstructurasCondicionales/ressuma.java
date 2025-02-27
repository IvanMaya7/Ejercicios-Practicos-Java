public class ressuma {
    public static void main(String[] args) {
        claseSuma suma= new claseSuma();
        suma.setn1(10);
        suma.setn2(5);
        System.out.println("El resultado de la suma es: " + suma.Resultado());
        System.out.println("El resultado de la resta es: " + suma.resta());
        System.out.println("El resultado de la multiplicacion es: " + suma.multiplicacion());
        System.out.println("El resultado de la division es: " + suma.division());
    }
}
