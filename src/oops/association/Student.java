package oops.association;

/**
 * Association is a relationship between two or more classes that allows one object to interact with another.
 * It does not involve ownership. Instead, it defines how objects are related and interact with each other.
 *
 * Types of Association:
 * One-to-One (1:1)
 * One-to-Many (1:M) or Many-to-One (M:1)
 * Many-to-Many (M:N)
 */
class Student {
    private String name;
    private College college; // Association

    public Student(String name, College college) {
        this.name = name;
        this.college = college;
    }

    public void display() {
        System.out.println(name + " studies at " + college.getCollegeName());
    }
}

class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }
}

 class AssociationExample {
    public static void main(String[] args) {
        College college = new College("KIT");
        Student student = new Student("Rakesh", college);

        student.display(); // Output: Rakesh studies at IIT Delhi
    }
}