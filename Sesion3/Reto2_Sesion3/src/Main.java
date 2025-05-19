//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Factura f1= new Factura(2500.00, "Servicio de consultoría", "CASM001015CW8");
        Factura f2 = new Factura(1800.00, "Reparación de equipo", null);

        System.out.println(f1.getResumen());
        System.out.println(f2.getResumen());
    }
}