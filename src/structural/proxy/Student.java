package structural.proxy;

// --------- Student Class ---------
public class Student {
    private int rollnum;
    private String name;
    private String address;

    public Student(int rollnum, String name, String address) {
        this.rollnum = rollnum;
        this.name = name;
        this.address = address;
    }

    public int getRollnum() {
        return rollnum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnum=" + rollnum +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

