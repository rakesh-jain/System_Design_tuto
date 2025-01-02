package creationpattern.Builder.example;

public class Bike {
    private String Engine;
    private String Power;
    private String Torque;
    private String brake;
    private String name;

    private  Bike(BikeBuilder bikeBuilder) {
        Engine = bikeBuilder.Engine;
        Power = bikeBuilder.Power;
        Torque = bikeBuilder.Torque;
        this.brake = bikeBuilder.brake;
        this.name = bikeBuilder.name;
    }

    @Override
    public String toString() {
        return "Bike{"
                + " name='" + name + '\'' +
                "Engine='" + Engine + '\'' +
                ", Power='" + Power + '\'' +
                ", Torque='" + Torque + '\'' +
                ", brake='" + brake + '\'' +
                '}';
    }
    public  static  class BikeBuilder{

        private String Engine;
        private String Power;
        private String Torque;
        private String brake;
        private String name;

        public BikeBuilder(String engine, String power, String torque, String brake, String name) {
            Engine = engine;
            Power = power;
            Torque = torque;
            this.brake = brake;
            this.name = name;
        }

        public BikeBuilder setPower(String power) {
            this.Power = power;
            return this;
        }

        public BikeBuilder setTorque(String torque) {
            this.Torque = torque;
            return this;
        }
        public Bike Build(){
            return new Bike(this);
        }
    }

    public static void main(String[] args) {
        Bike bike= new BikeBuilder("452 cc","40.02 PS","40 Nm","Double Disc","Royal Enfield Himalayan 450").Build();
        System.out.println(bike.toString());
    }

}
