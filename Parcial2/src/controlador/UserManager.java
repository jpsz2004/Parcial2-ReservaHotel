package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class UserManager {
    List<Usuario> usuarios = new ArrayList<Usuario>();

    public List<Usuario> obtenerUsuarios() {
		return usuarios;
	}


    public void modificarUsuarios(List<Usuario> usuarios) {
            this.usuarios = usuarios;
    }

    public Usuario obtenerUsuarioPorCorreo (String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }
        return null; // No se encontró el usuario
    }


    //Metodo para agregar un usuario
    public void agregarUsuario(String tipoIdentificacion, String documentoIdenficacion, String nombre, String apellido, 
                                String correo, String direccionResidencia, String ciudadResidencia, String telefono, String contrasena) {
        Usuario nuevoUsuario = new Usuario(tipoIdentificacion, documentoIdenficacion, nombre, apellido, 
                                            correo, direccionResidencia, ciudadResidencia, telefono, contrasena);

        usuarios.add(nuevoUsuario);
    }
}
