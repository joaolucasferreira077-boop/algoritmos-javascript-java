static int somatorio(int[] numeros) {
    int soma = 0;
    for (int i = 0; i < numeros.length; i++) {
        soma = soma + numeros[i];
    }
    return soma;
}