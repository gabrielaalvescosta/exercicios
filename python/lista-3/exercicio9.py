numa = float(input("Digite um nº: "))
numb = float(input("Digite outro nº: "))
op = input("Operador (+-*/): ")

if op == "+":
    print("resultado: ", numa + numb)
elif op == '-':
    print("resultado: ", numa - numb)
elif op == '*':
    print("resultado: ", numa * numb)
elif op == "/":
    if numb != 0:
        print("resultado: ", numa / numb)
    else:
        print("Não é possível fazer divisão por zero.")
else:
    print("Operador inválido! Escolha entre (+*/-)")    

