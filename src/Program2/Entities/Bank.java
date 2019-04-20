package Program2.Entities;

public class Bank {
    private final int account;
    private String accountHolder;
    private double balance;

    public Bank(int account, String accountHolder) {
        this.account = account;
        this.accountHolder = accountHolder;
    }
    public Bank(int account, String accountHolder, double initialDeposit) {
        this.account = account;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccount() {
        return account;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double deposit){
        return balance += deposit;
    }
    public double withdraw(double withdraw){
        return balance -= withdraw + 5.00;
    }

    @Override
    public String toString() {
        return "Account "+account+", Holder: "+accountHolder+", Balance: $ "+balance;
    }
}
