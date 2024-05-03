package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterInterface extends JFrame{

    private JTextField txtTipoIdentificacion, txtDocumentoIdentificacion, txtNombre, txtApellido,
                txtCorreo, txtDireccionResidencia, txtCiudadResidencia, txtTelefono, txtContrasena,
                txtConfirmarContrasena;

    public RegisterInterface(JFrame parent) {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        // Crear paneles
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(13, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Crear campos de texto para el registro
        txtTipoIdentificacion = new JTextField(20);
        txtDocumentoIdentificacion = new JTextField(20);
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtCorreo = new JTextField(20);
        txtDireccionResidencia = new JTextField(20);
        txtCiudadResidencia = new JTextField(20);
        txtTelefono = new JTextField(20);
        txtContrasena = new JPasswordField(20);
        txtConfirmarContrasena = new JPasswordField(20);

        // Agregar campos de texto al panel principal
        mainPanel.add(new JLabel("Tipo de Identificación:"));
        mainPanel.add(txtTipoIdentificacion);
        mainPanel.add(new JLabel("Documento de Identificación:"));
        mainPanel.add(txtDocumentoIdentificacion);
        mainPanel.add(new JLabel("Nombre:"));
        mainPanel.add(txtNombre);
        mainPanel.add(new JLabel("Apellido:"));
        mainPanel.add(txtApellido);
        mainPanel.add(new JLabel("Correo:"));
        mainPanel.add(txtCorreo);
        mainPanel.add(new JLabel("Dirección de Residencia:"));
        mainPanel.add(txtDireccionResidencia);
        mainPanel.add(new JLabel("Ciudad de Residencia:"));
        mainPanel.add(txtCiudadResidencia);
        mainPanel.add(new JLabel("Teléfono:"));
        mainPanel.add(txtTelefono);
        mainPanel.add(new JLabel("Contraseña:"));
        mainPanel.add(txtContrasena);
        mainPanel.add(new JLabel("Confirmar Contraseña:"));
        mainPanel.add(txtConfirmarContrasena);

        // Agregar botón de registro
        JButton btnRegistrarUsuario = new JButton("Registrar Usuario");
        btnRegistrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Registrar Usuario");
            }
        });
        mainPanel.add(btnRegistrarUsuario);

        // Agregar panel principal al JFrame
        add(mainPanel);

        pack(); // Ajustar el tamaño del JFrame
        setLocationRelativeTo(parent); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegisterInterface(null);
            }
        });
    }

}
