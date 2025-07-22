public class TablaHash {
 
    private Nodo[] buckets;  // Array de buckets (cada uno es una lista enlazada)
    private int numBuckets;      // Cantidad de buckets en la tabla
    private int size;            // Cantidad total de elementos almacenados

    // Constructor
    public TablaHash() {
        numBuckets = 10;                 // Fijamos tamaño inicial de la tabla
        buckets = new Nodo[numBuckets]; // Inicializamos array de buckets
        size = 0;                        // Empezamos con tabla vacía
    }

    // =============================
    // FUNCION HASH PARA CLAVES TIPO STRING
    // =============================
    private int hash(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            // Usamos base 128 (ASCII) y módulo del tamaño de la tabla
            hashVal = (hashVal * 128 + key.charAt(i)) % numBuckets;
        }
        return hashVal;
    }

    // =============================
    // INSERTAR ELEMENTO EN LA TABLA
    // =============================
    public void put(String key, String value) {
        int index = hash(key); // Calcula índice usando la función hash
        Nodo newNode = new Nodo(key, value); // Crea nuevo nodo

        if (buckets[index] == null) {
            // Si el bucket está vacío, lo asignamos directamente
            buckets[index] = newNode;
        } else {
            // Si ya hay elementos, agregamos al final de la lista (encadenamiento)
            Nodo current = buckets[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++; // Incrementamos cantidad de elementos
    }

    // =============================
    // BUSCAR VALOR POR SU CLAVE
    // =============================
    public String search(String key) {
        int index = hash(key);         // Calculamos índice
        Nodo current = buckets[index]; // Vamos al bucket correspondiente

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;  // Si la clave coincide, retornamos el valor
            }
            current = current.next;    // Avanzamos al siguiente nodo
        }

        return null; // No se encontró la clave
    }

    // =============================
    // ELIMINAR ELEMENTO POR SU CLAVE
    // =============================
    public void remove(String key) {
        int index = hash(key);             // Calculamos índice
        Nodo current = buckets[index]; // Nodo actual
        Nodo previous = null;          // Nodo anterior para relinkeo

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    // Si está al inicio de la lista
                    buckets[index] = current.next;
                } else {
                    // Si está en el medio o al final
                    previous.next = current.next;
                }

                size--; // Actualizamos tamaño
                System.out.println("Elemento con clave '" + key + "' eliminado.");
                return;
            }

            previous = current;
            current = current.next;
        }

        // No se encontró
        System.out.println("Elemento con clave '" + key + "' no encontrado.");
    }

    // =============================
    // MOSTRAR TODOS LOS ELEMENTOS DE UN BUCKET
    // =============================
    public void printBucket(int index) {
        Nodo current = buckets[index];

        if (current == null) {
            System.out.println(index + ": vacío.");
            return;
        }

        System.out.print(index + ": ");
        while (current != null) {
            System.out.print("[Clave: " + current.key + ", Valor: " + current.value + "] ");
            current = current.next;
        }
        System.out.println();
    }
}

  

