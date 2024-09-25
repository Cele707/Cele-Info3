
import java.util.EmptyStackException;

public interface Cola {
//inserta item en la cola
public void enqueue (Object x);

//Retorna el elemento inicial de la cola
//produce un error si la cola esta vacia
public Object getFront ()
throws EmptyStackException;

//Elimina el primer elemento de la cola y lo devuele
// Produce un error si la cola está vacía.
public Object dequeue() throws EmptyStackException;

//Retorna true si la cola esta vacia y falso en caso contrario
public boolean isEmpty();


//Remueve todo los items de la cola
public void makeEmpty ();
}
