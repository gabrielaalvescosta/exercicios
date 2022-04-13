'''
Vamos escrever um programa que consiste em um Jogo de Adivinhação. O jogo funciona do
seguinte mo do: sorteia-se um número inteiro aleatório entre 1 e 1000. Sua tarefa é tentar
adivinhar o número sorteado através de "chutes". A cada chute o programa deverá informar
se o número "sorteado"é maior, menor ou igual ao número "chutado". Quando o usuário
acertar o número deverá ser impresso uma mensagem dizendo que ele acertou e a quantidade
de chutes dados. Para gerar números aleatórios entre 1 e 1000 use as seguintes instruções
dentro do seu programa Python.

'''

import random

numero = int(input("Digite um número: "))
advinhacao = random.randint(1,1001)
chutes = 0

if numero >= 1 and numero <= 1000:
    while numero != advinhacao or chutes == 0:
        if advinhacao == numero:
            print("Você ACERTOU! Seu número de chutes foi igual a " + str(chutes))
        elif advinhacao > numero:
            print("Você chutou acima do valor.")
        elif advinhacao < numero:
            print("Você chutou abaixo do valor.")
        chutes = chutes + 1