package ordenacao;

public class InsertionSort {
    static int v[] = {1, 4, 5, 7, 3, 3, 2, 6, 9};
    
    public static void insertionSort(int[] v) {
        int tamanho = v.length;

        for (int i = 1; i < tamanho; i++) {
            int selecionado = v[i];
            int j = i;

            while (j > 0 && v[j - 1] > selecionado) {
                v[j] = v[j - 1];
                j--;
            }

            v[j] = selecionado;
        }
    }

    public static void showInsertionSort() {
        System.out.println("- - - - - - Insertion Sort - - - - - -");
        System.out.printf("Vetor Original: b = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}");

        insertionSort(v);

        System.out.printf("Vetor Ordenado: B = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}\n- - - - - - - - - - - - - - - - - - - -\n");
    }
}
