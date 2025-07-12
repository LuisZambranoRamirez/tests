package proyectofinal.modelo.collections;

/**
 *
 * @author L
 */
public class ListaDoble<T> {
    private class Nodo {
        T valor;
        Nodo anterior;
        Nodo siguiente;

        Nodo(T valor) {
            this.valor = valor;
        }
    }

    private Nodo cabeza;
    private Nodo cola;
    private int size = 0;

    public void agregarAlFinal(T valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        size++;
    }

    public void agregarAlInicio(T valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        size++;
    }

    public void eliminar(T valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }

                size--;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public int getSize() {
        return size;
    }
}

