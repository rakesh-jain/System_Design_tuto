package creationpattern.abstractfactorymethod.account;

public class PrimeAccount extends Account{
  private int id;
  private String Name;
  private boolean ispaid;

    public PrimeAccount(int id, String name, boolean ispaid) {
        this.id = id;
        Name = name;
        this.ispaid = ispaid;
    }

    @Override
    public int getid() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public boolean isPaid() {
        return this.ispaid;
    }
}
