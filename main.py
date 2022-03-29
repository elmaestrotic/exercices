import random

lista = []
repetidos = []

def generarlista():
    for i in range(0, 20):
        lista.append(random.randint(1, 100))
    print(lista)


def hallarRepetidos():
    print('Se mostraran los valores repetidos en la lista')
    veces = 0
    for i in lista:
        veces = lista.count(i)
        if veces > 1 and i not in repetidos:
            repetidos.append(i)
    print(repetidos)


def hallarPares():
    print('Se mostraran los valores pares y sus posiciones')
    index = 0
    for i in lista:
        if i % 2 == 0:
            print(i, '| Pos: ', index)
        index += 1


def hallarParesenPosImpares():
    print('Se mostraran los valores pares en posiciones impares')
    index = 0
    for i in range(1, 20, 2):
        if lista[i] % 2 == 0:
            print(lista[i], '| Pos: ', i)
        index += 1


def isPrime(valor):
    if valor > 1:
        for i in range(2, valor):
            if valor % i == 0:
                return 0
                break
        return valor
    else:
        return 0


def findPrimes():
    print('Número primos en la lista: ')
    primo = 0
    for i in lista:
        primo = isPrime(i)
        if primo != 0:
            print(i)


if __name__ == '__main__':
    generarlista()
    hallarRepetidos()
    hallarPares()
    hallarParesenPosImpares()
    findPrimes()
