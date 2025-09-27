import java.util.Scanner;
public class domainextractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Email : ");
        String mail = sc.nextLine();
        if (mail.contains("@gmail.com")){
            System.out.println("Domain is Gmail.com");
        } else if (mail.contains("@yahoo.com")){
            System.out.println("Domain is Yahoo.com");
        } else if (mail.contains("@outlook.com")){
            System.out.println("Domain is : Outlook");
        } else if (mail.contains("@kongu.edu")) {
            System.out.println("Domain is Kongu private domain for education.");
        } else {
            System.out.println("Not a domain.");
        }
    }
}
