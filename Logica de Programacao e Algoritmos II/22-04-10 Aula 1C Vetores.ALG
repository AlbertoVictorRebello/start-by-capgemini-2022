Algoritmo "Vetores"

Var
nomes: vetor[1..5] de caracter
pesquisa: caracter
i, limite: inteiro
encontrado: inteiro

Inicio
limite <- 1
encontrado <- 0

para i de 1 ate limite faca
     Escreval("Qual o seu nome?")
     Leia(nomes[i])
fimpara
limpatela

Escreval("Informe um nome para pesquisa")
Leia(pesquisa)

para i de 1 ate limite faca
     se nomes[i] = pesquisa entao
        encontrado <- i
     fimse
fimpara
se encontrado <> 0 entao
   Escreval("Encontrado o nome: ", nomes[encontrado])
senao
        Escreval("Não foi encontrado")
fimse

Fimalgoritmo