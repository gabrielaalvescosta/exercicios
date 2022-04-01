age = int(input('Idade: '))

if age < 5:
    print('Não existe categoria para esta idade.')
elif age <= 7:
    print('Categoria Infantil')
elif age <= 10:
    print('Categoria Juvenil')
elif age <= 15:
    print('Categoria Adolescente')
elif age <= 30:
    print('Categoria Adulta')
elif age > 30:
    print('Categoria Senior')