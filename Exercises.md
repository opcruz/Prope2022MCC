# **EJERCICIOS 5 - 9**
5. Utilizando dos clases, escribir un programa que capture en un arreglo de 10 elementos enteros, luego recorra el arreglo e indique si el elemento es un número primo o no, imprimiendo también la casilla en la que se encuentra ese número primo. Recordando que un número entero es primo si es divisible sólo por la unidad y por sí mismo.

6. Elaborar un programa que lea una cadena de hasta 10 caracteres que represente un número romano e imprima el formato de ese número y su equivalente en numeración arábiga; los caracteres romanos y sus equivalentes son:

| Letra | Valor |
| - | - |
|I|1|
|V|5|
|X|10|
|L|50|
|C|100|
|D|500|
|M|1000|

``Ejemplo: LXXXVI (86)``

7. Se desea conocer de un texto capturado por teclado, cuántas vocales, consonantes y dígitos se tienen. Realizar el programa correspondiente.

8. Investigar el método random de la clase Math de Java para poderlo aplicar. El programa estará dividido en dos opciones: 
- **Contra la computadora:** el programa debe obtener un número al azar entre 0 y 100. Una vez que lo tenga el usuario debe de "adivinar" este número por lo que el usuario dará un número (validar que sea número) y el programa le dirá si es mayor o menor, ejemplo:
```
Adivine el número.
Intento 1: 32
Es mayor que 32
Intento 2: 80
Es menor que 80
Intento 3: 70
Es mayor que 70
Intento 4: 72
Correcto. Adivinaste en 4 intentos.
```

- **El programa adivina:** en este caso, el usuario pensará un número, y sin hacer trampa, el programa adivinará el número. Cada vez que el programa haga un intento, el usuario debe ingresar <, > o =, dependiendo si el intento es menor, mayor o correcto. La estrategia que debe seguir el programa es recordar siempre cuáles son el menor y el mayor valor posibles, y siempre probar con el valor que está en la mitad. Por ejemplo, si usted piensa el número 82, y no hace trampa al jugar, la ejecución del programa se verá así:
```
Intento 1: 50
>
Intento 2: 75
>
Intento 3: 88
<
Intento 4: 81
>
Intento 5: 84
<
Intento 6: 82
=
Adiviné en 6 intentos B-)
```

9. Escribir un programa que encuentre dos cadenas introducidas por teclado que sean anagramas. Se considera que dos cadenas son anagramas si contienen exactamente los mismos caracteres, ya sea en el mismo o en diferente orden; ignorar los blancos y considerar que mayúsculas y minúsculas son iguales.

 - Por ejemplo: “esponja” y “japones” poseen las mismas letras pero en diferente orden. 
