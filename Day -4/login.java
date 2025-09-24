import java.util.Scanner;
public class login{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u,p;
        System.out.println("SignUp to Continue \n Enter a UserName : ");
        u = sc.nextLine();
        System.out.println("Enter a Password : ");
        p = sc.nextLine();
        System.out.println("Login your Acoount \n Enter your UserName : ");
        String u1 = sc.nextLine();
        System.out.println("Enter a Password : ");
        String p1 = sc.nextLine();
        if (u1.equals(u) && p1.equals(p)){
            System.out.println("Welcome back your Account.");
        }else {
            System.out.println("UserName and Password didn't match.");
        }
    }
}