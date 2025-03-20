package structural.proxy;

import java.util.HashMap;
import java.util.Map;

// --------- Proxy Object ---------
public class ProxyDb implements DatabaseService {
    private MainDb realDb;
    private Map<String, Student> cache = new HashMap<>();

    public ProxyDb() {
        this.realDb = new MainDb();
    }

    @Override
    public void create(String dbName, Student student) {
        realDb.create(dbName, student);
        cache.put(dbName, student); // Update cache
    }

    @Override
    public void update(String dbName, Student student) {
        realDb.update(dbName, student);
        cache.put(dbName, student); // Update cache
    }

    @Override
    public void delete(String dbName) {
        realDb.delete(dbName);
        cache.remove(dbName); // Remove from cache
    }

    @Override
    public Student read(String dbName) {
        if (cache.containsKey(dbName)) {
            System.out.println("[Cache Hit] Returning from cache: " + dbName);
            return cache.get(dbName);
        } else {
            System.out.println("[Cache Miss] Fetching from MainDb...");
            Student student = realDb.read(dbName);
            if (student != null) {
                cache.put(dbName, student); // Store in cache for future use
            }
            return student;
        }
    }
}
