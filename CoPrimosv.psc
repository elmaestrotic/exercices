Funcion  printVector ( vector )
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir vector[i],"|" Sin Saltar
	Fin Para
Fin Funcion

Funcion result <- maxCD (a,b )
	Definir x,maximo Como Entero
	si a > 0 y b > 0 Entonces
		maximo = 1
		x = 1
		Mientras x <= a Hacer
			si a mod x == 0 y b mod x == 0 Entonces
				si x > maximo Entonces
					maximo = x
				FinSi
			FinSi
			x = x + 1
		FinMientras
		result=maximo
	SiNo
		Escribir "Debes ingresar numeros mayores a cero"
	FinSi	
	
Fin Funcion

Funcion result <- mcd ( a,b )
	si (b ==0 ) Entonces
		result <- 1;
		//result = a
	FinSi
	result = mcd(b, a MOD b);
Fin Funcion

Algoritmo MaxComDiv
	Definir salida Como Caracter
	Dimension vector1[10]
	Dimension vector2[10]
	Definir cumple Como Entero
	cumple=0
	salida=""
	Para i=0 Hasta 9 Con Paso 1 Hacer
		vector1[i] = Aleatorio(1,100)
		vector2[i] = Aleatorio(1,100)
		cumple=maxCD(vector1[i],vector2[i])
		si (cumple == 1 | cumple == -1) Entonces
			Escribir vector1[i] ,"|" Sin Saltar
			Escribir vector2[i] ,"|" 
		fin si	
	Fin Para
	printVector(vector1)
	Escribir ""
	printVector(vector2)
FinAlgoritmo
