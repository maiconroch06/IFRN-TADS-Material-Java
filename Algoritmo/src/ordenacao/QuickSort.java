package ordenacao;

public class QuickSort {
    static int v[] = {1, 4, 5, 7, 3, 3, 2, 6, 9};

    public static void quickSort(int v[], int inicio, int fim) {
        if (inicio < fim) {
            int p = particiona(v, inicio, fim);
            quickSort(v, inicio, p - 1);
            quickSort(v, p + 1, fim);
        }
    }

    private static int particiona(int[] v, int ini, int fim) {
        int Pselecionado = ini;
        int pivo = v[fim];

        for (int i = ini; i < fim; i++) {
            if (v[i] <= pivo) {
                int temp = v[i];
                v[i] = v[Pselecionado];
                v[Pselecionado] = temp;

                Pselecionado++;
            }
        }

        int temp = v[fim];
        v[fim] = v[Pselecionado];
        v[Pselecionado] = temp;

        return Pselecionado;
    }

    public static void showQuickSort() {
        System.out.println("- - - - - - Quick Sort - - - - - -");
        System.out.printf("Vetor Original: b = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}");

        quickSort(v, 0, v.length - 1);

        System.out.printf("Vetor Ordenado: B = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}\n- - - - - - - - - - - - - - - - - - - -\n");
    }
}
