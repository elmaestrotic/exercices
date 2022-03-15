import random
lista=[]
for i in range(0,20):
    lista.append(random.randint(1, 100))

print(lista)
#mostrar impares de posiciones pares
for i in range(0,20,2):
    if lista[i] % 2 !=0:
        print(lista[i], end='|')