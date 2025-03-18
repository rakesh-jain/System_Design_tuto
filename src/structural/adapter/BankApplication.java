package structural.adapter;


abstract class Bank {
    private String bankName;
    private String code;

    public Bank(String bankName, String code) {
        this.bankName = bankName;
        this.code = code;
    }

    void getBankDetails() {
        System.out.println("Bank Name" + bankName + "\n Code:" + code);
    }

}

class HDFTBank extends Bank {
    public HDFTBank(String bankName, String code) {
        super(bankName, code);
    }
}

class ICBank extends Bank {
    public ICBank(String bankName, String code) {
        super(bankName, code);
    }
}

interface CreditCard {
    void getCreditCard();
}


class Customer implements CreditCard {
    private Bank bank;

    public Customer(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void getCreditCard() {
        bank.getBankDetails();
        System.out.println("credit card issued");
    }
}


public class BankApplication {
    public static void main(String[] args) {
        Bank hdfcBank = new HDFTBank("HDFT Bank", "HDFC001");

        // Use BankAdapter to adapt HDFTBank to CreditCard interface
        CreditCard hdfcCreditCard = new Customer(hdfcBank);
        hdfcCreditCard.getCreditCard();


        System.out.println("------------------------------");

        // Create ICBank instance
        Bank icBank = new ICBank("IC Bank", "IC001");

        // Use BankAdapter to adapt ICBank to CreditCard interface
        CreditCard icCreditCard = new Customer(icBank);
        icCreditCard.getCreditCard();
    }
}

