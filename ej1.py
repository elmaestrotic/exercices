import random
lista=[]
suma= 0
for i in range(0,10):
    lista.append(random.randint(1, 100))
    suma+=lista[i]
print(lista)
promedio= suma/10
print('La suma es: ', suma)
print('El promedio  es: ',promedio)