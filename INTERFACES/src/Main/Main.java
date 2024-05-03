package Main;

import Controlador.LoginController;
import Modelo.LoginManager;
import Vista.LoginInterface;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la vista, controlador y modelo del login
        LoginInterface loginView = new LoginInterface();
        LoginManager loginModel = new LoginManager(null, null, null, null, null, null, null, null, null/* pasas los argumentos necesarios al constructor si es necesario */);
        LoginController loginController = new LoginController(loginView, loginModel);
    }
}

