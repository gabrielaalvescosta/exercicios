ano = int(input('Digite um ano: '))

if (ano % 4 == 0) and (ano % 100 != 0) or (ano % 400 == 0):
    print('O ano de ' + str(ano) + ' é bissexto.')
else:
    print('Este ano não é bissexto.') 