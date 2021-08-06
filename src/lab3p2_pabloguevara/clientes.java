package lab3p2_pabloguevara;

public class clientes extends entidades{
    private String domicilio;
    private String cantVecesPedidoApp;

    public clientes() {
        super();
    }

    public clientes(String domicilio, String cantVecesPedidoApp) {
        this.domicilio = domicilio;
        this.cantVecesPedidoApp = cantVecesPedidoApp;
    }

    public clientes(String domicilio, String cantVecesPedidoApp, String nombre, String apellido, String ID, String usuario, String contraseña) {
        super(nombre, apellido, ID, usuario, contraseña);
        this.domicilio = domicilio;
        this.cantVecesPedidoApp = cantVecesPedidoApp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCantVecesPedidoApp() {
        return cantVecesPedidoApp;
    }

    public void setCantVecesPedidoApp(String cantVecesPedidoApp) {
        this.cantVecesPedidoApp = cantVecesPedidoApp;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Domicilio=" + domicilio + ", cantidad de Veces Pedidos en la App=" + cantVecesPedidoApp + '}';
    }
    
}
