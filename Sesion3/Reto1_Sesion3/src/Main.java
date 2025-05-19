public class Main {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("Montserrat Can", "MCS200");
        Pasajero p2 = new Pasajero("Ana Martínez", "MCS200");
        Vuelo v1 = new Vuelo("V1X345", "Seul", "20:00");

        // Reservar asiento
        boolean reservar1 = v1.reservarAsiento(p1);
        if (reservar1) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        System.out.println(v1.obtenerItinerario());

        System.out.println("❌ Cancelando reserva...\n");
        v1.cancelarReserva();

        System.out.println(v1.obtenerItinerario());

        boolean reservar2 = v1.reservarAsiento(p2);
        if (reservar2) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        System.out.println(v1.obtenerItinerario());

    }
}