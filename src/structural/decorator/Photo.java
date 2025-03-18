package structural.decorator;

public interface Photo {
    String makeFrame();

    double cost();

    void details();
}

class SimpleFrame implements Photo {
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

abstract class PhotoFrameDecorator implements Photo {
    protected Photo photo;

    public PhotoFrameDecorator(Photo photo) {
        this.photo = photo;
    }


    @Override
    public String makeFrame() {
        return photo.makeFrame();
    }

    @Override
    public double cost() {
        return photo.cost();
    }

    @Override
    public void details() {
        System.out.println("Frame:" + this.makeFrame());
        System.out.println("Cost:" + this.cost());
    }
}

class FlowerFrame extends PhotoFrameDecorator {
    private String photoFrame;

    public FlowerFrame(Photo photo, String photoFrame) {
        super(photo);
        this.photoFrame = photoFrame;
    }

    @Override
    public String makeFrame() {
        return super.makeFrame() + " with " + photoFrame;
    }

    @Override
    public double cost() {
        return super.cost() + 200;
    }

    @Override
    public void details() {
        System.out.println("Frame:" + this.makeFrame());
        System.out.println("Cost:" + this.cost());
    }
}


class LightFrame extends PhotoFrameDecorator {
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

class PhotoShop {
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



