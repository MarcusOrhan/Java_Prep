package throw_demo;

public class account {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesapta olan para :   $"+ manager.getBalance());
        manager.deposit(4200);
        System.out.println("Hesapta olan para :   $"+ manager.getBalance());
        try {
            manager.withdraw(200);
        } catch (BalanceInsufficientException e) {
            System.out.println("e = " + e.getMessage());
        }
        System.out.println("Hesapta olan para :   $"+ manager.getBalance());
        try{
            manager.withdraw(4200);
        }catch
            (BalanceInsufficientException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesapta olan para :   $"+ manager.getBalance());
    }
}
