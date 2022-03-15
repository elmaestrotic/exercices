Algoritmo Array
	Dimension vector[10]
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		vector[i]=Aleatorio(1,100)
		Escribir vector[i],"|" Sin Saltar
	Fin Para
	Escribir ""
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		si (vector[i] MOD 2 ==0) Entonces
			Escribir vector[i], " Pos: ",i
		FinSi
	Fin Para
FinAlgoritmo