nac = float(input('Nota NAC: '))
am = float(input('Nota AM: '))
ps = float(input('Nota PS: '))

nota_final = (nac * 3) + (am * 2) + (ps * 5)
media = nota_final / 10

print('Média igual a: ' + str(media))