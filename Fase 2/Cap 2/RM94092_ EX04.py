#armazena os minutos
minutos = int(input("Digite os minutos do seu computador:  "))

#armazena o valor dos minutos e já subtrai 1 para o calculo fatorial
fatorial = minutos - 1

#confere a entrada do usuario. 0 até 59 = ok
if(minutos > 59 or minutos < 0):
    print("Digite um número válido para gerar a senha!")
    exit()

#multiplica os minutos pelo seu valor armazenado em fatorial -1, enquanto fatorial for > 1
else:    
    while fatorial > 1:
        minutos = minutos * fatorial
        fatorial -= 1

#exibe a senha
print("A senha é: LIBERDADE{}".format(minutos))
