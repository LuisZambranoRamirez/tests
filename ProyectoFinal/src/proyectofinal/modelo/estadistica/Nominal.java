package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 */
public class Nominal extends Cualitativa<String> {

    public Nominal() {
    }

    public Nominal(String nombre, String valor) {
        super(nombre, valor);
    }
 
    @Override
    public String getSubtipo() {
        return "Nominal";
    }
    
}
