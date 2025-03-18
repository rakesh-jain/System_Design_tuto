package structural.decorator;

public class PhotoShop {
    public static void main(String[] args) {

        String frame = "🎞";
        String photoName = "Rakesh";
        Photo simpleFrame = new SimpleFrame(photoName, frame);
        simpleFrame.details();

        Photo flowerFrame = new FlowerFrame(simpleFrame, "💐");
        flowerFrame.details();

        Photo lightframe = new LightFrame(flowerFrame, "🌟");
        lightframe.details();

    }
}
