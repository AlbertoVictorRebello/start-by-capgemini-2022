Algoritmo "Orientacao a Objetos - Tipos"
tipo
cadastroCliente = registro
   nome: caractere
   rg: caractere
   idade: caractere

fimregistro

Var
opcaoMenu: caracter
clientes: vetor[0..5] de cadastroCliente
procedimento mostrarMenu()
inicio
   Escreval("1 - Cadastrar")
   Escreval("2 - Pesquisar")
   Escreval("3 - Excluir")
   Escreval("4 - Listar")
   Escreval("5 - Sair")
   Leia(opcaoMenu)
fimprocedimento

procedimento cadastrar()
var
   i: inteiro
inicio
   para i de 1 ate 5 faca
        se (clientes[i].nome = "") entao
           Escreval("Informe o nome do cliente: ")
           Leia(clientes[i].nome)
           Escreval("Informe o RG do cliente: ")
           Leia(clientes[i].rg)
           Escreval("Informe a idade do cliente: ")
           Leia(clientes[i].idade)
        fimse
   fimpara
fimprocedimento

procedimento pesquisar()
var
   nomeSolicitado: caracter
   i, indiceSucesso: inteiro
inicio
   indiceSucesso <- 0
   Escreval("Informe o RG do cliente a ser pesquisado: ")
   Leia(nomeSolicitado)
   para i de 1 ate 5 faca
        se (clientes[i].rg = nomeSolicitado) entao
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

procedimento listar()
var
   i: inteiro
inicio
   para i de 1 ate 5 faca
        Escreval("Nome: ", clientes[i].nome, "- RG: ", clientes[i].rg, "- Idade: ", clientes[i].idade)
   fimpara
fimprocedimento

procedimento excluir()
var
   indiceExclusao: inteiro
inicio
   Escreval("Informar o índice a ser excluído")
   Leia(indiceExclusao)

   se (indiceExclusao > 0) E (indiceExclusao < 6) entao
        clientes[indiceExclusao].nome <- ""
        clientes[indiceExclusao].rg <- ""
        clientes[indiceExclusao].idade <- ""
   senao
        Escreval("Indice inválido")
   fimse

fimprocedimento
Inicio

repita
      mostrarMenu()
      escolha opcaoMenu
      caso "1"
           cadastrar()
      caso "2"
           pesquisar()
      caso "3"
           excluir()
      caso "4"
           listar()
      caso "5"
           Escreval("Obrigado por escolher nosso sistema!")
      outrocaso
          Escreval("Opção inválida")
      fimescolha
ate opcaoMenu = "5"

Fimalgoritmo