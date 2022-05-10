Algoritmo "Vetores - Vetor Operacoes Aritmeticas"

Var
numeros: vetor[1..5] de inteiro
reverso: vetor[1..5] de inteiro
resultados: vetor[1..5] de inteiro
i, limite, opcao: inteiro




Inicio
limite <- 5

// Atribuição de valores aleatorios ao primeiro vetor
aleatorio 1, 10
   para i de 1 ate limite faca
        Leia(numeros[i])
   fimpara
aleatorio off

// Atribuição de valores em ordem reversao ao segundo vetor
para i de 1 ate limite faca
     reverso[limite - i + 1] <- numeros[i]
fimpara

// Impressao do primeiro vetor
para i de 1 ate limite faca
     Escreva(numeros[i], " ")
fimpara
Escreval("")

// Impressao do segundo vetor
para i de 1 ate limite faca
     Escreva(reverso[i], " ")
fimpara
Escreval("")

Escreval("Escolha a operação desejada:")
Escreval("1 - Adição")
Escreval("2 - Subtração")
Escreval("3 - Multipicação")
Escreval("4 - Divisão")
Leia(opcao)

// Execução da operação escolhida
para i de 1 ate limite faca
     Escolha opcao
         caso 1
             resultados[i] <- numeros[i] + reverso[i]
         caso 2
             resultados[i] <- numeros[i] - reverso[i]
         caso 3
             resultados[i] <- numeros[i] * reverso[i]
         caso 4
             resultados[i] <- Int(numeros[i] / reverso[i])
     fimescolha
fimpara

// Impressao do vetor com resultados
para i de 1 ate limite faca
     Escreva(resultados[i], " ")
fimpara
Fimalgoritmo