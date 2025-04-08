// Clase Nodo - representa un nodo individual de la lista enlazada
public class Nodo {
    int dato;           // Valor que guarda el nodo
    Nodo siguiente;     // Referencia al siguiente nodo

    // Constructor: crea un nodo con el valor proporcionado
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
