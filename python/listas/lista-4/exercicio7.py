'''
A conversão de graus Fahrenheit para centígrados é obtida pela fórmula C = 5 / 9 (F − 32).
Escreva um algoritmo que calcule e escreva uma tabela de graus centígrados em função de
graus Fahrenheit que variem de 50 a 150 Fahrenheit de 1 em 1.

'''

farenheit = 50

while farenheit <= 150:
    celsius = (farenheit - 32) / 1.8
    print("Temperatura em celsius para " + str(farenheit) + " celsius " + str(celsius))
    farenheit += 1