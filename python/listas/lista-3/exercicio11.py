valor = float(input('Digite o valor do produto: '))

a_vista = valor * 0.9
credito = valor * 0.95
duas_vezes = valor
quatro_vezes = valor * 1.07

cod1 = a_vista
cod2 = credito
cod3 = duas_vezes
cod4 = quatro_vezes

escolha = int(input('Como pretende pagar o produto? Escolha um número de 1 a 4: '))

if escolha == 1:
    print('O valor final do produto é de ' + str(cod1))
elif escolha == 2:
    print('O valor final do produto é de ' + str(cod2))
elif escolha == 3:
    print('O valor final do produto é de ' + str(cod3))
elif escolha == 4:
    print('O valor final do produto é de ' + str(cod4))