Algoritmo "Escolha"

Var
voto: inteiro

Inicio
Escreval("Digite o voto: ")
leia(voto)

Escreval("Apura��o usando estrutura se/senao")

se voto = 20 entao
 Escreval("Voc� votou em Marcelo Bernart")
senao
se voto = 30  entao
 Escreval("Voc� votou no Pernalonga")
senao
se voto = 40  entao
 Escreval("Voc� votou em Patolino")
senao
 Escreval("Voc� votou nulo")
fimse
fimse
fimse

// Usando a estrutura condicional Escolha

Escreval("Apura��o usando estrutura Escolha")
Escolha voto
caso 20
     Escreval("Voc� votou em Marcelo Bernart")
caso 30
     Escreval("Voc� votou no Pernalonga")
caso 40
 Escreval("Voc� votou em Patolino")
outrocaso
 Escreval("Voc� votou nulo")
fimescolha



Fimalgoritmo