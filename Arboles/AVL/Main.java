package AVL;

public class Main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        int[] valores = {10, 85, 15, 70, 20, 60};

        for (int val : valores) {
            System.out.println("\n=== Insertando " + val + " ===");
            arbol.raiz = arbol.insertar(arbol.raiz, val);
            System.out.println("Árbol después de insertar " + val + ":");
            arbol.imprimirArbol(arbol.raiz, "", false);
        } 
    }
}
