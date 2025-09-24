import java.util.Scanner;
public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter day: ");
        String day = sc.next();
        double price = 200;
        if (age < 12){
            price = price * 0.5;
        }
        else if (age >= 60){
            price = price * 0.6;
        }
        else if (day.equals("Wednesday")){
            price = price * 0.9;
        }        System.out.println("Final Ticket Price: " + price);
        sc.close();
    }
}