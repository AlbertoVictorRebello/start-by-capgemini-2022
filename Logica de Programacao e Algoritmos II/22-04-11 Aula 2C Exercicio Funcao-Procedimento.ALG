Algoritmo "Exercicio Funcao-Procedimento"

Var
lado1, lado2, lado3: inteiro
procedimento lerDados()
inicio
   Escreval("Lado 1: ")
   Leia(lado1)
   Escreval("Lado 2: ")
   Leia(lado2)
   Escreval("Lado 3: ")
   Leia(lado3)
fimprocedimento

funcao verificarIntegridadeTriangulo(): logico
inicio
      se (lado1 > lado2 + lado3) entao
           retorne falso
      senao
           se (lado2 > lado1 + lado3) entao
                retorne falso
      senao
         se (lado3 > lado2 + lado1) entao
              retorne falso
      senao
            retorne verdadeiro
      fimse
      fimse
      fimse
fimfuncao

funcao verificarTipoTriangulo(): caracter
inicio
se (lado1 * 2 = lado2 + lado3) entao
     retorne "Equilátero"
senao
     se (lado1 = lado2) OU (lado1 = lado3) OU (lado3 = lado2) entao
        retorne "Isósceles"
senao
     retorne "Escaleno"
fimse
fimse





fimfuncao

inicio

lerDados()
se (verificarIntegridadeTriangulo()) entao
   Escreval(verificarTipoTriangulo())
senao
   Escreval("Não é triangulo")
fimse

Fimalgoritmo