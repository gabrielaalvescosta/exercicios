import math

num = int(input('Escolha o número: '))
square = math.square(num)

if num > 0:
    print('O resultado da raiz quadrada é ' + square)
else:
    print('É impossível extrair a raiz quadrada.')