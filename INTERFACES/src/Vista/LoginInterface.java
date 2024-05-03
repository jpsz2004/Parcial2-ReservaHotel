package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Interfaz gráfica para el login
public class LoginInterface extends JFrame {

    // Componentes de la interfaz
    private JTextField txtCorreo;
    private JPasswordField txtContrasena;
   
    // Constructor de la interfaz
    public LoginInterface(){
        setTitle("My Hotel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Crear paneles
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel correoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblCorreo = new JLabel("Correo:");
        txtCorreo = new JTextField(20); // Ancho del campo de texto para correo
        correoPanel.add(lblCorreo);
        correoPanel.add(txtCorreo);

        JPanel contrasenaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblContrasena = new JLabel("Contraseña:");
        txtContrasena = new JPasswordField(20); // Ancho del campo de texto para contraseña
        contrasenaPanel.add(lblContrasena);
        contrasenaPanel.add(txtContrasena);

        JPanel botonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        JButton btnRegistrar = new JButton("Registrar");

         // Agregar acciones a los botones
         btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Iniciar Sesión");
            }
        });

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Registrar");
            }
        });

        botonPanel.add(btnIniciarSesion);
        botonPanel.add(btnRegistrar);

        // Agregar paneles al panel principal
        mainPanel.add(correoPanel);
        mainPanel.add(contrasenaPanel);
        mainPanel.add(botonPanel);

        // Agregar panel principal al JFrame
        add(mainPanel);

        pack(); // Ajustar el tamaño del JFrame
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    public void setIniciarSesionActionListener(ActionListener actionListener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIniciarSesionActionListener'");
    }

    // Métodos para obtener el correo y la contraseña ingresados por el usuario
    public String getCorreo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCorreo'");
    }

    public String getContrasena() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContrasena'");
    }

    public void mostrarMensaje(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }

    // Método para configurar el ActionListener del botón de registro
    public void setRegistrarActionListener(ActionListener actionListener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRegistrarActionListener'");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface();
            }
        });
    }
}

