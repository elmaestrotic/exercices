import random
lista=[]
repetidos = []

def hallarRepetidos():
    print('Se mostraran los valores repetidos en la lista')
    veces = 0
    for i in lista:
        veces = lista.count(i)
        if veces > 1 and i not in repetidos:
            repetidos.append(i)
    print(repetidos)


def isPrime(valor):
    for i in range(2, valor):
        if valor % i == 0:
            return 0
            break
    return valor

primo=0
while  len(lista) <=20:
    primo = isPrime(random.randint(2, 100))
    if primo != 0:
        lista.append(primo)
print(lista)
hallarRepetidos()





