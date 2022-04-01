dia = int(input('Digite o dia: '))
mes = int(input('Digite o mês: '))

meses = mes <= 12
dias = dia <= 30
trinta_dias = dia <= 31

if dias and meses:
    print('A data ' + str(dia) + '/' + str(mes) + ' é válido.')
elif mes == 2 and dia <= 29:
    print('A data ' + str(dia) + '/' + str(mes) + ' é válido.')
elif mes == 1 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 11:
    print('A data ' + str(dia) + '/' + str(mes) + ' é válido.')
else:
    print('A data ' + str(dia) + '/' + str(mes) + ' não é válido.')