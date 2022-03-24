import random

lista=[]
def isPrime(valor):
    for i in range(2, valor):
        if valor % i == 0:
            return 0
            break
    return valor

primo=0
cprimos=0
while  cprimos <=20:
    primo = isPrime(random.randint(1, 100))
    if primo != 0:
        lista.append(primo)
        cprimos+=1
print(lista)

