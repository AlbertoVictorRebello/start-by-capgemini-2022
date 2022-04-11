Algoritmo "Exercicio Funcao-Procedimento Cadastro Clientes"

Var
   opcaoMenu: caracter
   clientes: vetor[1..5] de caracter
   procedimento mostrarMenu()
inicio
   Escreval("1 - Cadastrar")
   Escreval("2 - Pesquisar")
   Escreval("3 - Excluir")
   Leia(opcaoMenu)
fimprocedimento

procedimento cadastrar()
var
   i: inteiro
inicio
   para i de 1 ate 5 faca
        se (clientes[i] = "") entao
           Escreval("Informe o nome do cliente: ")
           Leia(clientes[i])
        fimse
   fimpara
fimprocedimento

procedimento pesquisar()
var
   nomeSolicitado: caracter
   i, indiceSucesso: inteiro
inicio
   indiceSucesso <- 0
   Escreval("Informe o nome do cliente a ser pesquisado: ")
   Leia(nomeSolicitado)
   para i de 1 ate 5 faca
        se (clientes[i] = nomeSolicitado) entao
           indiceSucesso <- i
           interrompa
        fimse
   fimpara

   se indiceSucesso <> 0 entao
      Escreval("O nome do cliente está cadastrado na posição: ", indiceSucesso)
   senao
        Escreval("Cliente não localizado")
   fimse
fimprocedimento

procedimento excluir()
var
   indiceExclusao: inteiro
inicio
   Escreval("Informar o índice a ser excluído")
   Leia(indiceExclusao)

   se (indiceExclusao > 0) E (indiceExclusao < 6) entao
        clientes[indiceExclusao] <- ""
   senao
        Escreval("Indice inválido")
   fimse

fimprocedimento
inicio

repita
      mostrarMenu()
      escolha opcaoMenu
      caso "1"
           cadastrar()
      caso "2"
           pesquisar()
      caso "3"
           excluir()
      outrocaso
          Escreval("Opção inválida")
      fimescolha
ate opcaoMenu = "4"


Fimalgoritmo