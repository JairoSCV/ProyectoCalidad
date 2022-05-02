package clases_padres;

public class Direccion {
protected String direccion,estado;
protected String ID;
protected String Solicitud_Articulo;

    public Direccion(String direccion, String estado, String ID, String Solicitud_Articulo) {
        this.direccion = direccion;
        this.estado = estado;
        this.ID = ID;
        this.Solicitud_Articulo = Solicitud_Articulo;
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

    public String getSolicitud_Articulo() {
        return Solicitud_Articulo;
    }

    public void setSolicitud_Articulo(String Solicitud_Articulo) {
        this.Solicitud_Articulo = Solicitud_Articulo;
    }

    
}