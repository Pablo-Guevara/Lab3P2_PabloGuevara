package lab3p2_pabloguevara;

import java.util.ArrayList;

public class tienda {
    private String nombre;
    private String ubicacion;
    private String cantEmpleados;
    private double tiempoEsperaPreparacionMinutos;
    private ArrayList<articulos> listaArticulos=new ArrayList();

    public tienda() {
    }

    public tienda(String nombre, String ubicacion, String cantEmpleados, double tiempoEsperaPreparacionMinutos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantEmpleados = cantEmpleados;
        this.tiempoEsperaPreparacionMinutos = tiempoEsperaPreparacionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(String cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public double getTiempoEsperaPreparacionMinutos() {
        return tiempoEsperaPreparacionMinutos;
    }

    public void setTiempoEsperaPreparacionMinutos(double tiempoEsperaPreparacionMinutos) {
        this.tiempoEsperaPreparacionMinutos = tiempoEsperaPreparacionMinutos;
    }

    public ArrayList<articulos> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<articulos> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    @Override
    public String toString() {
        return "tienda{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", cantEmpleados=" + cantEmpleados + ", tiempoEsperaPreparacionMinutos=" + tiempoEsperaPreparacionMinutos + ", listaArticulos=" + listaArticulos + '}';
    }
    
    
}
