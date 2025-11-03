package ordenacao;

public class SelectSort {
    static int v[] = {5, 6, 2, 3, 8, 3, 4, 1, 7};
    
    public static void selectSort(int v[]) {
        for (int i = 0; i < v.length; i++) {
        int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
        int aux = v[i];
        v[i] = v[menor];
        v[menor] = aux;
        }
    }

    public static void showSelectionSort() {
        System.out.println("- - - - - - Selection Sort - - - - - -");
            System.out.printf("Vetor Original: a = { ");
            for (int i = 0; i < v.length; i++) {
                System.out.printf("%d ", v[i]);
            }
            System.out.println("}");

            // Chamada do select
            selectSort(v);

            // Vetor Modificado
            System.out.printf("Vetor Ordenado: A = { ");
            for (int i = 0; i < v.length; i++) {
                System.out.printf("%d ", v[i]);
            }
            System.out.println("}\n- - - - - - - - - - - - - - - - - - - -\n");
    }

}
