public class Main {
    public static void main(String[] args) {
       TablaHash tabla = new TablaHash();

        // Insertamos elementos
        tabla.put("Juan", "351-123");
        tabla.put("Ana", "351-456");
        tabla.put("Carlos", "351-789");
        tabla.put("Lucia", "351-000");

        // Mostramos el contenido de todos los buckets
        for (int i = 0; i < 10; i++) {
            tabla.printBucket(i);
        }

        // Buscamos una clave
        System.out.println("Teléfono de Ana: " + tabla.search("Ana"));

        // Eliminamos una clave
        tabla.remove("Carlos");
        tabla.remove("Pedro"); // no existe

        // Intentamos buscar nuevamente
        System.out.println("Teléfono de Carlos: " + tabla.search("Carlos"));
    }
}

