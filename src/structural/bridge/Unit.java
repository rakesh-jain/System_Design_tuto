package structural.bridge;

/**
 *The Bridge Design Pattern is a structural pattern that separates an abstraction from its implementation so that both can be developed independently.
 * It helps decouple classes so that changes in one part (abstraction or implementation) don’t require changes in the other.
 *
 * 🏗️ Structure of Bridge Pattern
 * 1.Abstraction
 *
 * Defines the interface for the abstract class.
 * Contains a reference to the implementation.
 *
 * 2.Refined Abstraction
 *
 * Extends the abstraction interface.
 * Can add more specific behaviors.
 *
 * 3.Implementor
 *
 * Interface that defines the implementation part.
 * Provides the methods for the concrete implementation.
 *
 * 4.Concrete Implementor
 *
 * Implements the Implementor interface.
 * Provides the actual implementation of methods.
 */
public class Unit{
    public static void main(String[] args) {
        Vehicle bike = new Bike("Yamaha 32487cy", "Grey", new Design(), new Assemble(), new Engine());
        bike.manufacture();

        System.out.println();

        Vehicle car = new Car("Toyota Fortuner", "Black", new Design(), new Assemble(), new Engine());
        car.manufacture();
    }
}
