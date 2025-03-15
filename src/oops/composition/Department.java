package oops.composition;

/**
 * In Object-Oriented Programming (OOP),
 * composition is a type of relationship where one class contains another class, and
 * the contained class cannot exist independently of the container class.
 * It’s a "HAS-A" relationship with strong ownership — if the container (whole) is destroyed,
 * the contained object (part) is also destroyed.
 *
 *  Definition
 * Composition represents a strong association between two objects.
 * The contained object cannot exist without the container object.
 * If the container object is destroyed, the contained object is also destroyed.
 * The lifecycle of the contained object is strictly bound to the lifecycle of the container object.
 */
public class Department {
    private String deptName;
    private Professor professor;

    public Department(String deptName) {
        this.professor = new Professor(deptName,"Network");
    }

    public String spcializedfor(){
        return professor.teaches();
    }

    public static void main(String[] args) {
        Department department= new Department("Electronics and Communication");
        System.out.println(department.spcializedfor());
    }

}
class Professor{
    private String deptName;
    private String specialization;

    public Professor(String deptName, String specialization) {
        this.deptName = deptName;
        this.specialization = specialization;
    }

    public String getDeptName() {
        return deptName;
    }

    public String teaches(){
        return specialization;
    }

}


