package structural.composite;

public class FruitShop{
    public static void main(String[] args) {
        Fruits sourFruits = new SweetSourFruits("Orange",100);
        FruitsTray tray = new FruitsTray(10);
        tray.addFruits(sourFruits);

        Fruits bitterFruits = new SweetBitterFruit("Grapefruit",55);
        tray.addFruits(bitterFruits);
        
        tray.showTray();
    }
}
