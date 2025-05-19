import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el nombre del medicamento: ");
        String medicamento = entrada.nextLine();

        System.out.print("Introduzca el precio unitario: ");
        double precio = entrada.nextInt();

        System.out.print("Introduzca la cantidad de piezas: ");
        int cantidad = entrada.nextInt();

        double total = precio*cantidad;

        var aplicaDescuento = total>500;
            double descuento = aplicaDescuento ? total*0.15 : 0;


        double totalFinal = total-descuento;

        System.out.println("\nMedicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

    }
}
