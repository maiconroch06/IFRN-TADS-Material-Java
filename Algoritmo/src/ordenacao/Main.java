package ordenacao;

import static ordenacao.SelectSort.*;
import static ordenacao.BubbleSort.*;
import static ordenacao.InsertionSort.*;
import static ordenacao.MergeSort.*;
import static ordenacao.QuickSort.*;

public class Main {
    
    public static void main(String[] args) {
        // - Selection Sort com vetor a

        showSelectionSort();

        // - Bubble Sort com vetor a
        
        showBubbleSort();
        
        // - Selection Sort com vetor a

        showInsertionSort();

        // - Merge Sort com vetor b
        
        showMergeSort();
        
        // - Quick Sort com vetor b
        showQuickSort();
        
    }
}
