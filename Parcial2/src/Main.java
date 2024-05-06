import javax.swing.SwingUtilities;
import controlador.UserManager;
import vista.LoginInterface;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de UserManager para manejar los usuarios
        UserManager users = new UserManager();
        
        // Crear una instancia de LoginInterface y hacerla visible
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginInterface login = new LoginInterface(users);
                login.setVisible(true);
            }
        });
    }
}
