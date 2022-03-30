num1 = int(input('Escolha o primeiro número: '))
num2 = int(input('Escolha o segundo número: '))

if (num1 > num2):
    print('O número' + num1 + 'é maior.')
elif (num1 < num2):
    print('O número ' + num2 + 'é maior.')
else:
    print('Houve um empate')