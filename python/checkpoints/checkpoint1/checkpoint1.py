'''
O calculo envolvendotempo(anos e meses) acaba acontecendo de forma recorrenteno desenvolvimento de sistemas.  Umtempopode ser definido como dois n ́umerosinteiros, um representando a quantidade de anos e outro representando a quantidadede meses, sendo que a quantidade de meses  ́e um inteiro entre 0 e 11).  Sua tarefa ́e  escrever  um  algoritmo  que  recebe  uma  medida  de  tempo  (anos  e  meses)  e  uminteirotrepresentando os meses e imprimir o novotempocalculado de acordo como inteirot.
'''

# Pegar os valores de anos e meses
anos = int(input("Digite o número de anos: "))
meses = int(input("Digite o número de meses: "))
t = int(input("Informe a quantidade de meses a incrementar ou diminuir: "))

# Transforma anos para meses
anos_para_meses = anos * 12 + meses + t


# Pega o resultado da divisao sobra e converte em anos
anos = anos_para_meses // 12

# Pega o resto da divisão e converte em anos
meses = anos_para_meses % 12

print("O resultado é de " + str(anos) + " e " + str(meses))