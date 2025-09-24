import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        for (int i=1; i<=3; i++){
            System.out.print("Enter withdrawal: ");
            double w = sc.nextDouble();
            if (w > balance)
                System.out.println("Insufficient");
            else
                balance = balance - w;
        }
        System.out.println("Remaining Balance: " + balance);
        sc.close();
    }   
}