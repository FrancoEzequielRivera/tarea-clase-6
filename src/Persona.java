public class Persona {

    private String nombre;
    private Carrito miCarrito;


    public Persona(String unNombre){
        this.nombre = unNombre;
        this.miCarrito = new Carrito();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrito getCarrito() {
        return miCarrito;
    }

    public void setCarrito(Carrito miCarrito) {
        this.miCarrito = miCarrito;
    }
}
