public class Main {
    public static void main(String[] args) {
        MonticuloBinario monticulo = new MonticuloBinario();

        int[] valores = {20, 15, 30, 5, 10};
        for (int v : valores) {
            System.out.println("Insertando: " + v);
            monticulo.insertar(v);
            monticulo.imprimirMonticulo();
        }

        System.out.println("Eliminando mínimo: " + monticulo.eliminarMin());
        monticulo.imprimirMonticulo();
    }
}
