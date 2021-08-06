package lab3p2_pabloguevara;

import java.util.ArrayList;

public class restaurante {
    private String nombre;
    private String ubicacion;
    private String RTN;
    private String slogan;
    
    private ArrayList<comida> listaComidas=new ArrayList();

    public restaurante() {
    }

    public restaurante(String nombre, String ubicacion, String RTN, String slogan) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.RTN = RTN;
        this.slogan = slogan;
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

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList<comida> getListaComidas() {
        return listaComidas;
    }

    public void setListaComidas(ArrayList<comida> listaComidas) {
        this.listaComidas = listaComidas;
    }

    @Override
    public String toString() {
        return "restaurante{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", RTN=" + RTN + ", slogan=" + slogan + ", listaComidas=" + listaComidas + '}';
    }
    
    
}
