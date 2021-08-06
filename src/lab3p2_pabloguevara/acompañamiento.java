package lab3p2_pabloguevara;

public class acompañamiento{
    private String nombreAcompañamiento;
    private String tipo;
    private double precioAdicional;

    public acompañamiento() {
    }

    public acompañamiento(String nombreAcompañamiento, String tipo, double precioAdicional) {
        this.nombreAcompañamiento = nombreAcompañamiento;
        this.tipo = tipo;
        this.precioAdicional = precioAdicional;
    }

    public String getNombreAcompañamiento() {
        return nombreAcompañamiento;
    }

    public void setNombreAcompañamiento(String nombreAcompañamiento) {
        this.nombreAcompañamiento = nombreAcompañamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    @Override
    public String toString() {
        return "acompañamiento{" + "nombreAcompañamiento=" + nombreAcompañamiento + ", tipo=" + tipo + ", precioAdicional=" + precioAdicional + '}';
    }
    
    
}
