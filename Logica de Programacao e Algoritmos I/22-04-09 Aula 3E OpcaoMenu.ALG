Algoritmo "Enquanto"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
opcaoMenu: caracter
totalConta: inteiro
i: inteiro
fim: logico


Inicio
totalConta <- 0
fim <- falso
repita
   Escreval("1 - Troca de óleo")
   Escreval("2 - Balanceamento")
   Escreval("3 - Sair")
   leia(opcaoMenu)
   se opcaoMenu = "1" entao
      totalConta <- totalConta + 100
   senao
        se opcaoMenu = "2" entao
                 totalConta <- totalConta + 70
        fimse
   fimse
   i <- i + 1
   
   se (opcaoMenu = "3") OU (i = 2) entao
      fim <- verdadeiro
   senao
        Escreval("Mais algum serviço?")
   fimse
   
   se i = 2 entao
      fim <- verdadeiro
   fimse
ate  fim
Escreval("Total conta: ", totalConta)

Fimalgoritmo