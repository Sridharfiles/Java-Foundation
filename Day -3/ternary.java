
import java.util.Scanner;


public class ternary{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int age;
        String name;

        System.out.println("Enter your name : ");
        name = s1.nextLine();

        System.out.println("Enter your age : ");
        age = s1.nextInt();

        
        if (age >= 18){
            System.out.println("Hi! "+name+" you're eligible for vote.");
        }
        else{
            System.out.println("Hi! "+name+" you're not eligible for vote.");
        }
    }
}