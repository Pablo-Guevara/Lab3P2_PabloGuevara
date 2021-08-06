package lab3p2_pabloguevara;

public class motoristas extends entidades{
    private String puesto;
    private int añosEnCargo;
    private double salarioBase;
    private double comisiones;
    private String medioTransporte;
    private int cantMaxEncargos;

    public motoristas() {
        super();
    }

    public motoristas(String puesto, int añosEnCargo, double salarioBase, double comisiones, String medioTransporte, int cantMaxEncargos) {
        this.puesto = puesto;
        this.añosEnCargo = añosEnCargo;
        this.salarioBase = salarioBase;
        this.comisiones = comisiones;
        this.medioTransporte = medioTransporte;
        this.cantMaxEncargos = cantMaxEncargos;
    }

    public motoristas(String puesto, int añosEnCargo, double salarioBase, double comisiones, String medioTransporte, int cantMaxEncargos, String nombre, String apellido, String ID, String usuario, String contraseña) {
        super(nombre, apellido, ID, usuario, contraseña);
        this.puesto = puesto;
        this.añosEnCargo = añosEnCargo;
        this.salarioBase = salarioBase;
        this.comisiones = comisiones;
        this.medioTransporte = medioTransporte;
        this.cantMaxEncargos = cantMaxEncargos;
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

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public int getCantMaxEncargos() {
        return cantMaxEncargos;
    }

    public void setCantMaxEncargos(int cantMaxEncargos) {
        this.cantMaxEncargos = cantMaxEncargos;
    }

    @Override
    public String toString() {
        return super.toString()+ "motoristas{" + "puesto=" + puesto + ", añosEnCargo=" + añosEnCargo + ", salarioBase=" + salarioBase + ", comisiones=" + comisiones + ", medioTransporte=" + medioTransporte + ", cantMaxEncargos=" + cantMaxEncargos + '}';
    }
    
    
}
