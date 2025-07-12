package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 * @param <E>
 */
public abstract class Cualitativa<E> extends Variable<E> {

    public Cualitativa() {
    }

    public Cualitativa(String nombre, E valor) {
        super(nombre, valor);
    }
  
    @Override
    public String getTipo() {
        return "Cualitativa";
    }
}
