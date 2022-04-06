minutos = int(input("Digite os minutos do seu computador:  "))

#subtrai 1 para o calculo fatorial
fatorial = minutos - 1

#confere a entrada. 0 até 59 = ok
if(minutos > 59 or minutos < 0):
    print("Digite um número válido para gerar a senha!")
    exit()

#multiplica os minutos pelo valor armazenado em fatorial -1, enquanto fatorial for > 1
else:    
    while fatorial > 1:
        minutos = minutos * fatorial
        fatorial -= 1

#exibe a senha
print("A senha é: LIBERDADE{}".format(minutos))
