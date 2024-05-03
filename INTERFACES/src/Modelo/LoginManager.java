package Modelo;

//Clase LoginManager que hereda de Usuario
public class LoginManager extends Usuario{

    //Constructor de la clase LoginManager
    public LoginManager(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido, String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
        super(tipoIdentificacion, documentoIdenficacion, nombre, apellido, correo, direccionResidencia, ciudadResidencia, telefono, contrasena);
    }

    //Método para verificar si el usuario y la contraseña son correctos
    public boolean verificarUsuario(String correo, String contrasena) {
        if(correo.equals(getCorreo()) && contrasena.equals(getContrasena())){
            return true;
        }
        else{
            return false;
        }
    }

    //Método para iniciar sesión
    public void iniciarSesion(String correo, String contrasena) {
        if(verificarUsuario(correo, contrasena)){
            System.out.println("Sesion iniciada");
        }
        else{
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

}
