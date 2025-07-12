package proyectofinal.vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author L
 */
public class LoginFrame extends JFrame implements ILoginFrame{
    private final JTextField txtUsuario;
    private final JPasswordField txtPassword;
    private final JButton btnLogin;

    public LoginFrame() {
        setTitle("Iniciar Sesión");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(15, 15, 15));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        add(panel);

        JLabel logo = new JLabel("Spotify", JLabel.CENTER);
        logo.setFont(new Font("Arial", Font.BOLD, 32));
        logo.setForeground(new Color(30, 215, 96));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(logo);

        panel.add(Box.createRigidArea(new Dimension(0, 30)));

        txtUsuario = new JTextField();
        txtUsuario.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
        txtUsuario.setBorder(BorderFactory.createTitledBorder("Correo o nombre de usuario"));
        panel.add(txtUsuario);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        txtPassword = new JPasswordField();
        txtPassword.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 16));
        txtPassword.setBorder(BorderFactory.createTitledBorder("Contraseña"));
        panel.add(txtPassword);

        panel.add(Box.createRigidArea(new Dimension(0, 30)));

        btnLogin = new JButton("Iniciar Sesión");
        btnLogin.setBackground(new Color(30, 215, 96));
        btnLogin.setForeground(Color.BLACK);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 16));
        btnLogin.setFocusPainted(false);
        btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnLogin.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        panel.add(btnLogin);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JLabel registrarse = new JLabel("¿No tienes una cuenta? Regístrate");
        registrarse.setFont(new Font("Arial", Font.PLAIN, 14));
        registrarse.setForeground(Color.GRAY);
        registrarse.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(registrarse);
    }

    @Override
    public String getUsername() {
        return txtUsuario.getText().trim();
    }

    @Override
    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    @Override
    public JButton getLoginButton() {
        return btnLogin;
    }
    
    @Override
    public boolean destroyFrame() {
        dispose();
        return true;
    }
    
}
