package vista;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.*;

// Interfaz gráfica para el login
public class LoginInterface extends JFrame {

    private LoginController loginController;
    public LoginInterface(UserManager users) {
        loginController = new LoginController(users);
        crearComponentes();
    }

    // Componentes de la interfaz
    private JTextField txtCorreo;
    private JPasswordField txtContrasena;
    private JButton btnRegistrar;

    // Constructor de la interfaz
    public void crearComponentes() {
        setTitle("My Hotel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Crear paneles
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //JPanel correoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblCorreo = new JLabel("Correo:");
        txtCorreo = new JTextField(20); 
        //correoPanel.add(lblCorreo);
        //correoPanel.add(txtCorreo);

        //JPanel contrasenaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblContrasena = new JLabel("Contraseña:");
        txtContrasena = new JPasswordField(20); 
        //contrasenaPanel.add(lblContrasena);
        //contrasenaPanel.add(txtContrasena);

        JPanel botonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnRegistrar = new JButton("Registrar");
        mainPanel.add(btnIniciarSesion, BorderLayout.CENTER);
        mainPanel.add(btnIniciarSesion, BorderLayout.CENTER);

        // Agregar acciones a los botones
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSesion();
            }
        });

        // Configurar ActionListener para el botón Registrar
        btnRegistrar.addActionListener(new RegistrarButtonListener());

        botonPanel.add(btnIniciarSesion);
        botonPanel.add(btnRegistrar);

        // Agregar paneles al panel principal
        mainPanel.add(lblCorreo);
        mainPanel.add(txtCorreo);
        mainPanel.add(lblContrasena);
        mainPanel.add(txtContrasena);
        mainPanel.add(botonPanel);
        

        // Agregar panel principal al JFrame
        add(mainPanel);

        pack(); 
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    // Clase interna para manejar la acción del botón Registrar
    private class RegistrarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Abre la interfaz de registro cuando se hace clic en el botón de registro
            RegisterInterface register = new RegisterInterface(loginController.users);
            register.setVisible(true);
        }
    }

    private void iniciarSesion(){
        String correo = txtCorreo.getText();
        String contrasena = new String(txtContrasena.getPassword());
        if (loginController.login(correo, contrasena)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            dispose();
            new HomeInterface(null).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos");
        }
    }

    //Crear un main
    public static void main(String[] args) {
        UserManager users = new UserManager();
        LoginInterface login = new LoginInterface(users);
        login.setVisible(true);
    }

}

