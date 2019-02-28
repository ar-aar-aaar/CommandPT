# Command Pattern Design
# By Aaron Zepeda


Command es un patrón de diseño que permite convertir una petición en un objeto que contiene toda la información de la petición. Esta información nos permite parametrizar métodos con diferentes peticiones, retrasar o poner en una pila la ejecución de una petición, y soportar la anulación de operaciones

En lugar de tener 3 implementaciones desde una GUI pasamos a tener solo una

https://refactoring.guru/images/patterns/diagrams/command/solution1-en.png

https://refactoring.guru/images/patterns/diagrams/command/solution2-en.png


Con tal de que 

![alt text](https://refactoring.guru/images/patterns/diagrams/command/solution3.png)






Para la implementacion al ejecutar comandos se deben pushear dentro de la pila, para el momento en que se deshaga la accion se popeen y se haga la debida implementacion para deshacer la accion.

![alt text](https://refactoring.guru/images/patterns/diagrams/command/structure.png)

