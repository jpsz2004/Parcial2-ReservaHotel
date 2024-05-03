package Modelo;

//Clase Registro que hereda de Usuario
public class Registro extends Usuario {

    //Constructor de la clase Registro
    public Registro(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido,
            String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
        super(tipoIdentificacion, documentoIdenficacion, nombre, apellido, correo, direccionResidencia, ciudadResidencia,
                telefono, contrasena);
    }

    //Método para verificar si el usuario ya existe
    public boolean verificarExistenciaUsuario(String correo) {
        return true;
    }

    //Método para confirmar la contraseña
    public boolean confirmarContrasena(String contrasena, String confirmacionContrasena){
        if(contrasena.equals(confirmacionContrasena)){
            return true;
        }
        else{
            return false;
        }
    }

    //Método para registrar un usuario
    public void registrarUsuario(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido,
            String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
                if(!verificarExistenciaUsuario(correo)){
                    if(!confirmarContrasena(contrasena, contrasena)){
                        System.out.println("Las contraseñas no coinciden");
                    }else{
                        Usuario usuario = new Usuario(tipoIdentificacion, documentoIdenficacion, nombre, apellido, correo, direccionResidencia, ciudadResidencia, telefono, contrasena);
                    }
                    
                }
                else{
                    System.out.println("El usuario ya existe");
                }
            }

    }
