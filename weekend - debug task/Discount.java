import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        if (price > 1000);
        price = price * 0.9; //
        System.out.println("Final price: " + price);
        sc.close();
    }
}
