package proyectofinal.controlador;

import javax.swing.JButton;
import proyectofinal.vista.ILoginFrame;

/**
 *
 * @author L
 */
public class LoginController {
    private ILoginFrame loginFrame;
    
    
    
//    private final AuthModel model;
//    private final LoginFrame view;
//
//    public LoginController(AuthModel model, LoginFrame view) {
//        this.model = model;
//        this.view = view;
//        initController();
//    }
//
//    private void initController() {
//        view.getLoginButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                onLogin();
//            }
//        });
//    }
//
//    private void onLogin() {
//        String user = view.getUsername();
//        String pass = view.getPassword();
//        model.authenticate(user, pass)
//             .ifPresentOrElse(
//                 this::onSuccess,
//                 this::onFailure
//             );
//    }
//
//    private void onSuccess(User user) {
//        JOptionPane.showMessageDialog(view,
//            "¡Bienvenido, " + user.getDisplayName() + "!",
//            "Éxito", JOptionPane.INFORMATION_MESSAGE);
//        // Aquí podrías cerrar la ventana de login y abrir la principal
//    }
//
//    private void onFailure() {
//        JOptionPane.showMessageDialog(view,
//            "Usuario o contraseña incorrectos.",
//            "Error", JOptionPane.ERROR_MESSAGE);
//    }

    public LoginController(ILoginFrame loginFrame) {
        this.loginFrame = loginFrame;
    }
    
    private void addListener() {
        JButton loginButton = this.loginFrame.getLoginButton();
        
        loginButton.addActionListener(e -> {
            this.loginFrame.getUsername();
            this.loginFrame.getPassword();
            
        });
        
    }
}
