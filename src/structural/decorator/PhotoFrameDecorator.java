package structural.decorator;

public abstract class PhotoFrameDecorator implements Photo {
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
