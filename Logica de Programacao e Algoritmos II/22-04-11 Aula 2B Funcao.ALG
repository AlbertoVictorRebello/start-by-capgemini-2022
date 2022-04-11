Algoritmo "Função"

Var
teste: inteiro
//Declara um procedimento que atribui a soma dos parâmetros à variável teste.
procedimento somar(i, j: inteiro)
inicio
      teste <- i + j
fimprocedimento

// Declara uma função que invoca o procediento somar e retorna a variável teste
funcao retornarSoma(i, j: inteiro): inteiro
inicio
      somar(i, j)
      retorne teste
fimfuncao

Inicio

// Procedimento somar é invocado.
somar(10, 20)

// Resultado calculado pelo procedimento somar é impresso.
Escreval(teste)

// Resultado calculado pela função retornarSsoma é impresso.
Escreval(retornarSoma(20, 30))

Fimalgoritmo