public class DescuentoFijo implements Descuento {
    private Double valorDescuento;
    public DescuentoFijo(Double valorFijo){
        this.valorDescuento = valorFijo;
    }

    @Override
    public Double calcularElDescuento(Double total) {
        return valorDescuento;
    }
}
