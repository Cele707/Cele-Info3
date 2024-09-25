public class Insercion {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 1, 5, 6}; // Arreglo desordenado

        System.out.println("Arreglo antes de ordenar:");
        imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento por inserción
        ordenamientoInsercion(arreglo);

        System.out.println("Arreglo ordenado de menor a mayor:");
        imprimirArreglo(arreglo);
    }

    // Método de ordenamiento por inserción
    public static void ordenamientoInsercion(int[] arreglo) {
    // 1. Bucle externo recorre todo el arreglo a partir del segundo elemento
        for (int i = 1; i < arreglo.length; i++) {
            int j=i;

    // 2. Bucle interno compara el elemento actual con los anteriores y los desplaza
            while ( arreglo[j] < arreglo[j-1] ) {
    // 3. Intercambio: Se desplaza el elemento mayor hacia la derecha
                int aux = arreglo [j-1];
                arreglo [j-1] = arreglo [j];
                arreglo[j] = aux;
    // 4. Decrementa j para seguir comparando hacia la izquierda
                j--;
             }
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
