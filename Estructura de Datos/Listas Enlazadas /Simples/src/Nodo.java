class Nodo {
//atributos
    Object data; // Datos del nodo
    Nodo next; // Referencia al siguiente nodo
//constructor vacio 


// Constructor que inicializa el nodo con dato y el siguiente nodo
public Nodo (Object d, Nodo n){
    data = d; 
    next = n;
}

public Nodo() {
}

    // Constructor que solo inicializa el dato, el siguiente nodo se establece como null
    public Nodo(Object d) {
        this(d, null);
    }
//getters y setters
    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public Nodo getNext() {
        return next;
    }

}
