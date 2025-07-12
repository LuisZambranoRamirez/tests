package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 * @param <E>
 */
public abstract class Cuantitativa<E> extends Variable<E> {    

    public Cuantitativa() {
    }

    public Cuantitativa(String nombre, E valor) {
        super(nombre, valor);
    }

    @Override
    public String getTipo() {
        return "Cuantitativa";
    }
    
}
