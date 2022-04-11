Algoritmo "Lógica de Programação e Algoritmos I"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/04/2022
Var
// 1ª Opção -  declarar as variáveis em uma só linha:
// nome, sobrenome, nomeCompleto: literal

// 2ª Opção - declarar cada variável em uma linha após a outra:
//nome: literal
//sobrenome: literal
//nomeCompleto: literal

nome, sobrenome, nomeCompleto: caracter
Inicio
escreval("Informe o seu nome")
leia(nome)

escreval("Informe o seu sobrenome")
leia(sobrenome)

nomeCompleto <- nome + " " + sobrenome
escreval(nomeCompleto)

Fimalgoritmo