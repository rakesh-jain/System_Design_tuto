package structural.decorator;

public class SimpleFrame implements Photo {
    private String photo;
    private String photoFrame;

    public SimpleFrame(String photo, String frame) {
        this.photo = photo;
        this.photoFrame = frame;
    }

    @Override
    public String makeFrame() {
        return photo + " added to " + photoFrame + " frame";
    }

    @Override
    public double cost() {
        return 400.0;
    }

    @Override
    public void details() {
        System.out.println("Frame:" + this.makeFrame());
        System.out.println("Cost:" + this.cost());
    }
}
