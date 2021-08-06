package lab3p2_pabloguevara;

public class entidades {
    private String nombre;
    private String apellido;
    private String ID;
    private String usuario;
    private String contraseña;

    public entidades() {
    }

    public entidades(String nombre, String apellido, String ID, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Entidades: {" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
