package proyectofinal.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author L
 */
public class InicioPanel extends JPanel {
    
    private static final InicioPanel instance = new InicioPanel();
    
    public static InicioPanel getInstance() {
        return instance;
    }    

    private InicioPanel() {
        setLayout(new GridLayout(0, 2, 20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setBackground(new Color(20, 20, 20));
        
        setCanciones("Drako", "Tako");
        setCanciones("Drako", "Tako");
        setCanciones("Drako", "Tako");
        setCanciones("Drako", "Tako");
        setCanciones("Drako", "Tako");
    }
    
    public void setCanciones(String titulo, String artista) {
        add(crearTarjetaCancion(titulo, artista));
    }
    
    private JPanel crearTarjetaCancion(String titulo, String artista) {
        JPanel tarjeta = new JPanel();
        
        tarjeta.setPreferredSize(new Dimension(200, 100));
        tarjeta.setLayout(new BorderLayout());
        tarjeta.setBackground(new Color(60, 60, 60));
        tarjeta.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setFont(new Font("SansSerif", Font.BOLD, 16));

        JLabel artistaLabel = new JLabel("Por: " + artista);
        artistaLabel.setForeground(Color.LIGHT_GRAY);

        tarjeta.add(tituloLabel, BorderLayout.NORTH);
        tarjeta.add(artistaLabel, BorderLayout.SOUTH);

        return tarjeta;
    }
    
}
