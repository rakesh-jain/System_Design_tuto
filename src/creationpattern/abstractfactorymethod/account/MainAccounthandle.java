package creationpattern.abstractfactorymethod.account;

public class MainAccounthandle {
    public static void main(String[] args) {
    createnow();
    }
    private static void createnow(){
        Account normalacc=new AccountFactory().createAccount(new NormalAccFactory(655555,"Rakesh",false));
        Account primeacc=new AccountFactory().createAccount(new PrimeAccFactory(6766666,"Vishwas",true));
        System.out.println("prime "+ primeacc.accountDetails());
        System.out.println("normal "+normalacc.accountDetails());
    }
}
