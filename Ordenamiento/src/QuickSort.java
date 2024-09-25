public class QuickSort {
    public static void main(String[] args) {
        int[] arreglo = {22, 7, 2, 15, 18, 10, 25, 1, 30};
        System.out.println("Arreglo antes de ordenar:");
        imprimirArreglo(arreglo);

        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }

     // Método para imprimir el arreglo
     static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Método QuickSort
    static void quickSort(int[] arreglo, int left, int right) {
        int i, j, temp; 
        i=left; //índice izquierdo
        j=right; //indice derecho
        do{
    // Mueve j hacia la izquierda hasta encontrar un elemento menor o igual que el pivote
            while (arreglo[j] > arreglo[i] && j>i)j--;
            if(i < j){
                temp=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=temp;
                i++;
            } 
    // Mueve i hacia la derecha hasta encontrar un elemento mayor o igual que el pivote
            while (arreglo[i] < arreglo[j] && i<j)i++;
            if(i<j){
                temp=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=temp;
                j--;
            }
        }while(i<j);
    // Ordena la sublista a la izquierda del pivote
        if(left < j) quickSort(arreglo, left, j-1);
    // Ordena la sublista a la derecha del pivote
        if(i<right) quickSort(arreglo, i+1, right);
     }
 }

