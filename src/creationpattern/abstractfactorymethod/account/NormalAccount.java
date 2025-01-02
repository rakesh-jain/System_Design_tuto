package creationpattern.abstractfactorymethod.account;

public class NormalAccount extends Account{
    private int id;
    private String name;
    private boolean ispaid;

    public NormalAccount(int id, String name, boolean ispaid) {
        this.id = id;
        this.name = name;
        this.ispaid = ispaid;
    }

    @Override
    public int getid() {
        return this.id;
    }

    @Override
    public String getName() {
     return this.name;
    }

    @Override
    public boolean isPaid() {
     return this.ispaid;
    }
}
