Algoritmo "Extra - Cálculo do IMCTabela Verdade"

Var
altura, peso, IMC: real

Inicio
Escreval("Por favor, informe sua altura: ")
leia(altura)

Escreval("Por favor, informe seu peso: ")
leia(peso)

imc <- peso / altura ^ 2

se imc < 19 entao
 Escreval("Abaixo do peso")
senao
se imc < 24 entao
 Escreval("Peso ideal")
senao
     Escreval("Acima do peso. IMC = ", imc)
fimse
fimse


Fimalgoritmo