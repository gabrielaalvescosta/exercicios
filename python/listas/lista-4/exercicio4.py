'''
Dados n um inteiro positivo e uma sequência de n números reais, escreva um algoritmo que
conta e imprime a quantidade de números positivos e a quantidade de números negativos

'''




i = 0
numero = int(input("Digite um numero inteiro positivo: "))

if numero > 0:

    positivos = 0
    negativos = 0    
    
    while i < numero:
        sequencia = int(input("Digite uma sequencia de " + str(numero) + " números reais: "))
        i += 1
        if sequencia >= 0:
            positivos += 1
        else:
            negativos += 1 
else:
    numero = int(input("Digite um numero POSITIVOOOOOOOOOOOOO: "))

print("A quantidade de números positivos é de " + str(positivos) + " e a quantidade de números negativos é de " + str(negativos))
