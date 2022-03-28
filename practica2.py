import random
lista=[]
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

