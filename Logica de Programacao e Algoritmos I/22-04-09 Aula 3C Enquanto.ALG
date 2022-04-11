Algoritmo "Enquanto"

Var
qtEntrevistados, qtMenoresDeIdade, maisNovo, maisVelho, idadeInformada, somaIdades: inteiro
porcentagemMenorIdade, mediaIdade: real



Inicio
maisNovo <- 9999
maisVelho <- 0
qtEntrevistados <- 0
enquanto qtEntrevistados < 5  faca
         Escreval("Favor, informar a sua idade:")
         leia(idadeInformada)
         
         se idadeInformada >= maisVelho entao
            maisVelho <- idadeInformada
         fimse
         
         se idadeInformada <= maisNovo entao
            maisNovo <- idadeInformada
         fimse
         
         se idadeInformada < 18 entao
            qtMenoresDeIdade <- qtMenoresDeIdade + 1
         fimse
         somaIdades <- somaIdades + idadeInformada
         qtEntrevistados <- qtEntrevistados + 1
         
fimenquanto
Escreval("Mais novo: ", maisNovo)
Escreval("Mais velho: ", maisVelho)
porcentagemMenorIdade <- qtMenoresDeIdade / 5 * 100
Escreval("Porcentagem menor idade", porcentagemMenorIdade, "%")
mediaIdade <- somaIdades / 5
Escreval("Média de idade:", mediaIdade)

Fimalgoritmo