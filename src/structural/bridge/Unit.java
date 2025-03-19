package structural.bridge;

public class Unit{
    public static void main(String[] args) {
        Vehicle bike = new Bike("Yamaha 32487cy", "Grey", new Design(), new Assemble(), new Engine());
        bike.manufacture();

        System.out.println();

        Vehicle car = new Car("Toyota Fortuner", "Black", new Design(), new Assemble(), new Engine());
        car.manufacture();
    }
}
