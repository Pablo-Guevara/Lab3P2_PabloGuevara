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
    
    
}
