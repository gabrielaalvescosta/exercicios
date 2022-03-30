distancia_m = int(input('A distância em metros: '))
tempo_s = float(input('O tempo em segundos: '))

distancia_km = distancia_m * 3,6
tempo_h = tempo_s / 60

velocidade_ms = distancia_m / tempo_s 
velocidade_kh = distancia_km / tempo_h

print('A velocidade é de: ' + str(velocidade_ms) + 'metros por segundo e de ' + str(velocidade_kh) + ' quilômetros por hora.')