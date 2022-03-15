Funcion result <- esPrimo ( valor )
	result =valor
	Para i<-2 Hasta valor-1 Con Paso 1 Hacer
		Si (valor MOD i ==0) Entonces
			result=0
		FinSi
	Fin Para
Fin Funcion

Algoritmo primos2
	Dimension vector[10]
	cont =0
	Mientras cont<=10 Hacer
		result=Aleatorio(1,100)
		result = esPrimo(result)
		si(result <> 0) Entonces
			vector[i]= result
		fin si
		Escribir vector[i],"|" Sin Saltar
	Fin Mientras
	
	
	Escribir ""
	Escribir "Los primos son:"
	

FinAlgoritmo
