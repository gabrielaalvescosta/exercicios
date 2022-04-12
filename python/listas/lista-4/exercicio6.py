'''
Em uma prova de concurso com 70 questões haviam 20 pessoas concorrendo. Sabendo que
cada questão vale 1 ponto, escreva um algoritmo que lê a pontuação da prova obtida de cada
um dos candidatos e calcula:

a) a maior e a menor nota
b) o percentual de candidatos que acertaram até 20 questões, o percentual que acertaram
de 21 a 50 e o percentual que acertou acima de 50 questões

'''

candidatos = 20
questoes = 70
i = 1

# Contadores
acertos_20 = 0
acertos_50 = 0
acertos_70 = 0

while i <= candidatos:
    print("Candidato número " + str(i))
    acertos = int(input("Número de acertos do candidato: "))

    if acertos <= 20:
        acertos_20 += 1
        a20 = (acertos_20 / candidatos) * 100
        print("porcentagem de quem acertou até 20 questoes " + str(a20) + " por cento.")
    elif acertos <= 50: 
        acertos_50 += 1
        a50 = (acertos_50 / candidatos) * 100
        print("porcentagem de quem acertou até 50 questoes " + str(a50) + " por cento.")
    elif acertos <= 70: 
        acertos_70 += 1
        a70 = (acertos_70 / candidatos) * 100
        print("porcentagem de quem acertou até 70 questoes " + str(a70) + " por cento.")
    i += 1

