import java.util.Random;

public class TestArrayPila {
    public static void main(String[] args) {
        ArrayPila pila = new ArrayPila(); // Crea una pila genérica
        Random random = new Random();
        // Inserta diferentes tipos de elementos en la pila
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            pila.push(numeroAleatorio);
        }
        // Recupera y muestra los elementos
        pila.imprimirPilaCompleta();
        // Muestra el estado actual del tope de la pila
        System.out.println("Elemento en el tope de la pila: " + pila.top());

        // Elimina un elemento de la pila y lo muestra
        System.out.println("\nPop: " + pila.topAndPop());

        // Imprimir el estado completo de la pila tras el pop
        System.out.println("\nEstado completo de la pila tras el pop:");
        pila.imprimirPilaCompleta();
    }
}
