import random
lista=[]
def isPrime(valor):
    for i in range(2,valor):
        if (valor % i ==0):
            return 0
            break
    return valor


#vamos a añadir a la lista solo los primos
tempo=0
while len(lista)<10:
    tempo=isPrime(random.randint(1, 100))
    if tempo !=0:
     lista.append(tempo)

#mostrar la lista
print(lista)