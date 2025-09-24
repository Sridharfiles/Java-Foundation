import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i=1; i<=3; i++) {
            System.out.print("Enter marks: ");
            total = total + sc.nextInt();
        }
        System.out.println("Average = " + total/3);
        sc.close();
    }
}