Algoritmo " Matrizes - Cinema"

Var
i, j, limite, opcao, quantidade: inteiro
cinema: vetor[1..10, 1..10] de caracter
Inicio
limite <- 10
quantidade <- 0

para i de 1 ate limite faca
   para j de 1 ate limite faca
       cinema[i, j] <- "O"
   fimpara
fimpara


enquanto  opcao <> 4 faca
         Escreval("Escolha a operação desejada:")
         Escreval("1 - Reservar/Liberar")
         Escreval("2 - Comprar")
         Escreval("3 - Layout do cinema")
         Escreval("4 - Sair")
         Leia(opcao)
         
         escolha opcao
             caso 1
                  Escreval("Escolha a fileira")
                  leia(i)
                  Escreval("Escolha a poltrona")
                  Leia(j)
                  
                  se (cinema[i, j] = "^") entao
                     Escreval("Poltrona indisponível. Tente outra vez.")
                  senao
                       se (cinema[i, j] = "X") entao
                           cinema[i, j] <- "O"
                       senao
                          cinema[i, j] <- "X"
                       fimse
                   fimse

             
             caso 2
                  quantidade <- 0
                  para i de 1 ate limite faca
                     para j de 1 ate limite faca
                        se (cinema[i, j] = "X") entao
                            cinema[i, j] <- "^"
                            quantidade <- quantidade + 1
                        fimse
                     fimpara
                  fimpara
                  Escreval("Total de poltronas compradas: ", quantidade)
                  
             caso 3
                  para i de 1 ate limite faca
                     para j de 1 ate limite faca
                         Escreva(cinema[i, j], " ")
                     fimpara
                         Escreval()
                  fimpara
             
             caso 4
                  Escreva("Obrigado pela preferência! ")
             
             outrocaso
                 Escreval("Opção inválida. Tente Novamente.")
         
         fimescolha
fimenquanto

Fimalgoritmo