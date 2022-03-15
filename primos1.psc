Funcion result <- esPrimo ( valor )
	result =valor
	Para i<-2 Hasta valor-1 Con Paso 1 Hacer
		Si (valor MOD i ==0) Entonces
			result=0
		FinSi
	Fin Para
Fin Funcion

Algoritmo primos1
	Dimension vector[20]
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		vector[i]=Aleatorio(1,100)
		Escribir vector[i],"|" Sin Saltar
	Fin Para
	Escribir ""
	Escribir "Los primos son:"
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		result = esPrimo(vector[i])
		si(result <> 0) Entonces
			Escribir result,"|" Sin Saltar
		fin si
	Fin Para
FinAlgoritmo
