import java.util.Random;

public class TestArrayColas {
    public static void main(String[] args) {
        ArrayColas cola = new ArrayColas(); // Crear una cola con capacidad inicial de 5
        Random rand = new Random();

        // Agregar 10 números aleatorios a la cola
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = rand.nextInt(100); // Número aleatorio entre 0 y 99
            cola.enqueue(numeroAleatorio);
        }

        // Imprimir la cola
        System.out.println("Contenido de la cola después de agregar 10 números aleatorios:");
        cola.imprimirCola();

        // Eliminar el primer elemento de la cola
        System.out.println("Elemento a eliminar:" + cola.dequeue());

        // Imprimir la cola después de eliminar el primer elemento
        System.out.println("\nContenido de la cola después de eliminar el primer elemento:");
        cola.imprimirCola();
    }
}
