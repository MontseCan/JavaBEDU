public class Entrada {
    //Atributo
    String nomEvento;
    double precio;

    //Contructor
    public Entrada(String nomEvento, double precio) {
        this.nomEvento = nomEvento;
        this.precio = precio;
    }
    //Método
    public void mostrarInformacion(){
        System.out.println("Evento: " + nomEvento + " | " + "Precio: $" + precio);
    }
}
