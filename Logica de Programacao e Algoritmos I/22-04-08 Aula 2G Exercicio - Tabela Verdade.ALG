Algoritmo "Exercicio - Tabela Verdade"

Var
lado1, lado2, lado3: real

Inicio
Escreval("Lado 1:")
leia(lado1)

Escreval("Lado 2:")
leia(lado2)

Escreval("Lado 3:")
leia(lado3)

se (lado1 > lado2 + lado3) OU (lado2 > lado1 + lado3) OU (lado3 > lado1 + lado2) entao
   Escreval("Não é um triangulo")
senao
     se (lado1 = lado2) E (lado2 = lado3) entao
        Escreval("Equilátero")
     senao
     se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
        Escreval("Isósceles")
     senao
        Escreval("Escaleno")
fimse
fimse
fimse
     


Fimalgoritmo