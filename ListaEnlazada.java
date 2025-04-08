// Clase ListaEnlazada - implementación propia de una lista enlazada simple
public class ListaEnlazada {
    private Nodo cabeza; // Referencia al primer nodo de la lista

    // Agrega un nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Agrega un nodo al inicio de la lista
    public void agregarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // Agrega un nodo en una posición específica
    public void agregarEnPosicion(int dato, int posicion) {
        if (posicion <= 0 || cabeza == null) {
            agregarAlInicio(dato);
        } else {
            Nodo nuevo = new Nodo(dato);
            Nodo actual = cabeza;
            int contador = 0;
            while (actual != null && contador < posicion - 1) {
                actual = actual.siguiente;
                contador++;
            }
            if (actual == null) {
                agregar(dato); // Si la posición está fuera del rango, agrega al final
            } else {
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
            }
        }
    }

    // Elimina el primer nodo con el valor especificado
    public void eliminar(int dato) {
        if (cabeza == null) return;

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    // Verifica si un valor está en la lista
    public boolean contiene(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Invierte el orden de la lista enlazada
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
    }

    // Imprime todos los valores de la lista
    public void imprimir() {
        Nodo actual = cabeza;
        System.out.print("Lista actual: ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
