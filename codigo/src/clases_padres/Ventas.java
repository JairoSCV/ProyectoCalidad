/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_padres;

/**
 *
 * @author SAMIR
 */
public class Ventas {
    protected String nroBoleta,idArticulo,medida,material;
    protected double peso,montoAmortiguado;
    protected int cantidad;
    protected String nombre,apellido,dni;

    public Ventas(String nroBoleta, String idArticulo, String medida, String material, double peso, double montoAmortiguado, int cantidad, String nombre, String apellido, String dni) {
        this.nroBoleta = nroBoleta;
        this.idArticulo = idArticulo;
        this.medida = medida;
        this.material = material;
        this.peso = peso;
        this.montoAmortiguado = montoAmortiguado;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
