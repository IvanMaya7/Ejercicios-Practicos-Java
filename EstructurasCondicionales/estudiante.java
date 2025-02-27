public class estudiante {
    private int matricula=0;
    private  String nombre="";
    private  String apellido="";
    private  int edad=0;
    private String TipoSangre="";

    public void setmatricula(int id){
        matricula=id;
    }

    public void setnombre(String name){
        nombre=name;
    }

    public void setapellido (String lastname){
        apellido=lastname;
    }

    public void setedad (int age){
        edad=age;
    }

    public void setTipoSangre(String sangre){
        TipoSangre=sangre;
    }

    public String getNombre(){
        return nombre + " " + apellido;
    }

    public void DatosPersonales(){
        System.out.println("La matricula es: " + matricula);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("edad: " + edad);
    }
}
