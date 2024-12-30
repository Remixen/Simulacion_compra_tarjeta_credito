public class Compra implements Comparable<Compra> {
    private double valor;
    private String descripccion;

    public Compra(double valor, String descripccion) {
        this.valor = valor;
        this.descripccion = descripccion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripccion;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripccion='" + descripccion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
