package creationpattern.abstractfactorymethod;

public class MainComputer
{
    public static void main(String[] args) {
     getAbstractFactory();
    }
    private static void getAbstractFactory(){
        Computer pc=new ComputerFactory().getComputer(new PcFactory("2 GB","500 GB","2.4 GHz"));
        Computer server=new ComputerFactory().getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
