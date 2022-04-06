seg = int(input("Quantos votos Segunda-feira recebeu?  "))
ter = int(input("Quantos votos Terça-feira recebeu?  "))
qua = int(input("Quantos votos Quarta-feira recebeu?  "))
qui = int(input("Quantos votos Quinta-feira recebeu?  "))
sex = int(input("Quantos votos Sexta-feira recebeu?  "))

#compara todos os valores
if(seg > ter and seg > qua and seg > qui and seg > sex):
    print("As lives acontecerão na Segunda-Feira, com {} votos!".format(seg))

elif(ter > seg and ter > qua and ter > qui and ter > sex):
    print("As lives acontecerão na Terça-Feira, com {} votos!".format(ter))

elif(qua > seg and qua > ter and qua > qui and qua > sex):
    print("As lives acontecerão na Quarta-Feira, com {} votos!".format(qua))

elif(qui > seg and qui > ter and qui > qua and qui > sex):
    print("As lives acontecerão na Quinta-Feira, com {} votos!".format(qui))

elif(sex > seg and sex > ter and sex > qua and sex > qui):
    print("As lives acontecerão na Sexta-Feira, com {} votos!".format(sex))

else:
    print("houve empate, votem novamente!")


#Solução usando dicionário

##armazena os dias da semana com 0 votos em cada
#semana = {"segunda-feira": 0, "terça-feira": 0, "quarta-feira": 0, "quinta-feira": 0, "sexta-feira": 0}

##passa por cada dia solicitando e atribuindo o valor do input
#for dia in semana:
#    votos = int(input("Quantos votos {} recebeu? ".format(dia)))
#    semana[dia] = votos

##busca o dia com maior valor(votos) em semana
#vencedor = max(semana, key=semana.get)

##printa a key(dia) e o valor(votos) identificados em vencedor
#print("As lives acontecerão toda {} com {} votos!".format(vencedor, semana[vencedor]))
