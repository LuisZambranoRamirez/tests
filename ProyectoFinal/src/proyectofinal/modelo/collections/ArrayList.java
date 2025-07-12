package proyectofinal.modelo.collections;

import java.util.Arrays;

/**
 *
 * @author L
 */
public class ArrayList<T> {
    private Object[] elementos;
    private int size;
    private static final int CAPACIDAD_INICIAL = 10;

    public ArrayList() {
        elementos = new Object[CAPACIDAD_INICIAL];
        size = 0;
    }

    public void add(T elemento) {
        asegurarCapacidad();
        elementos[size++] = elemento;
    }

    public T get(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (T) elementos[indice];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elementos[i] = null;
        }
        size = 0;
    }

    private void asegurarCapacidad() {
        if (size == elementos.length) {
            int nuevaCapacidad = elementos.length * 2;
            elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        }
    }

    public boolean remove(int indice) {
        if (indice < 0 || indice >= size) {
            return false;
        }
        for (int i = indice; i < size - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--size] = null;
        return true;
    }
    
}
