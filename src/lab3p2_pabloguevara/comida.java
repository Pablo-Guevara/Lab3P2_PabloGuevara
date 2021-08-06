package lab3p2_pabloguevara;

import java.util.ArrayList;

public class comida {
    private String nombreComida;
    private double acompañamiento;
    private int cantAcompañamientos;
    
    private ArrayList<acompañamiento> listaAcompañamientos=new ArrayList();

    public comida() {
    }

    public comida(String nombreComida, double acompañamiento, int cantAcompañamientos) {
        this.nombreComida = nombreComida;
        this.acompañamiento = acompañamiento;
        this.cantAcompañamientos = cantAcompañamientos;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public double getAcompañamiento() {
        return acompañamiento;
    }

    public void setAcompañamiento(double acompañamiento) {
        this.acompañamiento = acompañamiento;
    }

    public int getCantAcompañamientos() {
        return cantAcompañamientos;
    }

    public void setCantAcompañamientos(int cantAcompañamientos) {
        this.cantAcompañamientos = cantAcompañamientos;
    }

    public ArrayList<acompañamiento> getListaAcompañamientos() {
        return listaAcompañamientos;
    }

    public void setListaAcompañamientos(ArrayList<acompañamiento> listaAcompañamientos) {
        this.listaAcompañamientos = listaAcompañamientos;
    }



    @Override
    public String toString() {
        return "comida{" + "nombreComida=" + nombreComida + ", acompa\u00f1amiento=" + acompañamiento + ", cantAcompa\u00f1amientos=" + cantAcompañamientos + ", listaAcompa\u00f1amientos=" + listaAcompañamientos + '}';
    }

   
    
    
}
