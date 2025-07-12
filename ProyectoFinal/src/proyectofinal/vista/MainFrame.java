package proyectofinal.vista;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author L
 */
public class MainFrame extends JFrame {
    private JPanel menuIzquierdoPanel;
    private JPanel mainPanel;

    public MainFrame() {
        setTitle("Pagina Principal");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel izquierdo (menú)
        this.menuIzquierdoPanel = getMenuLateral();
        add(menuIzquierdoPanel, BorderLayout.WEST);

        // Panel principal (lista de canciones tipo tarjetas)
        this.mainPanel = InicioPanel.getInstance();
        
        
        add(new JScrollPane(mainPanel), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel getMenuLateral() {
        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.setBackground(new Color(10, 10, 10));
        menu.setPreferredSize(new Dimension(200, getHeight()));

        String[] opciones = { "Inicio", "Playlists", "Favoritos", "Buscar", "Configuración" };
        for (String opcion : opciones) {
            JButton boton = new JButton(opcion);
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);
            boton.setMaximumSize(new Dimension(180, 40));
            boton.setFocusPainted(false);
            boton.setBackground(new Color(45, 45, 45));
            boton.setForeground(Color.WHITE);
            boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            menu.add(Box.createRigidArea(new Dimension(0, 10)));
            menu.add(boton);
        }

        return menu;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}

