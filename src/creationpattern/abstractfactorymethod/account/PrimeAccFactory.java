package creationpattern.abstractfactorymethod.account;

public class PrimeAccFactory implements AccoountAbstractFactory{
    private int id;
    private String name;
    private boolean ispaid;

    public PrimeAccFactory(int id, String name, boolean ispaid) {
        this.id = id;
        this.name = name;
        this.ispaid = ispaid;
    }

    @Override
    public Account createAccount() {
        return new PrimeAccount(id,name,ispaid);
    }
}
