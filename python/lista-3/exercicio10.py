import math

numa = int(input('Digite o número A: '))
numb = int(input('Digite o número B: '))
numc = int(input('Digite o número C: '))

if numa != 0:
    delta = (numb*numb) - 4 * numa * numc
    x1 = (-numb) + math.sqrt(delta) / 2 * numa
    x2 = (-numb) - math.sqrt(delta) / 2 * numa
    print('As raízes reais são ' + str(x1) + ' e ' + str(x2))
else:
    print('Não há raízes reais.')

