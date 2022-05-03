print("**************************************************************************")
print("*  Bem vindo ao Fiap, ranking oficial de violações e vazamento de dados  *")
print("*       Menor pontuação indica mais dados relevantes comprometidos.      *")
print("*         Cada dado tem um peso, 22 para senha, e 5 para o email         *")
print("**************************************************************************\n")

#armazena o nome da empresa no indice [0] e os dados vazados a partir do indice [0]
emp1 = ["Adobe", 2013, "email", "senha", "ajudaSenha", "usuario"]
emp2 = ["Avast", 2014 , "email", "senha", "usuario"]
emp3 = ["BitTorrent", 2016, "email", "IP", "senha", "usuario"]
emp4 = ["Club Penguin Rewritten", 2019, "email", "IP", "senha", "usuario"]
emp5 = ["Dropbox", 2012, "email", "senha"]
emp6 = ["Epic Games", 2016, "email", "senha", "usuario"]
emp7 = ["Gravatar", 2020, "email", "nome", "usuario"]
emp8 = ["League of Legends", 2012, "email", "senha", "usuario"]
emp9 = ["Nexus Mods", 2016, "email", "senha", "usuario"]
emp10 = ["NVIDIA", 2022, "email", "senha"]


#armazena a lista de empresas em uma nova lista
empresas = [emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10]

#armazena os dados empresa+score retornados pela funcao
armazena_score = []

def calcula_score(nome_empresa):
    data = empresa[1]
    score = 100
    armazena = []
    for dado in nome_empresa[1:]: #loop a partir do index 1 até o final, excluindo o nome da empresa/ano do vazamento
        if dado == "senha":
            score = score - 20
        elif dado == "IP":
            score = score - 17
        elif dado == "ajudaSenha":
            score = score - 15
        elif dado == "usuario":
            score = score - 10
        elif dado == "telefone":
            score = score - 8
        elif dado == "nome":
            score = score - 6
        elif dado == "email":
            score = score - 4

        #reduz score de acordo com o ano
        else:
            if data >= 2022:
                score = score - 20
            elif data >= 2020:
                score = score - 18
            elif data >= 2018:
                score = score - 16
            elif data >= 2016:
                score = score - 14
            elif data >= 2014:
                score = score - 12
            elif data >= 2012:
                score = score - 10
            elif data >= 2010:
                score = score - 8
            else:
                score = score - 5

    #append no nome da empresa e no score gerado pela funcao em uma lista temporaria
    armazena.append(nome_empresa[0])
    armazena.append(score)

    #append dos dados da lista temporaria pra lista definiva
    armazena_score.append(armazena)

#reproduz a funcao ate a ultima empresa
for empresa in empresas:
    calcula_score(empresa)

#sort e lamba feitos manualmente
for i in range(0,len(armazena_score)): #quantidade de iteracoes = numero de itens da lista
    for j in range(0,len(armazena_score)-i-1):
        if(armazena_score[j][1]>armazena_score[j+1][1]):
            substitui=armazena_score[j]
            armazena_score[j]=armazena_score[j+1]
            armazena_score[j+1]=substitui

#printa o rank com nome/posicao/score
for item in armazena_score:
    print("{} - ficou em {}º com {} pontos.".format(item[0], armazena_score.index(item) + 1, item[1]))
