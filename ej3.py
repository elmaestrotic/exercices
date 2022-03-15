import random
lista=[]
def isPrime(valor):
    for i in range(2,valor):
        if (valor % i ==0):
            return False
            break
    return True
#mostrar sólo los primos
for i in range(0,10):
    lista.append(random.randint(1, 100))
print(lista)
print('Los primos en la lista son:')
for i in lista:
    if (isPrime(i)):
        print(i,end='|')
