package structural.proxy;

// --------- Main Database Interface ---------
public interface DatabaseService {
    void create(String dbName, Student student);
    void update(String dbName, Student student);
    void delete(String dbName);
    Student read(String dbName);
}
