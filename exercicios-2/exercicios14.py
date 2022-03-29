valor_avista = int(input('Valor: '))
parcelas = int(input('Informe o número de parcelas: '))

valor_final = valor_avista / parcelas

if parcelas == 0: 
    print('O valor final é de ' + str(valor_avista))
else:
    print('O valor final é de ' + str(parcelas) + ' vezes de R$ ' + str(valor_final))