package lab3p2_pabloguevara;

public class programadores extends entidades{
    private String puesto;
    private int añosEnCargo;
    private double salarioBase;
    private String lenguajeProgaDomina;
    private String horario;

    public programadores() {
        super();
    }

    public programadores(String puesto, int añosEnCargo, double salarioBase, String lenguajeProgaDomina, String horario) {
        this.puesto = puesto;
        this.añosEnCargo = añosEnCargo;
        this.salarioBase = salarioBase;
        this.lenguajeProgaDomina = lenguajeProgaDomina;
        this.horario = horario;
    }

    public programadores(String puesto, int añosEnCargo, double salarioBase, String lenguajeProgaDomina, String horario, String nombre, String apellido, String ID, String usuario, String contraseña) {
        super(nombre, apellido, ID, usuario, contraseña);
        this.puesto = puesto;
        this.añosEnCargo = añosEnCargo;
        this.salarioBase = salarioBase;
        this.lenguajeProgaDomina = lenguajeProgaDomina;
        this.horario = horario;
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

    public String getLenguajeProgaDomina() {
        return lenguajeProgaDomina;
    }

    public void setLenguajeProgaDomina(String lenguajeProgaDomina) {
        this.lenguajeProgaDomina = lenguajeProgaDomina;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Programadores: {" + "puesto=" + puesto + ", años en el Cargo=" + añosEnCargo + ", salarioBase=" + salarioBase + ", lenguajeProgaDomina=" + lenguajeProgaDomina + ", horario=" + horario + '}';
    }
    
    
    
}
