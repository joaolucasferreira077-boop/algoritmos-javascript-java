function fibonacci(n) {
  if (n === 0) {
    return 0;
  }
  if (n === 1) {
    return 1;
  }
  let anterior = 0;
  let atual = 1;
  for (let i = 2; i <= n; i++) {
    let proximo = anterior + atual;
    anterior = atual;
    atual = proximo;
  }
  return atual;
}

for (let i = 0; i <= 10; i++) {
  console.log(fibonacci(i));
}
