package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 */
public class Ordinal extends Cualitativa<String> {
    // OJAZO o|0 Falta agregar un sistema de jerarquiaz para este tipo de variable 
    public Ordinal() {
    }

    public Ordinal(String nombre, String valor) {
        super(nombre, valor);
    }

    @Override
    public String getSubtipo() {
        return "Ordinal";
    }
}
