import java.util.Scanner;
public class atmsystem{
    
    public static void main(String[] args) {
        double balance , withdrawal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your balance : ");
        balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount : ");
        withdrawal = sc.nextDouble();

        if (balance  >= withdrawal) {
            System.out.println("Amount "+withdrawal+" Withdrawal successful!");
            balance = balance - withdrawal;
            System.out.println("Remaining balance is "+balance);
        }else {
            System.out.println("Insufficient balance");
        }   
    }
}