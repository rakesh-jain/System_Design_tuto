package creationpattern.Builder;

public class ComputerBuilderMain {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBlutoothenabled(true).setIsgraphiccardenabled(true).Build();
        System.out.println(comp.toString());

    }
}
