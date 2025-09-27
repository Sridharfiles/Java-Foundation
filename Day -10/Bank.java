public class Bank {
    private String accountName;
    private double  balance;

    public String getname () {
        return accountName;
    }

    public void setname (String name) {
        this.accountName = name;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public static void main(String[] args) {
        Bank account = new Bank();
        account.setname("Sridhar");
        account.setBalance(10000.0);
        System.out.println("Account Name: " + account.getname());
        System.out.println("Account Balance: " + account.getBalance());
    }
}
