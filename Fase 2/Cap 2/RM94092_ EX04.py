#armazena os minutos
minutos = int(input("Digite os minutos do seu computador:  "))

#armazena o valor dos minutos e já subtrai 1 para o calculo dentro do loop
fatorial = minutos - 1

#multiplica os minutos pelo seu valor armazenado em fatorial -1, enquanto fatorial for > 1
while fatorial > 1:
    minutos = minutos * fatorial
    fatorial -= 1

#exibe a senha
print("A senha é LIBERDADE{}".format(minutos))
