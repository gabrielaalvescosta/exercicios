'''
Escreva um algoritmo que recebe um inteiro positivo n e calcula n! = 1 · 2 · 3 . . . ·(n − 1)· n.
Por exemplo, se n = 6, então 6! = 1 · 2 · 3 · 4 · 5 · 6 = 720.

'''

n = int(input("Digite um inteiro positivo: "))

if n > 0:
    i = 1
    while i <= n:
        n = n * i
        i += 1
    print(n)
else:
    print("Número inválido.")