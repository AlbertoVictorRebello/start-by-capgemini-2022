Algoritmo "Vetores"

Var
vetorNomes: vetor[1..5] de caracter
vetorIdades: vetor[1..5] de inteiro
i, limite: inteiro

Inicio
limite <- 1

para i de 1 ate limite faca
     Escreval("Qual o seu nome?")
     Leia(vetorNomes[i])

     Escreval("Qual a sua idade?")
     Leia(vetorIdades[i])
fimpara

para i de 1 ate limite faca
      Escreval("Seu nome é ", vetorNomes[i], " e você tem ", vetorIdades[i], " anos.")

fimpara

Fimalgoritmo