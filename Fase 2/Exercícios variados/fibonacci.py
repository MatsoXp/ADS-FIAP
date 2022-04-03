#pede um numero ao usuario
n = int(input("digite um numero:  "))

n1 = 1
n2 = 1
soma = 0

#confere se o valor de n é fibonacci antes de entrar no loop
if n == 0 or n == 1:
    print("É um numero fibonacci!!!")

#se o valor inicial não for 0 nem 1, calcula o valor fibonacci até ser maio que N
else:
    while(soma < n):
        soma = n1 + n2
        n1 = n2
        n2 = soma
    if(soma == n):
        print("É um numero fibonacci!!!")
    else:
        print("Não é...")
