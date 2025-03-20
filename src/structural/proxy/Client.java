package structural.proxy;

// --------- Client Code ---------
public class Client {
    public static void main(String[] args) {
        DatabaseService dbService = new ProxyDb();

        Student student1 = new Student(1, "Rakesh", "Bangalore");
        Student student2 = new Student(2, "John", "Mumbai");

        // Create
        dbService.create("DB1", student1);
        dbService.create("DB2", student2);

        System.out.println("===================================");

        // Read from Cache
        System.out.println(dbService.read("DB1"));
        System.out.println(dbService.read("DB2"));

        System.out.println("===================================");

        // Update
        dbService.update("DB1", new Student(1, "Rakesh R", "Chennai"));
        System.out.println(dbService.read("DB1"));

        System.out.println("===================================");

        // Delete
        dbService.delete("DB2");
        System.out.println(dbService.read("DB2")); // Should return null
    }
}
