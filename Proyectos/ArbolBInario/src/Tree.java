import java.util.*;

public class Tree {
//atributos
private Node root;

//constructor
public Tree() {
    root = null;
}

//metodo para insertar un nodo
Node insertar(int valor, Node t){
    if (t == null){
        t = new Node(valor);

    }else if(valor < t.element){
        t.left=insertar(valor, t.left);

    }else if(valor > t.element){
        t.right=insertar(valor, t.right);
    }
    return t;
}

//Método para imprimir el árbol de forma visual
void imprimirArbol(Node t, String prefix, boolean isLeft) {
    if (t != null) {
        System.out.println(prefix + (isLeft ? "├── " : "└── ") + t.element);
        imprimirArbol(t.left, prefix + (isLeft ? "│   " : "    "), true);
        imprimirArbol(t.right, prefix + (isLeft ? "│   " : "    "), false);
        }
}

//Método para recorrer el árbol en inorden (izquierda, raíz, derecha)
void inOrden(Node t){
    if( t != null){
        inOrden(t.left);
        System.out.print(t.element + " ");
        inOrden(t.right);
    }
}


}


