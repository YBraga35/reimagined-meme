

public class SelectionSort {
    public static int comparacoes = 0;
    public static int trocas = 0;

    public void ordenacaoSelecao(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                comparacoes++;
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = aux;
                trocas += 2; // Contar como duas trocas
            }
        }
    }
}
