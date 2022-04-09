package clases_padres;

public class Articulo_Pedido {
	protected String nroBoleta,idArticulo,medida,material;
	protected double peso,montoAmortiguado;
        protected int cantidad;
        protected String fabricacion,entrega,pago;
        protected String entrega_material;

    public Articulo_Pedido(String nroBoleta, String idArticulo, String medida, 
            String material, double peso, double montoAmortiguado, int cantidad,
            String fabricacion, String entrega, String pago, String entrega_material) {
        this.nroBoleta = nroBoleta;
        this.idArticulo = idArticulo;
        this.medida = medida;
        this.material = material;
        this.peso = peso;
        this.montoAmortiguado = montoAmortiguado;
        this.cantidad = cantidad;
        this.fabricacion=fabricacion;
        this.entrega=entrega;
        this.pago=pago;
        this.entrega_material=entrega_material;
    }

    public String getNroBoleta() {
        return nroBoleta;
    }
    public void setNroBoleta(String nroBoleta) {
        this.nroBoleta = nroBoleta;
    }
    public String getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }
    public String getMedida() {
        return medida;
    }
    public void setMedida(String medida) {
        this.medida = medida;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getMontoAmortiguado() {
        return montoAmortiguado;
    }
    public void setMontoAmortiguado(double montoAmortiguado) {
        this.montoAmortiguado = montoAmortiguado;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getFabricacion(){
        return fabricacion;
    }
    public void setFabricacion(String fabricacion){
        this.fabricacion=fabricacion;
    }
    public String getEntrega(){
        return entrega;
    }
    public void setEntrega(String entrega){
        this.entrega=entrega;
    }
    public String getPago(){
        return pago;
    }
    public void setPago(String pago){
        this.pago=pago;
    }
    public String getEntrega_material() {
        return entrega_material;
    }
    public void setEntrega_material(String entrega_material) {
        this.entrega_material = entrega_material;
    }
    public double MontoTotal(){
            switch (material) {
                case "ORO":
                    return peso*(3.68)*45*cantidad;
                case "PLATA":
                    return peso*7*cantidad;
                default:
                    return peso*4.5*cantidad;
            }
    }
}