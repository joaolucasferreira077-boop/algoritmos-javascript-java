static void quicksort(int[] v, int inicio, int fim) {
    if (inicio >= fim) {
        return;
    }
    int pivo = v[fim];
    int i = inicio - 1;
    for (int j = inicio; j < fim; j++) {
        if (v[j] <= pivo) {
            i++;
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
    int temp = v[i + 1];
    v[i + 1] = v[fim];
    v[fim] = temp;

    quicksort(v, inicio, i);
    quicksort(v, i + 2, fim);
}