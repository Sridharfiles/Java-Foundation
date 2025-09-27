public class BankAccount {
    private int accountNumber;
    private String HolderName;
    private double balance;

    public BankAccount() {
        this.accountNumber = 0;
        this.HolderName = "Unknown";
        this.balance = 0.0;
        System.out.println("Incomplete details.");
    }
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.HolderName = "Unknown";
        this.balance = 0.0;
    }
    public BankAccount(int accountNumber, String HolderName) {
        this.accountNumber = accountNumber;
        this.HolderName = HolderName;
        this.balance = 0.0;
    }
    public BankAccount(int accountNumber, String HolderName, double balance){
        this.accountNumber = accountNumber;
        this.HolderName = HolderName;
        this.balance = balance;
    }
    void display(){
        System.out.println("Account Number: "+accountNumber+" Holder Name: "+HolderName+" Balance: "+balance);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.display();
        BankAccount b2 = new BankAccount(987654321);
        b2.display();
        BankAccount b3 = new BankAccount(987654321, "Sridhar K");
        b3.display();
        BankAccount b4 = new BankAccount(987654321, "Sridhar K", 100000.0);
        b4.display();
    }
}
