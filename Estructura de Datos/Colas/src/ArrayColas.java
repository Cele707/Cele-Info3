import java.util.EmptyStackException;

public class ArrayColas implements Cola{
//atributos
private static final int tam = 10;
private Object[] array;
private int front;  // Índice del frente de la cola
private int back;   // Índice del final de la cola
private int currentSize;   // Tamaño actual de la cola

//constructor
public ArrayColas(){
    array = new Object[tam];
    makeEmpty();
}

//metodos
//Cuando el indice alcance el tam del arreglo, se reinicia a 0, forma circular
private int incremento(int x){
if(++x == array.length){
    x=0;
    }
return x;
}

//Duplicar el tamaño de un arreglo que representa una cola cuando se queda sin espacio.
private void doubleCola (){
    Object [] newArray;
    newArray = new Object[array.length*2];

    for(int i=0; i<currentSize; i++, front = incremento(front)){
        newArray[i]=array[front];
    }

    array=newArray;
    front=0;
    back=currentSize-1;
}

//inserta item en la cola
    @Override
    public void enqueue(Object x) {
       if(currentSize == array.length){
        System.out.println("La cola esta llena");
        doubleCola();
       }
       back=incremento(back);
       array[back]=x;
       currentSize++;
    }

//Retorna el elemento inicial de la cola, el insertado hace mas tiempo
    @Override
    public Object getFront() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return array[front];
    }

//Elimina el primer elemento de la cola (el mas viejo) y lo devuelve
    @Override
    public Object dequeue() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        currentSize--;
        Object returnValue = array[front];
        front = incremento(front);
        return returnValue;
    }

//Retorna true si la cola esta vacia y falso en caso contrario
    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

//Remueve todo los items de la cola
    @Override
    public void makeEmpty() {
       currentSize=0;
       front=0;
       back=-1;
    }


// Método para imprimir los elementos de la cola
 public void imprimirCola() {
    System.out.print("Cola:\n ");
    for (int i = 0; i < currentSize; i++) {
        int index = (front + i) % array.length; // Calcular el índice circular
        System.out.print("["+index+"]:"+ array[index] + "\n");
    }
    System.out.println();
}
}
