package AVL;
class ArbolAVL {
    Nodo raiz;
    // Inserta un valor en el árbol y mantiene el balance
    public Nodo insertar(Nodo nodo, int valor) {

        if (nodo == null)
            return new Nodo(valor);

        // Paso 1: Insertar como en un árbol binario de búsqueda normal
        if (valor < nodo.valor)
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = insertar(nodo.derecho, valor);
        else
            return nodo; // No se permiten duplicados

        // Paso 2: Actualizar altura
        nodo.altura = 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));

        // Paso 3: Calcular el balance del nodo
        int balance = altura(nodo.derecho) - altura(nodo.izquierdo);

        //El subárbol izquierdo está demasiado alto (-)
        if (balance < -1) {
            if (nodo.izquierdo != null) {
            // Caso Left-Left: su hijo tiene el mismo signo (-)
                if (valor < nodo.izquierdo.valor) {
                return rotarDerecha(nodo); // Realizamos una rotación derecha simple para balancear
        }
            // Caso Left-Right: su hijo tiene distinto signo (+)
                else if (valor > nodo.izquierdo.valor) {
                nodo.izquierdo = rotarIzquierda(nodo.izquierdo);  // Primero rotamos a la izquierda el subárbol izquierdo
                return rotarDerecha(nodo);   // Luego rotamos a la derecha el nodo actual para balancear
                }
            }
        }

        // subárbol derecho está demasiado alto (+)
        if (balance > 1) {
            if (nodo.derecho != null) {
            // Caso Right-Right: su hijo tiene el mismo signo (+)
                if (valor > nodo.derecho.valor) { 
                return rotarIzquierda(nodo);  
            }
            // Caso Right-Left: su hijo tiene distinto signo (-)
                else if (valor < nodo.derecho.valor) {
                nodo.derecho = rotarDerecha(nodo.derecho); // Primero rotamos a la derecha el subárbol derecho
                return rotarIzquierda(nodo);  // Luego rotamos a la izquierda el nodo actual para balancear
                }
            }
        }


        return nodo; // Sin rotación necesaria
    }

    // Rotación Derecha Simple
    private Nodo rotarDerecha(Nodo y) {
        Nodo x = y.izquierdo;
        Nodo T2 = x.derecho;

        x.derecho = y;
        y.izquierdo = T2;

        y.altura = 1 + Math.max(altura(y.izquierdo), altura(y.derecho));
        x.altura = 1 + Math.max(altura(x.izquierdo), altura(x.derecho));

        return x;
    }

    // Rotación Izquierda Simple
    private Nodo rotarIzquierda(Nodo x) {
        Nodo y = x.derecho;
        Nodo T2 = y.izquierdo;

        y.izquierdo = x;
        x.derecho = T2;

        x.altura = 1 + Math.max(altura(x.izquierdo), altura(x.derecho));
        y.altura = 1 + Math.max(altura(y.izquierdo), altura(y.derecho));

        return y;
    }

    // Obtener altura del nodo
    private int altura(Nodo nodo) {
        return (nodo == null) ? -1 : nodo.altura;
    }

    // Recorrido InOrden para verificar estructura del árbol
    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    public void imprimirArbol(Nodo node, String prefix, boolean isLeft) {
        if (node != null) {
            int balance = altura(node.derecho) - altura(node.izquierdo);
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.valor + " (Balance:" + balance + ")"); // para que funciones se debe sobreescribir el metodo toString del nodo empleado
            imprimirArbol(node.izquierdo, prefix + (isLeft ? "│   " : "    "), true);
            imprimirArbol(node.derecho, prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}

