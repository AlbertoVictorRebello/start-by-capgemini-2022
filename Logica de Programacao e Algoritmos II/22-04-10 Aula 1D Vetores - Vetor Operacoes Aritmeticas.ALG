Algoritmo "Vetores - Vetor Operacoes Aritmeticas"

Var
numeros: vetor[1..5] de inteiro
reverso: vetor[1..5] de inteiro
resultados: vetor[1..5] de inteiro
i, limite, opcao: inteiro




Inicio
limite <- 5

// Atribui��o de valores aleatorios ao primeiro vetor
aleatorio 1, 10
   para i de 1 ate limite faca
        Leia(numeros[i])
   fimpara
aleatorio off

// Atribui��o de valores em ordem reversao ao segundo vetor
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

Escreval("Escolha a opera��o desejada:")
Escreval("1 - Adi��o")
Escreval("2 - Subtra��o")
Escreval("3 - Multipica��o")
Escreval("4 - Divis�o")
Leia(opcao)

// Execu��o da opera��o escolhida
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