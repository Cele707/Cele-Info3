public class ListaEnlazada {
//atributos
private Nodo head;
private Nodo current;

//constructor

public ListaEnlazada(Nodo head, Nodo current) {
    this.head = head;
    this.current = current;
}

public ListaEnlazada() {
}

//metodo para agregar un nodo a la lista
public void agregarNodo (Object data){
    Nodo nuevoNodo = new Nodo (data);

    if(head == null){
        head = nuevoNodo;
        current = nuevoNodo;
    }
    else{
        Nodo temp = new Nodo(data, current.next);
        current.next = temp;
    }
}

//metodo para borrar un nodo
public void borrarNodo (Object data){
    // Caso cuando la lista está vacía
    if (head == null) {
        return; // No hay nada que borrar
    }

    // Caso cuando el nodo a borrar es la cabeza
    if (head.data.equals(data)) {
        head = head.next; // Mueve la cabeza al siguiente nodo
        return; // Sale del método
    }
    current = head;
    while ((current.next != null)) {
        if(current.next.data.equals(data)){
            current.next = current.next.next;
            return;
        }
        current=current.next;
    }
}

// Método para recorrer la lista y mostrar los datos de cada nodo
public void recorrer() {
    Nodo actual = head; // Comienza en la cabeza
    int indice = 0; // Para mostrar el índice de cada nodo
    while (actual != null) { // Mientras no se llegue al final de la lista
        System.out.println("[" + indice + "]:" + actual.data); // Imprime el índice y el valor
        actual = actual.next; // Avanza al siguiente nodo
        indice++; // Incrementa el índice
    }
}
}
