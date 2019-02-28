# Command Pattern Design
# By Aaron Zepeda


Command es un patrón de diseño que permite convertir una petición en un objeto que contiene toda la información de la petición. Esta información nos permite parametrizar métodos con diferentes peticiones, retrasar o poner en una pila la ejecución de una petición, y soportar la anulación de operaciones

En lugar de tener 3 implementaciones desde una GUI pasamos a tener solo una

![alt text](https://refactoring.guru/images/patterns/diagrams/command/solution1-en.png)

![alt text](https://refactoring.guru/images/patterns/diagrams/command/solution2-en.png)



Con tal de que tengamos diferentes acciones conectadas a una sola interface la cual sea capaz de ejecutar los métodos que realicen las diferentes acciones

![alt text](https://refactoring.guru/images/patterns/diagrams/command/solution3.png)

AL momento de la implementacion se tiene el siguiente diagrama:

![alt text](https://refactoring.guru/images/patterns/diagrams/command/structure.png)

### Invoker (Sender)

El invoker es el responsable de inicializar los requests, esta clase debe tener la capacidad de mantener una referencia a los objetos commands, esto con un tipo de estructura como una pila, fila o lista. El sender dispara el command en lugar de mandarlo directamente al receiver

### Interface Command

Usualmente declara un solo método para ejecutar el comando

### Commands 1, 2, 3, etc

Son las implementaciones concretas de la interface command, no están supuestas para hacer el trabajo por sí solas, sino mandar la llamada a los objetos de lógica de negocio, estas clases pueden ser unidas con el propósito de simplificación

### Receiver

Esta clase contiene la lógica de negocio. Casi cualquier objeto puede actuar como receiver. Los commands solo manejan los detalles de como una peticion se manda al receiver mientras que el receiver hace todo el trabajo.

### Client

El cliente crea y configura los objetos command concretos. Debe mandar todos los parámetros incluyendo una instancia del receiver hacia el constructor del command. Después de eso el command será asociado con uno de los múltiples senders.