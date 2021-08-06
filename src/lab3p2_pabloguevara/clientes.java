package lab3p2_pabloguevara;

public class clientes extends entidades{
    private String domicilio;
    private int cantVecesPedidoApp;

    public clientes() {
        super();
    }

    public clientes(String domicilio, int cantVecesPedidoApp) {
        this.domicilio = domicilio;
        this.cantVecesPedidoApp = cantVecesPedidoApp;
    }

    public clientes(String domicilio, int cantVecesPedidoApp, String nombre, String apellido, String ID, String usuario, String contraseña) {
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

    public int getCantVecesPedidoApp() {
        return cantVecesPedidoApp;
    }

    public void setCantVecesPedidoApp(int cantVecesPedidoApp) {
        this.cantVecesPedidoApp = cantVecesPedidoApp;
    }

  

    @Override
    public String toString() {
        return super.toString()+ "Clientes{" + "Domicilio=" + domicilio + ", cantidad de Veces Pedidos en la App=" + cantVecesPedidoApp + '}';
    }
    
}
