package creationpattern.abstractfactorymethod.account;

public class AccountFactory {
    public Account createAccount(AccoountAbstractFactory accoountAbstractFactory){
        return accoountAbstractFactory.createAccount();
    }
}
