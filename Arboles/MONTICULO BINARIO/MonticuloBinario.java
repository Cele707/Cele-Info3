public class MonticuloBinario {
    private static final int default_capacity = 100;
    private int CurrentSize;
    private Integer[] array;

    // Constructor
    public MonticuloBinario() {
        CurrentSize = 0;
        array = new Integer[default_capacity + 1]; // usamos índice desde 1
    }

    // Mostrar el montículo
    public void imprimirMonticulo() {
        for (int i = 1; i <= CurrentSize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Insertar un nuevo valor
    public void insertar(Integer x) {
        if (CurrentSize + 1 == array.length) {
            duplicarArray();
        }

        CurrentSize++; // incrementamos el tamaño
        int hueco = CurrentSize;
        array[0] = x; // posición auxiliar para comparaciones

        // Ajustar hacia arriba (subir el valor si es menor que sus padres)
        while (hueco > 1 && comparar(x, array[hueco / 2]) < 0) {
            array[hueco] = array[hueco / 2]; // mover el padre hacia abajo
            hueco = hueco / 2;               // subir el hueco a la posición del padre
        }

        array[hueco] = x; // colocamos el nuevo valor en su lugar final
    }

    // Comparar dos enteros, asegurando que no sean null
    private int comparar(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Los enteros no pueden ser nulos");
        }
        return a.compareTo(b); // comparación natural de Integer
    }

    // Duplicar el tamaño del array si se llena
    private void duplicarArray() {
        Integer[] nuevoArray = new Integer[array.length * 2];
        for (int i = 1; i <= CurrentSize; i++) {
            nuevoArray[i] = array[i];
        }
        array = nuevoArray;
    }

    // Eliminar el mínimo (la raíz)
    public Integer eliminarMin() {
        if (CurrentSize == 0) {
            throw new IllegalStateException("El montículo está vacío.");
        }

        Integer minimo = array[1]; // valor mínimo está en la raíz
        array[1] = array[CurrentSize]; // mover el último elemento a la raíz
        CurrentSize--; // reducir tamaño
        percolateDown(1); // reordenar para mantener la propiedad de heap

        return minimo;
    }

    // Reordenar hacia abajo (para mantener orden del heap después de eliminar)
    private void percolateDown(int hueco) {
        int hijo;
        Integer temp = array[hueco];

        while (hueco * 2 <= CurrentSize) {
            hijo = hueco * 2; // hijo izquierdo

            // Si hay hijo derecho y es menor que el izquierdo
            if (hijo + 1 <= CurrentSize && comparar(array[hijo + 1], array[hijo]) < 0) {
                hijo = hijo + 1; // ahora es el hijo derecho
            }

            // Si el hijo menor es menor que temp, bajar ese hijo
            if (comparar(array[hijo], temp) < 0) {
                array[hueco] = array[hijo]; // mover el hijo hacia arriba
                hueco = hijo; // bajar el hueco
            } else {
                break; // ya está en el lugar correcto
            }
        }

        array[hueco] = temp; // colocar el valor original en su nueva posición
    }
}
