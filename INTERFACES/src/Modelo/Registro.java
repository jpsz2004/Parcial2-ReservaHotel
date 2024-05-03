package Modelo;


public class Registro extends Usuario {

    public Registro(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido,
            String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
        super(tipoIdentificacion, documentoIdenficacion, nombre, apellido, correo, direccionResidencia, ciudadResidencia,
                telefono, contrasena);
    }

    public boolean verificarExistenciaUsuario(String correo) {
        return true;
    }

    public boolean confirmarContrasena(String contrasena, String confirmacionContrasena){
        if(contrasena.equals(confirmacionContrasena)){
            return true;
        }
        else{
            return false;
        }
    }

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
