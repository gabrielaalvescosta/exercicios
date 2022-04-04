dia = int(input('Digite o dia: '))
mes = int(input('Digite o mês: '))
ano = int(input('Digite um ano: '))

bissexto = False

if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
    bissexto = True

    if bissexto == True and mes == 2 and dia == 29:
        print(str(dia) + '/' + str(mes) + '/' + str(ano) + ' é valido.')
    else:
        print('Esta data não é válida') 

if dia > 0 or dia >= 31 or mes < 1 or mes > 12:
    print(str(dia) + '/' + str(mes) + '/' + str(ano) + ' é valido.')

elif mes == 2 and dia <= 28:
    print(str(dia) + '/' + str(mes) + '/' + str(ano) + ' é valido.')

elif mes == 1 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 11 and dia == 31:
    print(str(dia) + '/' + str(mes) + '/' + str(ano) + ' é valido.')

else:
    print('Esta data não é válida') 