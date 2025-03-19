package structural.composite;

/**
 * The Composite Design Pattern is a structural pattern that allows you to compose objects into tree structures to represent part-whole hierarchies.
 * It lets clients treat individual objects and compositions of objects uniformly.
 *
 * 🚀 Use Cases
 * ✔️ GUI components (buttons, panels, windows)
 * ✔️ File system structures (files and directories)
 * ✔️ Organizational hierarchies (employees, managers)
 * ✔️ Menu structures in applications
 */
public interface Fruits {
    void showFruitName();
    void showAmount();
    void nutrients();
}
