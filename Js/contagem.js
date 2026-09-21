function contagem(dados) {
  let n = dados.length;
  let primeiro = dados[0];
  let menor = primeiro;
  let maior = n;
  if (n < primeiro) {
    menor = n;
    maior = primeiro;
  }

  let cont = 0;
  for (let i = 0; i < dados.length; i++) {
    if (dados[i] >= menor && dados[i] <= maior) {
      cont++;
    }
  }
  return cont;
}

console.log(contagem([3, 10, 4, 7, 2, 5, 1]));