public class Entrada_record {
    public record Entrada(String nomEvento, double precio) {
        //Método
        public void mostrarInformacion(){
            System.out.println("Evento: " + nomEvento + " | " + "Precio: $" + precio);
        }
    }
}
