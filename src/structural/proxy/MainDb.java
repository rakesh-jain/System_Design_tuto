package structural.proxy;

import java.util.HashMap;
import java.util.Map;

// --------- Real Object ---------
public class MainDb implements DatabaseService {
    private Map<String, Student> data = new HashMap<>();

    @Override
    public void create(String dbName, Student student) {
        data.put(dbName, student);
        System.out.println("Student added to " + dbName + ": " + student);
    }

    @Override
    public void update(String dbName, Student student) {
        if (data.containsKey(dbName)) {
            data.put(dbName, student);
            System.out.println("Student updated in " + dbName + ": " + student);
        } else {
            System.out.println("No data found for " + dbName);
        }
    }

    @Override
    public void delete(String dbName) {
        if (data.containsKey(dbName)) {
            data.remove(dbName);
            System.out.println("Student deleted from " + dbName);
        } else {
            System.out.println("No data found for " + dbName);
        }
    }

    @Override
    public Student read(String dbName) {
        return data.get(dbName);
    }
}
