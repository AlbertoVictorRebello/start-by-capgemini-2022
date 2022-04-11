Algoritmo "Vetores - Vetor Reverso"

Var
numeros: vetor[1..5] de inteiro
reverso: vetor[1..5] de inteiro
i, limite: inteiro


Inicio
limite <- 5

aleatorio 1, 10
   para i de 1 ate limite faca
        Leia(numeros[i])
   fimpara
aleatorio off

para i de 1 ate limite faca
     reverso[limite - i + 1] <- numeros[i]
fimpara

para i de 1 ate limite faca
     Escreva(numeros[i], " ")
fimpara

Escreval("")

para i de 1 ate limite faca
     Escreva(reverso[i], " ")
fimpara
Fimalgoritmo