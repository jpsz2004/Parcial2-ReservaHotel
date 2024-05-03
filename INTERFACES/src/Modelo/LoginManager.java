package Modelo;

public class LoginManager extends Usuario{

    public LoginManager(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido, String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
        super(tipoIdentificacion, documentoIdenficacion, nombre, apellido, correo, direccionResidencia, ciudadResidencia, telefono, contrasena);
    }

    public boolean verificarUsuario(String correo, String contrasena) {
        if(correo.equals(getCorreo()) && contrasena.equals(getContrasena())){
            return true;
        }
        else{
            return false;
        }
    }

    public void iniciarSesion(String correo, String contrasena) {
        if(verificarUsuario(correo, contrasena)){
            System.out.println("Sesion iniciada");
        }
        else{
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

}
