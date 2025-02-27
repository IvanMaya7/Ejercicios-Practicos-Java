public class principalEstudiante {
    public static void main(String[] args) {
        estudiante alumno1=new estudiante();
        alumno1.setmatricula(20230483);
        alumno1.setnombre("Ivan");
        alumno1.setapellido("Maya");
        alumno1.setTipoSangre("Roja");
        alumno1.setedad(19);
        //alumno1.DatosPersonales();
        System.out.println(alumno1.getNombre());
    }
}
