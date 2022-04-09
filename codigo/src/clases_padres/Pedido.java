package clases_padres;

public class Pedido {
	protected String N_boleta; //PRIMARY KEY
	protected String DNI_cliente; //FOREIGN KEY(Cliente)
	protected String contrasenia_pedido;
        protected String fecha;

    public Pedido(String N_boleta, String DNI_cliente, String contrasenia_pedido, String fecha) {
        this.N_boleta = N_boleta;
        this.DNI_cliente = DNI_cliente;
        this.contrasenia_pedido = contrasenia_pedido;
        this.fecha = fecha;
    }

    public String getN_boleta() {
        return N_boleta;
    }

    public void setN_boleta(String N_boleta) {
        this.N_boleta = N_boleta;
    }

    public String getDNI_cliente() {
        return DNI_cliente;
    }

    public void setDNI_cliente(String DNI_cliente) {
        this.DNI_cliente = DNI_cliente;
    }

    public String getContrasenia_pedido() {
        return contrasenia_pedido;
    }

    public void setContrasenia_pedido(String contrasenia_pedido) {
        this.contrasenia_pedido = contrasenia_pedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
	
}
