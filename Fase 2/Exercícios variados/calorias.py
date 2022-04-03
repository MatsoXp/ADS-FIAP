#quantidade de alimentos
totalAlimentos = int(input("Digite quantos alimentos você consumiu:  "))

#inicia o alimento de 1 até o valor inserido em total alimentos
alimentoContador = 1

#calorias consumidas
calorias = 0

#enquanto alimentocontador for diferente de totalalimentos, continua executando
while alimentoContador <= totalAlimentos:
    calorias = calorias + int(input("Quantas calorias tem o alimento {}:  ".format(alimentoContador)))
    alimentoContador += 1

print(calorias)
