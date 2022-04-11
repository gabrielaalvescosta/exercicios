'''
Dada uma sequência de números inteiros onde o último elemento é o 0, escreva um algoritmo
que calcula a soma dos números pares da sequência.


Progressão aritmética de razão (-2):

a(n) = a(1) - (n - 1) * r
a(n) = a(1) - (n - 1) * (-2)

S(n) = (a1 + an) * n / 2

'''


numero = int(input("Digite o valor de n: ")) # 11
i = 0

while numero <= i:
    
    if numero % 2 != 0:
        numero = numero - 1

    print(i)
    i -= 2
    
    
