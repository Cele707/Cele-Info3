import java.util.EmptyStackException;

public class ListaPila {

    private Nodo top; // Apunta al tope de la pila

    public ListaPila() {
        top = null;
    }

    // Inserta un elemento en la pila
    public void push(Object x) {
        Nodo nuevo = new Nodo(x, top);
        top = nuevo;
    }

    // Elimina el elemento en el tope de la pila
    public void pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top = top.next;
        System.out.println("\nSe ha borrado el elemento del tope");
    }

    // Devuelve el elemento en el tope sin eliminarlo
    public Object top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Elimina y devuelve el elemento del tope
    public Object topAndPop() throws EmptyStackException {
        Object valor = top.data;
        pop();
        return valor;
    }

    // Verifica si está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Vacía la pila
    public void makeEmpty() {
        top = null;
    }

    // Imprime el contenido de la pila
    public void imprimirPilaCompleta() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Nodo actual = top;
        int i = 0;
        System.out.println("Contenido de la pila:");
        while (actual != null) {
            System.out.println("[" + i + "] : " + actual.data);
            actual = actual.next;
            i++;
        }
    }
}
