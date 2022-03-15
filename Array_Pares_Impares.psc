Algoritmo Array
	Dimension vector[20]
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		vector[i]=Aleatorio(1,100)
		Escribir vector[i],"|" Sin Saltar
	Fin Para
	Escribir ""
	Para i<-1 Hasta 19 Con Paso 2 Hacer
		si (vector[i] MOD 2 ==0) Entonces
			Escribir vector[i], " Pos: ",i
		FinSi
	Fin Para
FinAlgoritmo