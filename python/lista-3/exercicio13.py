dia = int(input('Digite o dia: '))
mes = int(input('Digite o mês: '))

meses = mes <= 12
dias = dia <= 31

if dias and meses:
    print('A data ' + str(dia) + '/' + str(mes) + ' é válido.')
elif mes == 2 and dia <= 29:
    print('A data ' + str(dia) + '/' + str(mes) + ' é válido.')
else:
    print('A data ' + str(dia) + '/' + str(mes) + ' não é válido.')