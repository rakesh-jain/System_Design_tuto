package creationpattern.abstractfactorymethod.account;

public class NormalAccFactory implements AccoountAbstractFactory{
    private int id;
    private String name;
    private boolean ispaid;

    public NormalAccFactory(int id, String name, boolean ispaid) {
        this.id = id;
        this.name = name;
        this.ispaid = ispaid;
    }

    @Override
    public Account createAccount() {
        return new NormalAccount(id,name,ispaid);
    }
}
