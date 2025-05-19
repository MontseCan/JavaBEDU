public class Factura {

    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "🧾 Factura [folio = " + folio + ", cliente = " + cliente + ", " +
                "total = $" + total + "]";
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true; // Mismo objeto en memoria
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Factura otra = (Factura) objeto;
        return this.folio.equals(otra.folio); // Comparamos solo el folio
    }

    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
