dias_uteis = 22
salario = float(input('Salário: '))
horas_trabalhadas = float(input('Horas extras trabalhadas: ')) # horas extras trabalhadas
salario_por_hora = float(input('Salário por hora: '))
hora_extra = (salario * 0.5) * horas_trabalhadas

if (horas_trabalhadas > 0):
   salario_final = salario + hora_extra
   print('O salário final é igual a R$ ' + str(salario_final))
else:
   salario_final = salario
   print('O salário final é igual a R$ ' + str(salario_final))
