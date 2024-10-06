import java.util.*;

public class Main {
 public static void main(String[] args) {
//variables
        Tree arbol = new Tree();  // Crear el árbol
        Node raiz = null;         // Raíz del árbol inicialmente vacía
        Random rand = new Random();
        int menu_op = 0;
        var consola = new Scanner(System.in);
        boolean exit = false;
//inicio
do{
    System.out.println("Se presenta un menu de opciones:\n");
    System.out.println(
                        "1-Generar arbol con números aleatorios\n"+
                        "2-Metodo in Orden((izquierda, raíz, derecha)\n"+
                        "3-?"+
                        "4-Cantidad de niveles del arbol"+
                        "5-Borrar nodo"+
                        "6-Imprimir arbol binario\n"+
                        "7-Salir\n");
    System.out.println("Seleccione una opcion:");
    menu_op = consola.nextInt();

    switch (menu_op) {
        case 1:
             // Insertar 10 números aleatorios entre 0 y 25
        System.out.println("Insertando números:");
        for (int i = 0; i < 10; i++) {
            int numero = rand.nextInt(26);  // Genera un número entre 0 y 25
            System.out.print(numero + " ");
            raiz = arbol.insertar(numero, raiz);  // Insertar el número en el árbol
        }
        System.out.println("\n");
        break;

        case 2:
        // Mostrar los números en orden creciente
        System.out.println("\n\nNúmeros en el árbol (inorden):");
        arbol.inOrden(raiz);  // Realizar el recorrido inorden
        System.out.println("\n");
        break;

        case 3:
        break;

        case 4:
        break;

        case 5:
        break;

        case 6:
         System.out.println("\n\nÁrbol binario:");
         arbol.imprimirArbol(raiz, "", false);  // Imprimir el árbol
         System.out.println("\n");
        break;

        case 7:
        exit = true;
        break;
    }
}while(exit != true);      
  
    }
}
