#valores iniciais para a contagem dos alunos
alunosImpar = 1
alunosPar = 2

#soma das notas
notasImpar = 0
notasPar = 0

while alunosImpar <= 49:
    print("VOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS ÍMPARES")
    nota1 = float(input("POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {}:  ".format(alunosImpar)))
    alunosImpar += 2
    notasImpar = notasImpar + nota1

while alunosPar <= 50:
    print("VOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS PARES")
    nota2 = float(input("POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {}:  ".format(alunosPar)))
    alunosPar += 2
    notasPar = notasPar + nota2

#calcula a média
mediaImpar = notasImpar / 25
mediaPar = notasPar / 25

#exibe média
print("A media dos alunos ímpares é: {}". format(mediaImpar))
print("A media dos alunos pares é: {}". format(mediaPar))

#maior média
if mediaImpar > mediaPar:
    print("Os alunos ímpares tiveram maiores notas")

elif mediaPar > mediaImpar:
    print("Os alunos pares tiveram maiores notas")

else:
    ("Houve empate!")
