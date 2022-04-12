'''
Um número inteiro positivo n é denominado primo se existirem apenas dois divisores inteiros
positivos dele: o 1 e o próprio n. Escreva um algoritmo que recebe um inteiro n e verica
se n é primo ou não.

'''

n = int(input("Digite um número: "))

contador = 0
i = 1

while i <= n:
    if n % i == 0:
        contador += 1
    i += 1

if contador == 2:
    print("Este número é primo.")
else:
    print("Este número não é primo.")