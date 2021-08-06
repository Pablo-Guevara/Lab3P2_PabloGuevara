package lab3p2_pabloguevara;

public class articulos {
    private String nombre;
    private String categoria;
    private double precio;

    public articulos() {
    }

    public articulos(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "articulos{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
    
    
}
