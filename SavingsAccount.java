public class SavingsAccount extends BankAccount{
    private static double rate = 0.025; //Annual interest rate(2.5%)
    private int savingsNumber = 0; // Initialized to 0
    private String accountNumber; // Hidden instance variable from BankAccount

    public SavingsAccount(String name, double amount){
        super(name, amount); // Calls superclass constructor to initialize owner and balance

        // Sets accountNumber to current val in superclass accountNumber concatenated with a hyphen and savingsNumber
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    //postInterest() calculates and deposits one month's worth of interest into the account
    public void postInterest(){
        double interest = getBalance() * rate / 12; // Calculates interest
        deposit(interest); // Deposits the interest into the account
    }

    // Overrides the getAccountNumber method to return the account number with savingsNumber
    public String getAccountNumber(){
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double amount){
        super(oldAccount, amount); // Calls superclass copy constructor
        this.savingsNumber = oldAccount.savingsNumber + 1; // increments savingNumber
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber; //Concatenates accountNumber
    }
}
