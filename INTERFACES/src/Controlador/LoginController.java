package Controlador;

import Modelo.LoginManager;
import Vista.LoginInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LoginInterface loginView;
    private LoginManager loginModel;

    public LoginController(LoginInterface loginView, LoginManager loginModel) {
        this.loginView = loginView;
        this.loginModel = loginModel;

        // Configurar acción del botón de iniciar sesión en la vista
        this.loginView.setIniciarSesionActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener datos de la vista
                String correo = loginView.getCorreo();
                String contrasena = loginView.getContrasena();
                
                // Llamar al método del modelo para iniciar sesión
                if (loginModel.verificarUsuario(correo, contrasena)) {
                    // Si las credenciales son válidas, mostrar mensaje de éxito en la vista
                    loginView.mostrarMensaje("¡Inicio de sesión exitoso!");
                } else {
                    // Si las credenciales son inválidas, mostrar mensaje de error en la vista
                    loginView.mostrarMensaje("Usuario o contraseña incorrectos");
                }
            }
        });

        // Configurar acción del botón de registro en la vista
        this.loginView.setRegistrarActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí podrías abrir la interfaz de registro si lo deseas
            }
        });
    }
}
