#armazena os dias da semana com 0 votos para cada um
semana = {"segunda-feira": 0, "terça-feira": 0, "quarta-feira": 0, "quinta-feira": 0, "sexta-feira": 0}

#passa por cada item de semana solicitando e atribuindo o valor do input à key(dia)
for dia in semana:
    votos = int(input("Quantos votos {} recebeu? ".format(dia)))
    semana[dia] = votos

#busca a key(dia) com maior valor(votos) em semana
vencedor = max(semana, key=semana.get)

#printa a key(dia) e o valor(votos) identificados em vencedor
print("As lives acontecerão toda {} com {} votos!".format(vencedor, semana[vencedor]))
