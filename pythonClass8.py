#O programa recebe 4 entradas (carro) depois 4 entradas (consumo) e depois escolhe o carro com menor consumo

carro = []
custo = []


def entrada_carro ():
    for i in range(4):
        car = input()
        carro.append(car)

def entrada_consumo():
    for i in range(4):
        cost = int((input()))
        custo.append(cost)

def economico():
    menor = min(custo)
    if custo[0] == menor:
        return(carro[0])

    elif custo[1] == menor:
        return(carro[1])

    elif custo[2] == menor:
        return(carro[2])

    elif custo[3] == menor:
        return(carro[3])


def main():
    entrada_carro()
    entrada_consumo()
    print(economico())

main()
