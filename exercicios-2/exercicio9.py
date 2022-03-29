preco = int(input('Digite o preço do produto: '))
desconto = int(input('Porcentagem de desconto do produto: '))

desconto_reais = preco * desconto/100
final = preco - desconto_reais
print('O valor final do produto é: ' + str(final))