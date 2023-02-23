package throw_demo;

public class AccountManager {
    private double balance;
public void deposit(double amount){
    balance = getBalance() + amount;
}
public void withdraw(double amount) throws BalanceInsufficientException {
    if (balance>= amount){
        balance = getBalance() - amount;
    }else {
       throw new BalanceInsufficientException( "Hesaptan para cekilemedi, Yetersiz bakiye Exception");
    }

}


  AccountManager manager = new AccountManager();

    public AccountManager getManager() {
        return manager;
    }

    public void setManager(AccountManager manager) {
        this.manager = manager;
    public double getBalance() {
        return balance;

    }
}
