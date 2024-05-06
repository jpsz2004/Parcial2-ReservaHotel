package controlador;

public class RegisterController {
    UserManager users;
    private boolean registroExitoso = false;

    public RegisterController(UserManager users) {
    	this.users = users;
    }
   
    public boolean registerUser(String tipoIdentificacion, String documentoIdentificacion, String nombre, String apellido, 
                                String correo, String direccionResidencia, String ciudadResidencia, String telefono, 
                                String contrasena, String confirmarContrasena) {
        if (contrasena.equals(confirmarContrasena)) {
            users.agregarUsuario(tipoIdentificacion, documentoIdentificacion, nombre, apellido, correo, direccionResidencia, ciudadResidencia, telefono, confirmarContrasena);
            return true;
        }
        return false;
    }

    //Verificar que todos los datos hayan sdo ingresados
    public boolean verificarDatos(String tipoIdentificacion, String documentoIdentificacion, String nombre, String apellido, 
                                   String correo, String direccionResidencia, String ciudadResidencia, String telefono, 
                                   String contrasena, String confirmarContrasena) {
        if (tipoIdentificacion.isEmpty() || documentoIdentificacion.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || 
            correo.isEmpty() || direccionResidencia.isEmpty() || ciudadResidencia.isEmpty() || telefono.isEmpty() || 
            contrasena.isEmpty() || confirmarContrasena.isEmpty()) {
                registroExitoso = false;
                return registroExitoso;
        }
        else{
            registroExitoso = true;
            return registroExitoso;
        }
    }

}