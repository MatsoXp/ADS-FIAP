print("*******************************************************************")
print("*                                                                 *")
print("*  Bem vindo ao Fiap, ranking  de violações e vazamento de dados  *")
print("*  Menor pontuação indica maior criticidade no rank               *")
print("*  O Score inicial são 100 pontos, cada dado tem um peso, sendo:  *")
print("*                                                                 *")
print("*  Senha: -20 pontos                     Telefone: -8 pontos      *")
print("*  IP: -17 pontos                        Nome: -6 pontos          *")
print("*  Ajuda da senha: -15 pontos            Email: -4 pontos         *")
print("*  Nome de Usuário: -10 pontos                                    *")
print("*                                                                 *")
print("********************************************************************\n")

emp1 = ["Adobe", 2013, "email", "senha", "ajudaSenha", "usuario"]
emp2 = ["Avast", 2014 , "email", "senha", "usuario"]
emp3 = ["BitTorrent", 2016, "email", "IP", "senha", "usuario"]
emp4 = ["Club Penguin Rewritten", 2019, "email", "IP", "senha", "usuario"]
emp5 = ["Dropbox", 2012, "email", "senha"]
emp6 = ["Epic Games", 2016, "email", "senha", "usuario"]
emp7 = ["Gravatar", 2020, "email", "nome", "usuario"]
emp8 = ["League of Legends", 2018, "email", "senha", "usuario"]
emp9 = ["Nexus Mods", 2013, "email", "senha", "usuario"]
emp10 = ["AbuseWith.Us", 2016, "email", "senha", "usuario"]
emp11 = ["Apollo", 2018, "email", "nome", "telefone"]
emp12 = ["Appen", 2020, "email", "senha", "nome", "telefone", "IP"]
emp13 = ["Armor Games", 2019, "email", "senha", "usuario", "IP"]
emp14 = ["Aternos", 2015, "email", "senha", "IP", "usuario"]
emp15 = ["Audi", 2019, "email", "nome", "telefone"]
emp16 = ["Badoo", 2013, "email", "senha", "usuario", "nome"]
emp17 = ["CafeMom", 2014, "email", "senha"]
emp18 = ["Catho", 2020, "email", "senha", "nome", "usuario"]
emp19 = ["CoinMarketCap", 2021, "email"]
emp20 = ["Dailymotion", 2016, "email", "senha", "usuario"]
emp21 = ["Clash of Kings", 2016, "email", "senha", "usuario", "IP"]
emp22 = ["CloudPets", 2017, "email", "senha", "nome"]
emp23 = ["Coachella", 2017, "email", "senha", "usuario", "IP"]
emp24 = ["Comcast", 2015, "email", "senha"]
emp25 = ["Cross Fire", 2016, "email", "senha", "usuario"]

empresas = [emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20, emp21, emp22, emp23, emp24, emp25]
armazena_score = []

def calcula_score(nome_empresa):
    data = empresa[1]
    score = 100
    armazena = []
    for dado in nome_empresa[1:]: 
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
        else:
            if data >= 2022:
                score = score - 20
            elif data == 2021:
                score = score - 19            
            elif data == 2020:
                score = score - 18
            elif data == 2019:
                score = score - 17
            elif data == 2018:
                score = score - 16
            elif data == 2017:
                score = score - 15
            elif data == 2016:
                score = score - 14
            elif data == 2015:
                score = score - 13
            elif data == 2014:
                score = score - 12
            elif data == 2013:
                score = score - 10
            elif data == 2012:
                score = score - 8
            elif data == 2011:
                score = score - 6
            elif data == 2010:
                score = score - 4
            else:
                score = score - 2

    armazena.append(nome_empresa[0])
    armazena.append(score)

    armazena_score.append(armazena)

for empresa in empresas:
    calcula_score(empresa)

for i in range(0,len(armazena_score)):
    for j in range(0,len(armazena_score)-i-1):
        if(armazena_score[j][1]>armazena_score[j+1][1]):
            substitui=armazena_score[j]
            armazena_score[j]=armazena_score[j+1]
            armazena_score[j+1]=substitui

for item in armazena_score:
    print("{}º - {} com {} pontos.".format(armazena_score.index(item) + 1, item[0], item[1]))
