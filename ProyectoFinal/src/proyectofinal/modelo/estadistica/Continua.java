package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 */
public class Continua extends Cuantitativa<Double>{

    public Continua() {
    }

    public Continua(String nombre, Double valor) {
        super(nombre, valor);
    }

    @Override
    public String getSubtipo() {
        return "Continua";
    }

}
