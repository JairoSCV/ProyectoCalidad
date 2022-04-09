package clases_padres;

public class Lista_de_Pedidos {
    protected String ID_pedido;
    protected String Material;
    protected double Peso_total;
    protected String ID_trabajador;
    protected String Estado;

    public Lista_de_Pedidos(String ID_pedido, String Material, double Peso_total, String ID_trabajador, String Estado) {
        this.ID_pedido = ID_pedido;
        this.Material = Material;
        this.Peso_total = Peso_total;
        this.ID_trabajador = ID_trabajador;
        this.Estado = Estado;
    }

    public String getID_pedido() {
        return ID_pedido;
    }

    public void setID_pedido(String ID_pedido) {
        this.ID_pedido = ID_pedido;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public double getPeso_total() {
        return Peso_total;
    }

    public void setPeso_total(double Peso_total) {
        this.Peso_total = Peso_total;
    }

    public String getID_trabajador() {
        return ID_trabajador;
    }

    public void setID_trabajador(String ID_trabajador) {
        this.ID_trabajador = ID_trabajador;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }      
}