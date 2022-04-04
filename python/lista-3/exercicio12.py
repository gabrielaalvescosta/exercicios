nota1 = float(input('Digite sua nota do primeiro semestre: '))
nota2 = float(input('Digite sua nota do segundo semestre: '))
faltas = int(input('Digite o número de faltas: '))
aulas_ministradas_anual = int(input('Digite o número de aulas ministradas: '))

aulas_assistidas = aulas_ministradas_anual - faltas

media_1semestre = nota1 * 4
media_2semestre = nota2 * 6

presenca = (aulas_assistidas / aulas_ministradas_anual) * 100

media_final = (media_1semestre + media_2semestre) / 10

if media_final >= 6 and presenca > 70:
    print('Aluno APROVADO. Sua média final foi de: ' + str(media_final) + ' e você teve ' + str(presenca) + ' por cento de presença.')
elif media_final < 6 or presenca < 70:
    print('Aluno REPROVADO. Sua média final foi de: ' + str(media_final) + ' e você teve ' + str(presenca) + ' por cento de presença. O mínimo é de 70 por cento')