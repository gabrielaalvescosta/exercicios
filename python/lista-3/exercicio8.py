age = int(input('Idade: '))

if age <= 7:
    print('Categoria Infantil')
elif age >= 8 and age <= 10:
    print('Categoria Juvenil')
elif age >= 11 and age <= 15:
    print('Categoria Adolescente')
elif age >= 16 and age <= 30:
    print('Categoria Adulta')
elif age > 30:
    print('Categoria Senior')