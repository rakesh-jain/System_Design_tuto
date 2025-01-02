package creationpattern.abstractfactorymethod;

public class ComputerFactory {
    public Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
