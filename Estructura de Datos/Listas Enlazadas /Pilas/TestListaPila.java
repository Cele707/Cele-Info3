public class TestListaPila {
    public static void main(String[] args) {
        ListaPila lista = new ListaPila(); // Crea una nueva lista enlazada
        
        // Agregar 10 números aleatorios a la lista
        for (int i = 0; i < 10; i++) {
            //lista.agregarNodo((int) (Math.random() * 100)); // Agrega un número aleatorio entre 0 y 99
            lista.push(i);
        }

        // Recorrer la lista y mostrar los datos
        System.out.println("Elementos en la lista antes de borrar:");
        lista.imprimirPilaCompleta();
        
        // Borrar nodo del tope
        lista.pop();
        
        //agregarmos un nodo al inicio
        int x= 19;
        lista.push(x);
        
        // Recorrer la lista y mostrar los datos después de borrar
        System.out.println("\nElementos en la lista después de borrar:");
        lista.imprimirPilaCompleta();

        //Mostramos el elemento del tope
        System.out.println("\nElemento del tope:" + lista.top());
       
    }
}
