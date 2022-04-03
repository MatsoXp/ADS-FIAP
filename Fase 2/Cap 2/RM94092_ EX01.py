#informa assinaturas disponiveis
print("Assinaturas disponíveis:\n")
print("Basic")
print("Silver")
print("Gold")
print("Platinum\n")

#armazena o tipo de assinatura e o valor do faturamento
assinatura = input("Digite o nome da assinatura:  ").lower()
faturamento = float(input("Digite o faturamento anual:  "))

#calcula o bonus de acordo com o tipo de assinatura
def calculaBonus(x, y):
    if assinatura == "basic":
        bonus = faturamento * 0.3
    
    elif assinatura == "silver":
        bonus = faturamento * 0.2
    
    elif assinatura == "gold":
        bonus = faturamento * 0.1

    elif assinatura == "platinum":
        bonus = faturamento * 0.05

    else:
        print("Digite uma assinatura válida!")
        exit()

    return bonus

#chama calculaBonus e passa os valores de assinatura e faturamento. printa o retorno. 
print("O cliente deve pagar {} reais de bônus".format(calculaBonus(assinatura, faturamento)))
