import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        SelectionSort selectionSort = new SelectionSort();
        
        int tamanho = 10;
        int[] vetorOriginal = new int[tamanho];
        int[] vetorMerge = new int[tamanho];
        int[] vetorSelecao = new int[tamanho];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            vetorOriginal[i] = scanner.nextInt();
        }
        scanner.close();

        // Fazendo cópia dos vetores originais
        System.arraycopy(vetorOriginal, 0, vetorMerge, 0, tamanho);
        System.arraycopy(vetorOriginal, 0, vetorSelecao, 0, tamanho);

        // Ordenando com Merge Sort
        mergeSort.ordenacaoMerge(vetorMerge, 0, tamanho - 1);
        System.out.println("Resultado da ordenação com Merge Sort:");
        exibirResultados(vetorMerge, MergeSort.comparacoes, MergeSort.trocas);

        // Resetando os contadores
        MergeSort.comparacoes = 0;
        MergeSort.trocas = 0;

        // Ordenando com Selection Sort
        selectionSort.ordenacaoSelecao(vetorSelecao);
        System.out.println("Resultado da ordenação com Selection Sort:");
        exibirResultados(vetorSelecao, SelectionSort.comparacoes, SelectionSort.trocas);
    }

    private static void exibirResultados(int[] vetor, int comparacoes, int trocas) {
        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\nNúmero total de comparações: " + comparacoes);
        System.out.println("Número total de trocas de posições: " + trocas);
        System.out.println();
    }
}
