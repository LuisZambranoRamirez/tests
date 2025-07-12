package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 */
public class Discreta extends Cuantitativa<Integer>{

    public Discreta() {
    }

    public Discreta(String nombre, Integer valor) {
        super(nombre, valor);
    }    

    @Override
    public String getSubtipo() {
        return "Discreta";
    }

}
