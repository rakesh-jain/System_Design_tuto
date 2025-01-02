package creationpattern.abstractfactorymethod;

public class Server extends Computer{
    private String Ram;
    private String Hdd;
    private String Cpu;

    public Server(String ram, String hdd, String cpu) {
        Ram = ram;
        Hdd = hdd;
        Cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.Ram;
    }

    @Override
    public String getHDD() {
        return this.Hdd;
    }

    @Override
    public String getCPU() {
        return this.Cpu;
    }
}
