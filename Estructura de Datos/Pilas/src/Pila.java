import java.util.EmptyStackException;

public interface Pila {
//inserta item en el tope de la pila
public void push (Object x);

//Elimina el elemento del tope de la pila 
//produce un error si la pila esta vacia
public void pop ()
throws EmptyStackException;

// Retorna el elemento del tope de la pila.
// Produce un error si la pila está vacía.
public Object top() throws EmptyStackException;

//Retorna el elemento del tope de la pila y lo elimina
//Produce un error si la pila esta vacia
public Object topAndPop() throws EmptyStackException;

//Retorna true si la pila esta vacia y falso en caso contrario
public boolean isEmpty();


//Remueve todo los items de la pila
public void makeEmpty ();
}