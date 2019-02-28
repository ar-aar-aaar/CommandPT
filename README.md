# Command Pattern Design
# By Aaron Zepeda


Command es un patrón de diseño que permite convertir una petición en un objeto que contiene toda la información de la petición.

Se hace una interface así:


### Interface ICommand
    public class ICommand {
        public boolean Command(Dinero cantidad);
    }

Dicha interfaz será implementada por clases que ejecuten acciones diferentes dentro de nuestro sistema

### Hijos de interface ICommand
    public class Action1 implements ICommand{
        public boolean Command(Action action){

        }

    }

    public class Action2 implements ICommand{
        public boolean Command (Action action){

        }
    }

Debemos tener una clase que actue como una pila de las acciones ICommand


### Clase CommandHistory
    public class CommandHistory{
        private Stack<ICommand> history = new Stack();

        public void push(ICommand c) {
            history.push(c);
        }

        public ICommand pop() {
            return history.pop();
        }

        public boolean isEmpty() { return history.isEmpty(); }
    }

Para la implementacion al ejecutar comandos se deben pushear dentro de la pila, para el momento en que se deshaga la accion se popeen y se haga la debida implementacion para deshacer la accion.


