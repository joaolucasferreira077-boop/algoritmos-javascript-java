static int contagem(int[] dados) {
    int n = dados.length;
    int primeiro = dados[0];
    int menor = primeiro;
    int maior = n;
    if (n < primeiro) {
        menor = n;
        maior = primeiro;
    }

    int cont = 0;
    for (int i = 0; i < dados.length; i++) {
        if (dados[i] >= menor && dados[i] <= maior) {
            cont++;
        }
    }
    return cont;
}