import random
suma=0
vector = []
for i in range(0,10):
    vector.append(random.randint(1,100))
    suma+=vector[i]
print(vector)
print('La suma es: ',suma)
prom=suma/len(vector)
print('El promedio  es: ',prom)