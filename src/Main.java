public class Main {
    public static void main(String[] args) {

        //Creo los productos.
        Producto prodLimpieza1 = new Producto("jabón en polvo", 40.0);
        Producto prodLimpieza2 = new Producto("esponjas", 10.0);
        Producto prodLimpieza3 = new Producto("chocolates", 100.0);

        //Creo a la persona con carrito y obtengo el carrito por separado.
        Persona Franco = new Persona("Franco");
        Carrito miCarrito  = Franco.getCarrito();

        //Creo los descuentos fijo y por porcentaje con valores aleatorios
        Descuento descuentoFijo = new DescuentoFijo(30.0);
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(30.0);
        Descuento descuentoTopePorcentaje = new DescuentoTopePorcentaje(10.0, 20.0);

        //Le agrego al carrito que separé para manipular productos de limpieza.
        miCarrito.agregarProducto(prodLimpieza1.darNombre(), prodLimpieza1.darPrecio(), descuentoPorcentaje);
        miCarrito.agregarProducto(prodLimpieza2.darNombre(), prodLimpieza2.darPrecio(), descuentoPorcentaje);
        miCarrito.agregarProducto(prodLimpieza3.darNombre(), prodLimpieza3.darPrecio(), descuentoTopePorcentaje);

        //Imprimo el método que devuelve la suma de los productos del carrito de Franco con el tipo de descuento
        //elegido en el tercer parámetro del método agregarProducto de miCarrito.
        System.out.println(miCarrito.precio());



    }
}