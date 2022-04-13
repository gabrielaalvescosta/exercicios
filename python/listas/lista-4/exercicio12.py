'''
Se Fn é o enésimo número da sequência de Fibonacci, podemos calculá-la através da seguinte
fórmula de recorrência.

Escreva um algoritmo que dado n, calcula o enésimo número da sequência de Fibonacci
'''

n = int(input("Digite um número: "))
a, b = 0, 1

while a < n:
    print(a)
    a, b = b, a + b