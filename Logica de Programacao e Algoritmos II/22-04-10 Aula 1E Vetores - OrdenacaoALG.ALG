Algoritmo "Vetores - Vetor Operacoes Aritmeticas"

Var
i, j, limite, aux: inteiro
numeros: vetor[1..10] de inteiro
ordenado: vetor[1..10] de inteiro

Inicio
limite <- 10

// Atribuição de valores aleatorios ao primeiro vetor
aleatorio 1, 100
   para i de 1 ate limite faca
        Leia(numeros[i])
        ordenado[i] <- numeros[i]
   fimpara
aleatorio off

para i de 1 ate limite faca
     para j de  i + 1 ate limite faca
     se  ordenado[i] > ordenado[j] entao
         aux <- ordenado[i]
         ordenado[i] <- ordenado[j]
         ordenado[j] <- aux
     fimse
fimpara
fimpara
// Impressao do primeiro vetor
para i de 1 ate limite faca
     Escreva(numeros[i], " ")
fimpara
Escreval()
// Impressao do vetor ordenado
para i de 1 ate limite faca
     Escreva(ordenado[i], " ")
fimpara
Fimalgoritmo