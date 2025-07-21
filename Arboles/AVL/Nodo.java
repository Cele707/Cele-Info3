package AVL;

class Nodo {
    int valor, altura;// valor = dato del nodo
                      // altura = se usa para calcular el balance
    Nodo izquierdo, derecho;// referencias a los subárboles

    public Nodo(int valor) {
        this.valor = valor; // asignamos el valor
        this.altura = 0;               
        this.izquierdo = null;
        this.derecho = null;
    }
}
