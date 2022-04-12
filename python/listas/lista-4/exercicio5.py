'''

Escreva um algoritmo que, dados um número inteiro positivo n, imprime na tela a contagem
de to dos os divisores positivos de n.

'''

n = int(input("Digite um número inteiro positivo: "))
i = 1

if n > 0:
    while i <= n:
        if n % i == 0:
            print("O número " + str(i) + " é um divisor positivo de " + str(n))
        i += 1