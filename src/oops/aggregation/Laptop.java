package oops.aggregation;

/***
 * In Object-Oriented Programming (OOP),
 * aggregation is a type of relationship between two classes where one class contains a reference to another class.
 * It's a "HAS-A" relationship that represents a weak association
 * (i.e., the child object can exist independently of the parent object).
 * definition----
 * Aggregation defines a relationship where:
 * 1.One class (whole) contains a reference to another class (part).
 * 2.The contained object (part) can exist independently of the container object (whole).
 * 3.If the container object is destroyed, the contained object is not destroyed.
 *
 *
 * Difference Between Aggregation and Composition
 * Aspect	            Aggregation	                      Composition
 * Relationship Type	Weak association	              Strong association
 * Object Dependency	Child can exist independently	  Child cannot exist without parent
 * UML Representation	Hollow Diamond	                  Filled Diamond
 * Example	            Department ↔ Professor	          House ↔ Room
 */

public class Laptop {
    private String brand;
    private Processor processor;
    private Battery battery;
    private Storage storage;

    public Laptop(String brand,Processor processor, Battery battery, Storage storage) {
        this.brand = brand;
        this.processor = processor;
        this.battery = battery;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor=" + processor.toString() +
                ", battery=" + battery.toString() +
                ", storage=" + storage.toString() +
                '}';
    }

    public static void main(String[] args) {
        Processor processor = new Processor("intel i7");
        Storage storage = new Storage(8, 256, 1000);//per gb
        Battery battery = new Battery("65 Wh");
        Laptop laptop = new Laptop("likers",processor, battery, storage);
        System.out.println(laptop.toString());
    }
}

class Processor {
    private String series;

    public Processor(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "series='" + series + '\'' +
                '}';
    }
}

class Battery {
    String watt_hours;

    public Battery(String watt_hours) {
        this.watt_hours = watt_hours;
    }

    public String getWatt_hours() {
        return watt_hours;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "watt_hours='" + watt_hours + '\'' +
                '}';
    }
}

class Storage {
    private int ram;
    private int ssd;
    private int hdd;

    public Storage(int ram, int ssd, int hdd) {
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "ram=" + ram +
                ", ssd=" + ssd +
                ", hdd=" + hdd +
                '}';
    }
}


