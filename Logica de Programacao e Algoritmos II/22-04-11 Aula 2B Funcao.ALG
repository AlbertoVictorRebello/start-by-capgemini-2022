Algoritmo "Fun��o"

Var
teste: inteiro
//Declara um procedimento que atribui a soma dos par�metros � vari�vel teste.
procedimento somar(i, j: inteiro)
inicio
      teste <- i + j
fimprocedimento

// Declara uma fun��o que invoca o procediento somar e retorna a vari�vel teste
funcao retornarSoma(i, j: inteiro): inteiro
inicio
      somar(i, j)
      retorne teste
fimfuncao

Inicio

// Procedimento somar � invocado.
somar(10, 20)

// Resultado calculado pelo procedimento somar � impresso.
Escreval(teste)

// Resultado calculado pela fun��o retornarSsoma � impresso.
Escreval(retornarSoma(20, 30))

Fimalgoritmo