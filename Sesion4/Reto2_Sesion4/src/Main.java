public class Main {
    public static void main(String[] args) {

        //Creación una declaración de impuestos.
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        //Creación una cuenta fiscal.
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        //Muestra la información de ambas.
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() + ", saldo disponible: $" + cuenta.getSaldoDisponible());

        //Valida si el RFC coincide y muestra el resultado.
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}