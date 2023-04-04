public class DescuentoTopePorcentaje implements Descuento{

    private Double porcentaje;
    private Double tope;
    private Double descuentoTope;
    public DescuentoTopePorcentaje(Double porcentaje, Double tope){
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    @Override
    public Double calcularElDescuento(Double total) {
        porcentaje = total * porcentaje / 100;
        descuentoTope = total * tope / 100;

        if(porcentaje > descuentoTope){
            return descuentoTope;
        }
        else{
            return porcentaje;
        }
    }
}
