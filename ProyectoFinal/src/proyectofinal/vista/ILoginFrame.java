package proyectofinal.vista;

import javax.swing.JButton;

/**
 *
 * @author L
 */
public interface ILoginFrame {
    public String getUsername();
    public String getPassword();
    public JButton getLoginButton();
    public boolean destroyFrame();
}
