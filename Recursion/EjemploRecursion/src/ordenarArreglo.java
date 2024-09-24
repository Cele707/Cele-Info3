public class ordenarArreglo {
    public static void main(String[] args) {
        int [] arreglo = { 5, 2, 9, 1, 5, 6 };
        int inicio = 0;//para moverme dentro del objeto (arreglo)

        System.out.println("Arreglo antes de ordenar:");
        for(int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

       ordenamientoArreglo(arreglo, 0);

        System.out.print("\nArreglo ordenado de menor a mayor:\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    //Función recursiva para ordenar un arreglo de enteros de menor a mayor
    static void ordenamientoArreglo(int arreglo[], int inicio){
    //caso base->si el índice de inicio es igual o mayor que el tamaño del arreglo menos uno, ya está ordenado
        if(arreglo.length - inicio <= 1){
            return;
        }
        int indiceMinimo=inicio;
    //Encontrar indice del elemento menor
        for(int i=inicio + 1; i<arreglo.length; i++){
            if(arreglo[i]<arreglo[indiceMinimo]){
                indiceMinimo=i;
            }
        }
    //Colocar el minimo elemento en la primera posicion
    int aux = arreglo [inicio];
    arreglo[inicio] = arreglo[indiceMinimo];
    arreglo[indiceMinimo] = aux;

    //Llamamos a la funcion recursivamente
    ordenamientoArreglo(arreglo, inicio + 1);
    }    
}
