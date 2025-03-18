package structural.decorator;

public class LightFrame extends PhotoFrameDecorator {
    private String photoFrame;

    public LightFrame(Photo photo, String photoFrame) {
        super(photo);
        this.photoFrame = photoFrame;
    }

    @Override
    public String makeFrame() {
        return super.makeFrame() + " with " + photoFrame;
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }

    @Override
    public void details() {
        System.out.println("Frame:" + this.makeFrame());
        System.out.println("Cost:" + this.cost());
    }
}
