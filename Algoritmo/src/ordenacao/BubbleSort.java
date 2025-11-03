package ordenacao;

public class BubbleSort {
    static int v[] = {5, 6, 2, 3, 8, 3, 4, 1, 7};

    public static void bubbleSort(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void showBubbleSort() {
        System.out.println("- - - - - - Bubble Sort - - - - - -");
        System.out.printf("Vetor Original: a = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}");

        bubbleSort(v);

        System.out.printf("Vetor Ordenado: A = { ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println("}\n- - - - - - - - - - - - - - - - - - - -\n");
    }
}
