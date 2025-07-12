package proyectofinal.modelo.estadistica;

/**
 *
 * @author L
 * @param <E>
 */
public abstract class Variable<E> {
    private String nombre;
    private E valor;

    public Variable() {
    }

    public Variable(String nombre, E valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public E getValor() {
        return valor;
    }

    public boolean setValor(E valor) {
        if (valor != null) {
            this.valor = valor;
            return true;
        }
        return false;
    }
    
    /**
    * Verifica si todas las variables en el arreglo comparten el mismo subtipo.
    *
    * <p>
    * Este método compara el subtipo (obtenido mediante {@code getSubtipo()}) del primer elemento del arreglo
    * con el de los elementos restantes. Si todos los subtipos son iguales, se considera que la colección
    * es uniforme.
    * </p>
    *
    * <p>
    * Si el arreglo contiene cero o un elemento, se considera automáticamente uniforme.
    * </p>
    *
    * <b>Nota:</b> Este método no maneja valores {@code null} en el arreglo ni en los elementos del mismo.
    * Se asume que todos los elementos son no nulos.
    *
    * @param variables Arreglo de objetos {@code Variable} a evaluar.
    * @return {@code true} si todas las variables tienen el mismo subtipo, o si el arreglo tiene 0 o 1 elemento;
    *         {@code false} si se encuentra al menos un subtipo diferente.
    *
    * @throws NullPointerException si el arreglo o alguno de sus elementos es {@code null}.
    */
    public static boolean isUniformVariableSubType(Variable[] variables) {
        if (variables.length <= 1) {
            return true;
        }
        String subType = variables[0].getSubtipo();
        for (int i = 1; i < variables.length; i++) {
            if (!subType.equals(variables[i].getSubtipo())) {
                return false;
            }
        }

        return true;
    }

    public abstract String getTipo();
    public abstract String getSubtipo();
 
}
