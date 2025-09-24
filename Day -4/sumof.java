import java.util.Scanner;
public class sumof{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Enter a number how times casses run :");
        t = sc.nextInt();
        int test = 1;
        while (test <= t){
            int n;
            System.out.println("Enter a number :");
            n = sc.nextInt();
            int i = 1;
            int result = 0;
            while(i <= n){
                result += i;
                i++;
            }
            System.out.println("Sum of first "+n+" natural numbers "+result);
            test++;
        }
    }
}