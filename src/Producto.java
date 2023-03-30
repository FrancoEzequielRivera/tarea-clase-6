import java.time.LocalDate;

public class Producto {

    private String nombre;

    private Double precio;


    public Producto(String nombre, Double precioProd){
        this.nombre = nombre;
        this.precio = precioProd;
    }

    public String darNombre(){
        return this.nombre;
    }

    public double darPrecio(){
        return this.precio;
    }
}
