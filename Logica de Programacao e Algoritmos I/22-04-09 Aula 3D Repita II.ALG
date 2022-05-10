Algoritmo "Enquanto"

Var
senha, resposta: caracter
i: inteiro


Inicio
Escreval("Informe sua senha")
leia(senha)
i <- 1
repita
      Escreval("Digite sua senha para sair do programa")
      leia(resposta)
      se senha = resposta entao
         Escreval("Acertou!")
         interrompa
      senao
         Escreval("Errou. Esta é sua tentativa nº ", i)
      fimse
      i <- i + 1
ate i > 10
Escreval("Fim!")

Fimalgoritmo