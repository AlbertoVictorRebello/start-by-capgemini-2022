Algoritmo "Tabela Verdade"

Var
afirmacao: logico
i: inteiro
j: inteiro

Inicio
i <- 10
j <- 20

//Conjun��o:
// sim E sim = SIM
// sim E nao = NAO
// nao E sim = NAO
// nao E nao = NAO

//Disjun��o:
// sim OU sim = SIM
// sim OU nao = SIM
// nao OU sim = SIM
// nao OU nao = NAO

se (i = 10) E (j = 20) entao
   Escreval("Fazer algo.")
senao
   Escreval("Fazer nada.")
fimse
Fimalgoritmo