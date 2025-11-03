package ordenacao;

public class InsertionSort {
    static int v[] = {1, 4, 5, 7, 3, 3, 2, 6, 9};

    public static void insertionSort(int v[]) {
        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
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
