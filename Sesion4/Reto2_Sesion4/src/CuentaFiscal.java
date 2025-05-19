import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            this.saldoDisponible = 0;
        }
    }

    public String getRfc () {
        return rfc;
    }
    public double getSaldoDisponible () {
        return saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos declaracion) {
        return Objects.equals(this.rfc, declaracion.rfcContribuyente());
    }


}
