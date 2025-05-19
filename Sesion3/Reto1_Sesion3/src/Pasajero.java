public class Pasajero {
    String nombre;
    String pasaporte;

    Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
    String getNombre(){
        return nombre;
    }
    String getPasaporte(){
        return pasaporte;
    }

}
