class Account {
    String accName;
    double balance;
    Account(String accName, double balance) {
        this.accName = accName;  
        this.balance = balance;
    }
    void display() {
    System.out.println(accName + " : " + balance);
    }
    public static void main(String[] args) {
        Account a1 = new Account("Sri", 45000);
        Account a2 = new Account("sridhar", 50000);
        a1.display();
        a2.display();
    }
}
