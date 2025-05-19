import java.util.Scanner;

public class CajeroAutomatico{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        var saldo = 1000.00;
        int opcion;

        do{
        System.out.println("\nBienvenido al cajero automático");
        System.out.println("✅ 1. Consultar saldo");
        System.out.println("\uD83D\uDCB0 2. Depositar dinero");
        System.out.println("\uD83D\uDCB8 3. Retirar dinero");
        System.out.println("\uD83D\uDC4B 4. Salir");
        System.out.print("Seleccionar una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("\nSaldo actual: $" + saldo);
            }

            case 2 -> {
                System.out.print("\n\uD83D\uDCB0 Monto a depositar: ");
                double deposito = entrada.nextDouble();

                if (deposito <= 0) {
                    System.out.println("⚠️ El monto debe ser mayor a 0.");
                    continue;
                }
                saldo += deposito;

                System.out.println("\n✅ Depósito realizado");
                System.out.println("Saldo actualizado: $" + saldo);
            }

            case 3 -> {
                System.out.print("\n\uD83D\uDCB8 Monto a retirar: ");
                double retiro = entrada.nextDouble();

                if (retiro <= 0) {
                    System.out.println("⚠️ El monto debe ser mayor a 0.");
                    continue;
                }

                if (retiro > saldo) {
                    System.out.println("❌ Saldo insuficiente");
                    continue;
                }
                saldo += retiro;

                System.out.println("✅ Retiro realizado");
                System.out.println("Saldo restante: $" + saldo);

            }

            case 4 -> {
                System.out.println("\n👋 Gracias por usar el cajero.");
            }
            default -> {
                // Opción no válida
                System.out.println("🚫 Opción inválida. Intenta nuevamente.");
            }
        }

        } while (opcion !=4);
        entrada.close();
    }
}