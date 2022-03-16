import random
vector = [];pares = [];posiciones=[]
for i in range(0, 20):
    vector.append(random.randint(1, 100))
    if vector[i] % 2 == 0:
        pares.append(vector[i])
        posiciones.append(i)
print(vector)
print('Los pares son: ',pares)
print('Las posiciones son: ',posiciones)