package modelo;

public class Usuario {

    //Atributos
    private String tipoIdentificacion;
    private String documentoIdenficacion;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccionResidencia;
    private String ciudadResidencia;
    private String telefono;
    private String contrasena;

    //Constructor de la clase usuario
    public Usuario(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido, String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.documentoIdenficacion = documentoIdenficacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccionResidencia = direccionResidencia;
        this.ciudadResidencia = ciudadResidencia;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    //Getters y Setters
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getDocumentoIdenficacion() {
        return documentoIdenficacion;
    }

    public void setDocumentoIdenficacion(String documentoIdenficacion) {
        this.documentoIdenficacion = documentoIdenficacion;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}