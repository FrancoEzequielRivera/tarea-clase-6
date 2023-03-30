public class Carrito {
    private String prods[] = new String[3];
    private Double precios[] = new Double[3];
    private int cont = 0;
    private Descuento descuento;

    public Carrito(){
    }

    public void agregarProducto(String producto, Double precioUnit, Descuento descuento){
        this.precios[cont] = precioUnit;
        this.prods[cont]   = producto;
        this.descuento = descuento;
        cont = cont + 1;
    }
    public double precio(){
        return ((precios[0] - descuento.calcularElDescuento(precios[0])) + (precios[1] - descuento.calcularElDescuento(precios[1])) + (precios[2] - descuento.calcularElDescuento(precios[2])));
    }

}
