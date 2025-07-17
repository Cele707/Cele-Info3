public class TestListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada(); // Crea una nueva lista enlazada
        
        // Agregar 10 números aleatorios a la lista
        for (int i = 0; i < 10; i++) {
            //lista.agregarNodo((int) (Math.random() * 100)); // Agrega un número aleatorio entre 0 y 99
            lista.agregarNodo(i);
        }

        // Recorrer la lista y mostrar los datos
        System.out.println("Elementos en la lista antes de borrar:");
        lista.recorrer();
        
        // Borrar un nodo específico
        int valorABorrar = 5; // Cambia esto por el valor que desees borrar
        lista.borrarNodo(valorABorrar);
        
        //agregarmos un nodo al inicio
        int x= 19;
        lista.mover(x);
        
        // Recorrer la lista y mostrar los datos después de borrar
        System.out.println("\nElementos en la lista después de borrar:");
        lista.recorrer();
    }
}
