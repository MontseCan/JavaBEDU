public class CentralEmergencias {
    public static void main(String[] args) {

        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Montserrat");
        Patrulla patrulla = new Patrulla("Patrulla", "Juan");
        UnidadBomberos bomberos = new UnidadBomberos("Bomberos", "Jorge");

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();
    }
}