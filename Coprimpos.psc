Algoritmo Ejerciciop
	Dimension vector[10]
	Dimension vector2[10]
	
	cont =0
	cont2=0
	Mientras cont<=10 Hacer
		result=Aleatorio(1,100)
		result = esPrimo(result)
		si(result <> 0) Entonces
			vector[i]= result
			cont=cont+1
		fin si
		Escribir vector[i],"|" Sin Saltar
	Fin Mientras
		
	Escribir ""
	Mientras cont2<=10 Hacer
		result=Aleatorio(1,100)
		result = esPrimo(result)
		si(result <> 0) Entonces
			vector2[i]= result
			cont2=cont2+1
		fin si
		Escribir vector2[i],"|" Sin Saltar
	Fin Mientras
fin algoritmo	

Funcion result <- esPrimo ( valor )
	result =valor
	Para i<-2 Hasta valor-1 Con Paso 1 Hacer
		Si (valor MOD i ==0) Entonces
			result=0
		FinSi
	Fin Para
Fin Funcion