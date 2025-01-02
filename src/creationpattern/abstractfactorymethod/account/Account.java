package creationpattern.abstractfactorymethod.account;

public abstract class Account {
  public abstract int getid();
  public abstract String getName();
  public abstract boolean isPaid();

  public String accountDetails(){
    return "Account info :-'\t' Account Id= "+getid()+" Account Holder Name=  "+getName()+" isPaid= "+isPaid();

  }

}
