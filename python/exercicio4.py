from math import remainder
from operator import mul


num1 = int(input('First number:'))
num2 = int(input('Second number:'))

sum = num1 + num2
multiply = num1 * num2
division = num1 / num2
remain = num1 % num2

print('A soma é: ' + str(sum))
print('A multiplicação é: ' + str(multiply))
print('A divisão inteira é: ' + str(division))
print('O resto da divisão inteira é: ' + str(remain))
