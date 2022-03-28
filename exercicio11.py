salario = int(input('Salário antes: '))
salario_aumentado = int(input('Salário atual: '))

aumento = salario_aumentado - salario
porcentagem = aumento * 0.1

print('A porcentagem de aumento é igual a: ' + str(porcentagem))