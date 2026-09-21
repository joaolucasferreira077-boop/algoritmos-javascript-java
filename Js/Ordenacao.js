function quicksort(v, inicio, fim) {
  if (inicio >= fim) {
    return;
  }
  let pivo = v[fim];
  let i = inicio - 1;
  for (let j = inicio; j < fim; j++) {
    if (v[j] <= pivo) {
      i++;
      let temp = v[i];
      v[i] = v[j];
      v[j] = temp;
    }
  }
  let temp = v[i + 1];
  v[i + 1] = v[fim];
  v[fim] = temp;

  quicksort(v, inicio, i);      
  quicksort(v, i + 2, fim);      
}

let vetor = [9, 3, 7, 1, 8, 2, 5, 3];
quicksort(vetor, 0, vetor.length - 1);
console.log(vetor);