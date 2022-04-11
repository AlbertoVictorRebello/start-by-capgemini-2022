Algoritmo "Para e Aleatório"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
i, aleatorioMaximo, aleatorioMinimo, incremento: inteiro

Inicio
Repita
      aleatorio 1, 100
      leia(aleatorioMaximo)
      leia(aleatorioMinimo)
      aleatorio off
ate aleatorioMaximo >= aleatorioMinimo
          limpatela
          
      aleatorio 1, 5
      leia(incremento)
      aleatorio off
      
      para i de aleatorioMinimo ate aleatorioMaximo passo incremento faca
             Escreval(i)
      fimpara

Fimalgoritmo