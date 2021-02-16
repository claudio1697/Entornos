#DEPURACION 3
### 1.-¿Que hace el metodo main?
	-El metodo main, crea la variable de tipo int(numero entero) con el nombre num y otras tres variables
		con el nombre de c, i e enc.
	- Despues crea un escanner con el nombre sc, y finalmente hace una llamada a la clase cosa con el tamaño de 
		kMAX que sale al principio del proyecto con valor de 10 y se le nombra,lista. 
		
### 2.-	¿Que realiza la a partir de la linea 26?
	- Primero tenemos un while, que pide que se repita todo el proceso una y otra vez hasta que la i valga lo mismo que kmax
	- Despues lo que realiza es pedir un numero, almacenando el numero que digas en la variable num, en este caso 1.
	- Despues a enc que vale 0,se iguala a esta, y se comprueba si es menor que c.
	- Pero c = 0 y enc = 0, por lo que en el array lista en la posicion c, es decir posicion 0, se añade el valor de num, y luego c llega a valer 1. Luego le sumamos uno a la i.
	- Luego volvemos a repetir la funcion, si esta vez introducimos otro 1, ahora se compara enc = 0 con c = 1, y al ser menor, se añade valor de num a la b, y tenemos ya dos 1.
	- Este proceso se repetira una y otra vez, si se introduce el 1, el enc siempre sera menor que la c y se sumara 1 en la b indicando cuantos numeros iguales hay que valgan lo mismo, si se introducen 10 1, la a valdra 1, y la b 10 que son los unos que hay.

### 3.- ¿ A que hace referencia a y b en la clase cosa?
	- Pues la a hace referencia al valor introducido en la posicion del array, y en la b hace referencia la cantidad de numeros iguales al a que hay.