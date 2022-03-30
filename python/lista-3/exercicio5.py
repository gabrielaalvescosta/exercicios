dias_uteis = 20
salario = int(input('Salário: ')
horas_trabalhadas = int(input('Horas trabalhadas: '))
salario_por_hora = int(input('Salário por hora: '))
hora_extra = (salario * 1.5) * horas_trabalhadas

if (horas_trabalhadas > 0):
    salario_final = salario + hora_extra
    print('O salário final é igual a R$ ' + salario_final)
 else:
    salario_final = salario
    print('O salário final é igual a R$ ' + salario_final)
