public class ej {
    static int mayor = Integer.MIN_VALUE;
    static void EncontrarMayor(int array [], int inicio){
        //case base
        if(inicio==0){
            return;
        }
        //caso recursiva
        //encontrar el valor mayor
         if(array[inicio] > mayor){
               mayor=array[inicio];
          }
          EncontrarMayor(array, inicio-1);
        }
        public static void main(String[] args) {
        int[] arreglo = {3, 1, 4, 1, 5, 9, 2, 6};
        EncontrarMayor(arreglo, arreglo.length - 1); // Iniciar desde el último índice
        System.out.println("El valor mayor del arreglo es: " + mayor );
    }
    
    }
