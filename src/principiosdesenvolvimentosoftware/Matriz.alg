programa {
    funcao inicio() {

        real a, b, nota1, nota2

        escreva("Digite a note P1 do aluno A ")
        leia(a)
        leia(b)

        escreva("\nDigite a note P2 do aluno B ")
        leia(nota1)
        leia(nota2)

        escreva("\nMédia do aluno A: ", media_aluno(a, b))
        escreva("\nMédia do aluno B: ", media_aluno(nota1, nota2))
    }

    funcao real media_aluno(real nota_a, real nota_b) {

        retorne(nota1 +  nota2) / 2
    }
}