public class DescuentoPorcentaje implements Descuento{
    private Double valorDescuento;
    public DescuentoPorcentaje(Double valorPorcentaje){
        this.valorDescuento = valorPorcentaje;
    }

    @Override
    public Double calcularElDescuento(Double total) {
        return total * valorDescuento / 100;
    }
}
