package ordenacao;

public class MergeSort {
    static int v[] = {5, 6, 2, 3, 8, 3, 4, 1, 7};

    public static void mergeSort(int v[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            merge(v, inicio, meio, fim);
        }
    }

    private static void merge(int v[], int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = v[inicio + i];
        for (int j = 0; j < n2; j++)
            R[j] = v[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                v[k] = L[i];
                i++;
            } else {
                v[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            v[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            v[k] = R[j];
            j++;
            k++;
        }
    }

    public static void showMergeSort() {
        System.out.println("- - - - - - Merge Sort - - - - - -");
        System.out.printf("Vetor Original: a = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}");

        mergeSort(v, 0, v.length - 1);

        System.out.printf(" Vetor Ordenado: A = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}\n- - - - - - - - - - - - - - - - - - - -\n");
    }
}
