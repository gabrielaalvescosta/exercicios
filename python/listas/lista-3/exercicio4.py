time1 = int(input('Quantos gols fez o primeiro time: '))
time2 = int(input('Quantos gols fez o segundo time: '))

if (time1 > time2):
    print('TIME 1: VENCEDOR!')
elif (time2 > time1):
    print('TIME 2: VENCEDOR!')
else:
    print('EMPATE!')