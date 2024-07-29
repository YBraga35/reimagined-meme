public class MergeSort {
    public static int comparacoes = 0;
    public static int trocas = 0;

    public int[] ordenacaoMerge(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            ordenacaoMerge(vetor, esquerda, meio);
            ordenacaoMerge(vetor, meio + 1, direita);
            mesclar(vetor, esquerda, meio, direita);
        }
        return vetor;
    }

    public void mesclar(int[] vetor, int esquerda, int meio, int direita) {
        int[] auxiliar = new int[vetor.length];
        for (int i = esquerda; i <= direita; i++) {
            auxiliar[i] = vetor[i];
        }
        int i = esquerda;
        int j = meio + 1;
        int k = esquerda;
        while (i <= meio && j <= direita) {
            comparacoes++;
            if (auxiliar[i] <= auxiliar[j]) {
                vetor[k] = auxiliar[i];
                i++;
            } else {
                vetor[k] = auxiliar[j];
                j++;
                trocas++;
            }
            k++;
        }
        while (i <= meio) {
            vetor[k] = auxiliar[i];
            i++;
            k++;
        }
        while (j <= direita) {
            vetor[k] = auxiliar[j];
            j++;
            k++;
        }
    }
}
