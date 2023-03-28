#quantidade de transações
totalTransacoes = int(input("Quantas transações?:  "))

#inicia o contador de transacoes em 1 até o valor de totalTransacoes
contaTransacao = 1

#armazena a soma dos valores de valorTransacao
valorTotal = 0

#pede um valor enquanto não chegar no numero de totalTransacoes
while contaTransacao <= totalTransacoes:
    valorTransacao = float(input("Qual o valor da transação {}:  ".format(contaTransacao)))
    valorTotal = valorTotal + valorTransacao
    contaTransacao += 1

#calcula o valor medio de cada transacao
mediaGasto = valorTotal / totalTransacoes

print("O valor total gasto é de {} reais. A média por transação é de {} reais.".format(valorTotal, mediaGasto))