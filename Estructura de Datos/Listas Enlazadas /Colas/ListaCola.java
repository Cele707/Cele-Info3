import java.util.NoSuchElementException;

public class ListaCola {

    private Nodo front; // Frente de la cola
    private Nodo back;  // Final de la cola
    private int currentSize;

    public ListaCola() {
        makeEmpty();
    }

    // Agrega un elemento al final
    public void enqueue(Object x) {
        Nodo nuevo = new Nodo(x);

        if (isEmpty()) {
            front = nuevo;
            back = nuevo;
        } else {
            back.next = nuevo;
            back = nuevo;
        }

        currentSize++;
    }

    // Devuelve el frente sin eliminarlo
    public Object getFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cola vacía");
        }
        return front.data;
    }

    // Elimina y devuelve el frente (FIFO)
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cola vacía");
        }
        Object valor = front.data;
        front = front.next;
        currentSize--;

        if (isEmpty()) {
            back = null; // por si queda vacía
        }

        return valor;
    }

    // Verifica si está vacía
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Vacía la cola
    public void makeEmpty() {
        front = null;
        back = null;
        currentSize = 0;
    }

    // Imprime el contenido de la cola
    public void imprimirCola() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return;
        }

        Nodo actual = front;
        int i = 0;
        System.out.println("Contenido de la cola:");
        while (actual != null) {
            System.out.println("[" + i + "]: " + actual.data);
            actual = actual.next;
            i++;
        }
    }
}

