public class Shell {
    public static void ordenamientoShell(int[] arreglo) {
        int n = arreglo.length;
 // 1. Ciclo principal que controla el valor del gap (brecha)
        for (int gap = n / 2; gap > 0; gap /= 2) {
// 2. Recorremos los elementos comenzando desde el índice gap
            for (int i = gap; i < n; i++) {
// 3. Ciclo interno que compara y mueve los elementos según el valor del gap
                for (int j = i-gap; j >= 0 && arreglo[j] > arreglo[j+ gap]; j-=gap) {
                   int temp = arreglo[j];
                   arreglo[j]=arreglo[j+gap];
                   arreglo[j+gap]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {12, 34, 54, 2, 3};
        System.out.println("Arreglo antes de ordenar:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Llamada al método de Shell Sort
        ordenamientoShell(arreglo);

        System.out.println("Arreglo después de ordenar:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
