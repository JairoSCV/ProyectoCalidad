package clases_padres;

public class Direccion {
protected String direccion,estado;
protected String ID;

    public Direccion(String direccion, String estado, String ID) {
        this.direccion = direccion;
        this.estado = estado;
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
}