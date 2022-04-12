'''
Dados um montante em dinheiro inicial d, uma taxa de juros mensal j e um período de
tempo em meses t, escreva um algoritmo que calcula o valor final em dinheiro se d ficar
aplicado a taxa de juros j durante t meses.

'''

d = float(input("Dinheiro inicial: "))
j = float(input("Taxa de juros mensal: "))
t = int(input("Tempo em meses: "))


valor_final = (d + d * j/100) * t
print("O valor final da quantia de R$" + str(d) + " é de R$" + str(valor_final) + " se for aplicado a uma taxa de " + str(j) + " por cento em " + str(t) + " meses." )