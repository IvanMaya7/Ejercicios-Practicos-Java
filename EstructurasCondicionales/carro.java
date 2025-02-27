public class carro {
    public String color="";
    public String marca="";
    public String modelo="";
    public String motor="";
    public String tamao="";
    public int precio=0;

    public void encender(){
        System.out.println("Encendido...");
    }
    public void apagar(){
        System.out.println("Apagado...");
    }
    public void correr(){
        System.out.println("Esta corriendo...");
    }
    public void parar(){
        System.out.println("El carro esta parado...");
    }
    public void datosCarro(){
        System.out.println("El carro es: " + marca + " Color: " + color + " y si precio es de: " + precio);
    }
}

class Principal {
    public static void main(String[] args) {
        carro carro1=new carro();
        carro1.marca="Toyota";
        carro1.color="Rojo";
        carro1.modelo="2020";
        carro1.motor="V12";
        carro1.tamao="XXL";
        carro1.precio=1000;
        carro1.datosCarro();

        carro carro2=new carro();
        carro2.marca="Ford";
        carro2.color="Rosita";
        carro2.modelo="1879";
        carro1.motor="V12";
        carro2.tamao="nene";
        carro2.precio=110000000;
        carro2.datosCarro();
        carro2.parar();
    }
}