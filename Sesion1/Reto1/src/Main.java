import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        p1.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        p1.edad = scanner.nextInt();

        System.out.print("Ingresa el número de expediente del paciente: ");
        scanner.nextLine(); //limpiar buffer
        p1.numExp = scanner.nextLine();

        p1.mostrarInformacion();

    }
}