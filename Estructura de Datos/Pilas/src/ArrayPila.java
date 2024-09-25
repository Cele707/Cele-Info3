import java.util.EmptyStackException;

public class ArrayPila implements Pila {

//atributos
private Object[] array;
private int topOfStack;
private static final int tam = 10; // Capacidad fija de la pila

//constructor, inicializa la pila
public ArrayPila (){
    array = new Object[tam];
    topOfStack= -1;
}

// Método para insertar un elemento en la pila
    @Override
    public void push(Object x) {
        if(topOfStack + 1 == array.length){
            System.out.println("Error: Pila llena. No se puede insertar más elementos.");
            return;
        }
        array[++topOfStack]=x;
    }

 // Método para eliminar el elemento en el tope de la pila
    @Override
    public void pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); // Lanza una excepción si la pila está vacía
        }
        topOfStack--; // Retorna el elemento y lo elimina de la pila
    }

// Método para retornar el elemento en el tope sin eliminarlo
    @Override
    public Object top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); // Lanza una excepción si la pila está vacía
        }
        return array[topOfStack]; // Retorna el elemento y lo elimina de la pila
    }

 // Método para eliminar y devolver el elemento en el tope de la pila
    @Override
    public Object topAndPop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException(); // Lanza una excepción si la pila está vacía
        }
        return array[topOfStack--]; // Retorna el elemento y lo elimina de la pila
    }

// Método para verificar si la pila está vacía
    @Override
    public boolean isEmpty() {
        return topOfStack == -1;
    }

// Método para vaciar la pila
    @Override
    public void makeEmpty() {
        topOfStack = -1;
    }

    //Imprirmir Pila
    // Método para imprimir la pila completa
    public void imprimirPilaCompleta() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Contenido de la pila:\n");
            for (int i = 0; i <= topOfStack; i++) {
                System.out.println("[" + i + "] : " + array[i]);
            }
            System.out.println();
        }
    }
}
