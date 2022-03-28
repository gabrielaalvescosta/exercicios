number = int(input('Digite um número entre 0 a 99: '))
if 100 > number > 9:
    uni = number % 10
    dez = (number - uni)/10
    print('Dezenas: ' + str(dez) + ' e unidades: ' + str(uni)) 
elif 10 > number > 0:
    dez = 0
    uni = number
    print('Dezenas: ' + str(dez) + ' e unidades: ' + str(uni))
else:
    print('Escolha um número entre 0 e 99')