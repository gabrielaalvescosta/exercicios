'''
Altere o algoritmo anterior para, além da média, contar os alunos que tiraram entre 0 e 5, 0
(0 ≤ nota < 5, 0) e acima de 5, 0 (nota ≥ 5, 0).

'''

i = 1
numero_alunos = int(input("Digite o número de alunos: "))
n5 = 0
n = 0 

while i <= numero_alunos:
    print("aluno", i)
    numero_notas = int(input("Digite a nota do aluno " + str(i) + ": "))
    
    if numero_notas >= 5:
        n5 += 1
    elif numero_notas < 5:
        n += 1
        
    soma = numero_notas * (numero_notas + 1) // 2
    media = soma / numero_alunos
    print("A média da soma das notas dos " + str(numero_alunos) + " alunos é de: ", media)
    print("O número de alunos que com notas maiores que 5 é de: ", n5)
    print("O número de alunos que com notas menores que 5 é de: ", n)
    i += 1

