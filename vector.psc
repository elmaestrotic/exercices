Funcion resul <- esPrimo (valor  )
	result = verdadero
	Para i=2 Hasta valor-1 Con Paso 1 Hacer
		Si (valor MOD i ==0) Entonces
			resul= falso
		Fin Si
	fin para
	
Fin Funcion

Funcion  llenarVector ( valores )
Para i=0 Hasta 9 Con Paso 1 Hacer
		valores[i]= Aleatorio(0,100)
		Escribir valores[i], "|" Sin Saltar
	fin para
Fin Funcion


Algoritmo vector
	Definir resul Como Logico
	Dimension valores[10]
	llenarVector(valores)
	Escribir ""
	Escribir "Los primos son: "
	Para i=0 Hasta 9 Con Paso 1 Hacer
		si (esPrimo(valores[i]) = Verdadero) Entonces
			Escribir valores[i],"|" Sin Saltar
		FinSi
		 
	fin para
fin algoritmo	
	
	
	