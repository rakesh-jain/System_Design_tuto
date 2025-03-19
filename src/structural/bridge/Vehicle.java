package structural.bridge;

public abstract class Vehicle {
    private String model;
    private String colour;
    Manufacture design;
    Manufacture assemble;
    Manufacture engine;

    public Vehicle(String model, String colour, Manufacture design, Manufacture assemble, Manufacture engine) {
        this.model = model;
        this.colour = colour;
        this.design = design;
        this.assemble = assemble;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    String getDetails() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    // Bridge: Calls to implementor methods
    abstract void manufacture();
}


