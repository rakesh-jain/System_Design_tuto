package structural.composite;

public class SweetSourFruits implements Fruits {
    private String fruitName;
    private double amount;

    public SweetSourFruits(String fruitName, double amount) {
        this.fruitName = fruitName;
        this.amount = amount;
    }

    @Override
    public void showFruitName() {
        System.out.println(this.fruitName);
    }

    @Override
    public void showAmount() {
        System.out.println(this.amount);
    }

    @Override
    public void nutrients() {
        System.out.println(fruitName + "is a Sour fruits are rich in essential nutrients that provide numerous health benefits:\n" +
                "\n" +
                "Vitamin C (Ascorbic Acid):\n" +
                "\n" +
                "Boosts immunity\n" +
                "Promotes skin health (collagen production)\n" +
                "Acts as an antioxidant\n" +
                "Citric Acid:\n" +
                "\n" +
                "Enhances digestion\n" +
                "Helps prevent kidney stones\n" +
                "Acts as a natural preservative\n" +
                "Vitamin A:\n" +
                "\n" +
                "Supports eye health\n" +
                "Enhances immune function\n" +
                "Promotes skin health\n" +
                "Potassium:\n" +
                "\n" +
                "Regulates blood pressure\n" +
                "Supports muscle function\n" +
                "Balances fluid levels in the body\n" +
                "Magnesium:\n" +
                "\n" +
                "Supports muscle and nerve function\n" +
                "Regulates blood sugar levels\n" +
                "Helps maintain bone health\n" +
                "Folate (Vitamin B9):\n" +
                "\n" +
                "Essential for DNA synthesis and repair\n" +
                "Important for red blood cell production\n" +
                "Fiber:\n" +
                "\n" +
                "Improves digestion\n" +
                "Aids in weight management\n" +
                "Lowers cholesterol levels\n" +
                "Calcium:\n" +
                "\n" +
                "Strengthens bones and teeth\n" +
                "Aids muscle contraction\n" +
                "Iron:\n" +
                "\n" +
                "Essential for hemoglobin production\n" +
                "Improves oxygen transport in the blood\n" +
                "Flavonoids and Polyphenols:\n" +
                "\n" +
                "Powerful antioxidants\n" +
                "Protect against heart disease\n" +
                "Reduce inflammation");
    }
}

