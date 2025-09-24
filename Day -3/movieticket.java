import java.util.Scanner;
public class movieticket{
    public static void main(String[] args) {
        int age;
        String dayofweek;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = s1.nextInt();
        s1.nextLine();
        System.out.println("Enter a day of week : (like Monday, Tuesday,..)");
        dayofweek = s1.nextLine();
        double ticketPrice = 200;
        double discount = 0;
        if (age < 12){
            System.out.println("Your age is under 12, so you get a 50% discount.");
            discount += 50;
        }else if (age >= 60){
            System.out.println("Your age is 60 or older, so you get a 40% discount.");
            discount += 40;
        }
        if (dayofweek.equalsIgnoreCase("wednesday") && dayofweek.equalsIgnoreCase("Wednesday")){
            System.out.println("You're booking a ticket on "+dayofweek+", so you get an extra 10% discount.");
            discount += 10;
        }
        double finalPrice = ticketPrice * (1 - discount / 100);
        System.out.println("Final ticket price is "+finalPrice);
    }
}



