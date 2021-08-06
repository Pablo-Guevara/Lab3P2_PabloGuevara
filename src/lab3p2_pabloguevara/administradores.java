package lab3p2_pabloguevara;

public class administradores extends entidades{
    private String puesto;
    private int añosEnCargo;
    private double salarioBase;
    private int añosExpVentas;

    public administradores() {
        super();
    }

    public administradores(String puesto, int añosEnCargo, double salarioBase, int añosExpVentas) {
        this.puesto = puesto;
        this.añosEnCargo = añosEnCargo;
        this.salarioBase = salarioBase;
        this.añosExpVentas = añosExpVentas;
    }

    public administradores(String puesto, int añosEnCargo, double salarioBase, int añosExpVentas, String nombre, String apellido, String ID, String usuario, String contraseña) {
        super(nombre, apellido, ID, usuario, contraseña);
        this.puesto = puesto;
        this.añosEnCargo = añosEnCargo;
        this.salarioBase = salarioBase;
        this.añosExpVentas = añosExpVentas;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAñosEnCargo() {
        return añosEnCargo;
    }

    public void setAñosEnCargo(int añosEnCargo) {
        this.añosEnCargo = añosEnCargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAñosExpVentas() {
        return añosExpVentas;
    }

    public void setAñosExpVentas(int añosExpVentas) {
        this.añosExpVentas = añosExpVentas;
    }

    @Override
    public String toString() {
        return "Administradores: {" + "puesto=" + puesto + ", años en el Cargo=" + añosEnCargo + ", salarioBase=" + salarioBase + ", a\u00f1osExpVentas=" + añosExpVentas + '}';
    }
    
    
}
