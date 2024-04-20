public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15;//FEE is 15 cents

    public CheckingAccount(String name, double amount){
        super(name, amount); // Calls surperclass constructor to initialize owner and balance
        //Initialize accountNumber
        setAccountNumber(getAccountNumber() + "-10");
    }

    public boolean withdraw(double amount){
        // total amount that will be withdrawn including the fee
        double totalAmount = amount + FEE;

        //check if balance is enough to cover the total amount
        if (totalAmount <= getBalance()){
            // if balance is sufficient, withdraw the total amount(including fee)
            setBalance(getBalance() - totalAmount);
            return true;
        }
        else {
            return false; //Insufficient funds
        }

    }
}
