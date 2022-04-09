package clases_padres;

public class Usuarios_Empresa {
        protected String ID; //PRIMARY KEY
	protected String nombres, apellidos;
	protected String DNI, telefono;
	protected String correo;
	protected String contrasenia;
	protected String cargo;
    
    public Usuarios_Empresa(String ID, String nombres, String apellidos, 
            String DNI, String telefono, String correo, String contrasenia, String cargo) {
        this.ID = ID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.cargo = cargo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
