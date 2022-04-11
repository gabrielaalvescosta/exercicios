'''
Dados o número n de alunos de uma turma de Algoritmos e suas notas da primeira prova,
determinar a média das notas dessa turma. Considere que o usuário digite as informações
corretamente.

'''
i = 1
numero_alunos = int(input("Digite o número de alunos: "))

while i <= numero_alunos:
    print("aluno", i)
    numero_notas = int(input("Digite a nota do aluno " + str(i) + ": "))
    soma = numero_notas * (numero_notas + 1) // 2
    media = soma / numero_alunos
    print("A média da soma das notas dos " + str(numero_alunos) + " alunos é de: ", media)
    i += 1

