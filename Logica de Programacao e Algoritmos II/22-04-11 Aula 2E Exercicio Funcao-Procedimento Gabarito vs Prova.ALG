Algoritmo "Exercicio Funcao-Procedimento Gabarito vs Prova"

Var
   opcaoMenu: caracter
   gabarito: vetor[1..10] de caracter
   notaFinal: inteiro

procedimento mostrarMenu()
inicio
   Escreval("1 - Cadastrar gabarito")
   Escreval("2 - Cadastrar Prova")
   Escreval("3 - Sair")
   Leia(opcaoMenu)
fimprocedimento

procedimento cadastrarGabarito()
var
   i: inteiro
inicio
   para i de 1 ate 10 faca
        Escreval("Informe a resposta correta: ")
        Leia(gabarito[i])
   fimpara
fimprocedimento

funcao cadastrarProva(): inteiro
var
   i, nota: inteiro
   resposta: caracter
inicio
   nota <- 0
   para i de 1 ate 10 faca
        Escreval("Informe a resposta para a questão nº ", i)
        Leia(resposta)
        se (gabarito[i] = resposta) entao
           Escreval("Resposta correta")
           nota <- nota + 1
        senao
           Escreval("Resposta incorreta")
        fimse
   fimpara
   retorne nota
fimfuncao

procedimento verificarSituacao(notaFinal: inteiro)
inicio
   se (notaFinal >= 7) entao
      Escreval("O aluno foi aprovado. Sua nota foi ", notaFinal)
   senao
      Escreval("O aluno foi reprovado. Sua nota foi ", notaFinal)
   fimse
   Escreval("")
fimprocedimento
inicio
repita
      mostrarMenu()
      escolha opcaoMenu
      caso "1"
           cadastrarGabarito()
      caso "2"
           notaFinal <- cadastrarProva()
           verificarSituacao(notaFinal)
      caso "3"
           Escreval("Obrigado por usar o nosso sistema de verificação!")
      outrocaso
          Escreval("Opção inválida")
      fimescolha
ate opcaoMenu = "3"


Fimalgoritmo