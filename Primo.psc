Funcion resul <- isPrime ( n )
	resul="Es Primo"
	Para i<-2 Hasta n-1 Con Paso 1 Hacer
			Si (n MOD i=0) Entonces
			resul="No es Primo"
		Fin Si
	Fin Para
	
Fin Funcion

Algoritmo Primo
	Definir n Como Entero
	Escribir "Ingrese un número entero: "
	Leer n
	Escribir isPrime(n)
FinAlgoritmo
