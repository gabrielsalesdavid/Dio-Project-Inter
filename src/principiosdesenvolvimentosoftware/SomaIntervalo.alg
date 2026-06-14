funcao somaIntervalo(x, y :inteiro): inteiro
var
resultadoParcial, resultado :inteiro
total :real
inicio
total <- y / 2
resultadoParcial <- x + y

resultado <- total * resultadoParcial
retorne resultado
fimfuncao

Algoritmo "SomaIntervalo"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/06/2026
Var
// Seção de Declarações das variáveis 
x, y, soma :inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite os números para executar a soma do intervalos")
leia(x)
leia(y)

soma <- somaIntervalo(x, y)

escreva(soma)

Fimalgoritmo

//programa {
//    funcao inicio() {
//        inteiro x, y;
//        escreva("Digite os números para executar a soma do intervalos")
//        leia(x)
//        leia(y)
//    escreva(soma_intervalo(x, y))
//    }
//   funcao inteiro soma_intervalo(inteiro x, inteiro y) {
//        inteiro total, resultado_parcial
//        total = y / 2
//        resultado_parcial = x + y
//        inteiro resultado = total * resultado_parcial
//        retorne resultado
//    }
//}