package vista;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeInterface extends JFrame {
    
    public HomeInterface(JFrame parent) {
        //Crear una ventana principal
        JFrame ventana = new JFrame("Bienvenido - My Hotel");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(600, 200);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        ventana.setVisible(true);

         // Panel principal
         JPanel mainPanel = new JPanel();
         mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Usar un BoxLayout vertical
         
         // Label para el título
         JLabel tituloLabel = new JLabel("Bienvenido a My Hotel");
         tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar horizontalmente
         tituloLabel.setFont(new Font("Arial", Font.PLAIN, 24)); // Cambiar la fuente
        
         mainPanel.add(tituloLabel);
         
         // Se agrega el panel principal al marco
         ventana.getContentPane().add(mainPanel);

        // Crear un panel para los botones
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER,30, 30)); 

        // Crear botones
        JButton reservasButton = new JButton("RESERVAS");
        JButton habitacionButton = new JButton("HABITACION");
        JButton usuariosButton = new JButton("USUARIOS");

        // Dimension de los botones principales
        reservasButton.setPreferredSize(new Dimension(130, 40));
        habitacionButton.setPreferredSize(new Dimension(130, 40));
        usuariosButton.setPreferredSize(new Dimension(130, 40));

        // Agregar los botones al panel de botones
        botonesPanel.add(reservasButton);
        botonesPanel.add(habitacionButton);
        botonesPanel.add(usuariosButton);

        mainPanel.add(botonesPanel);

        // Dar accion a los botones
        reservasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReservasInterface(null);
            }
        });

        habitacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HabitacionInterface();
            }
        });

        usuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UsuariosInterface();
            }
        });



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HomeInterface(null);
            }
        });
    }
}
