Algoritmo "L�gica de Programa��o e Algoritmos I"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/04/2022
Var
// 1� Op��o -  declarar as vari�veis em uma s� linha:
// nome, sobrenome, nomeCompleto: literal

// 2� Op��o - declarar cada vari�vel em uma linha ap�s a outra:
//nome: literal
//sobrenome: literal
//nomeCompleto: literal

nome, sobrenome, nomeCompleto: literal
Inicio
escreval("Informe o seu nome")
leia(nome)

escreval("Informe o seu sobrenome")
leia(sobrenome)

nomeCompleto <- nome + " " + sobrenome
escreval(nomeCompleto)

Fimalgoritmo