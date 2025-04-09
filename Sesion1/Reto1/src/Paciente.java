public class Paciente {
    //Atributos
    String nombre;
    int edad;
    String numExp;

    //Métodos
    public void mostrarInformacion() {
        System.out.println("Paciente: "+ nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numExp);
    }
}
