# Command Pattern Design
# By Aaron Zepeda


Command es un patrón de diseño que permite convertir una petición en un objeto que contiene toda la información de la petición.

Se hace una interface así:


### Interface ICommand
public class ICommand {
    public boolean Command(Dinero cantidad);
    public 
}

Dicha interfaz será implementada por clases que ejecuten acciones diferentes dentro de nuestro sistema

### Hijos de interface ICommand
public class retiroDinero extends ICommand{
    public boolean Command(Dinero cantidad){

    }

}

public class depositoDinero implements ICommand{
    public boolean Command (Dinero cantidad){

    }
}

public class deshacerTransaccion implements ICommand{
    public boolean Command (Dinero cantidad){

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

Para la implementacion podemos tener algo así, para este ejemplo se harán 3 depositos, 1 deshacer transaccion y 2 retiros

public class Dinero {
    int cantidad;
}

public class Implement{

    public Dinero salarioInicial=5000;
    private CommandHistory history = new CommandHistory();
    public static void main(){
        
        executeCommand(new );
        executeCommand();
        executeCommand();
        executeCommand();
        executeCommand();        
    }


    private void executeCommand(ICommand command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        ICommand command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}