package structural.composite;

public class SweetBitterFruit implements Fruits{
    private String fruitName;
    private double amount;

    public SweetBitterFruit(String fruitName, double amount) {
        this.fruitName = fruitName;
        this.amount = amount;
    }

    @Override
    public void showFruitName() {
        System.out.println("Name:"+fruitName);
    }

    @Override
    public void showAmount() {
        System.out.println("Amount"+amount);
    }

    @Override
    public void nutrients() {
        System.out.println("Natural Sugars (Fructose, Glucose, Sucrose): Provide quick energy.\n" +
                "Vitamin C – Boosts immunity, improves skin health, and enhances iron absorption.\n" +
                "Vitamin A (Beta-Carotene) – Improves vision, immunity, and skin health.\n" +
                "B Vitamins – Support energy production and brain function.\n" +
                "Potassium – Regulates heart rate and muscle function.\n" +
                "Magnesium – Helps in muscle relaxation and nerve function.\n" +
                "Fiber – Improves digestion and regulates blood sugar levels.\n" +
                "Antioxidants – Protect cells from oxidative damage (e.g., polyphenols, flavonoids).");
    }
}
