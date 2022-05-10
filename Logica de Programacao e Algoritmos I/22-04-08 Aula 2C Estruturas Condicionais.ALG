Algoritmo "Estruturas Condicionais"

Var

nota1, nota2, nota3, media: real

Inicio
Escreval("Nota 1")
leia(nota1)

Escreval("Nota 2")
leia(nota2)

Escreval("Nota 3")
leia(nota3)

media <- (nota1 + nota2 + nota3) / 3

se media < 7 entao
   Escreval("Você está em recuperação.")
senao
   Escreval("Você passou.")
fimse
Fimalgoritmo