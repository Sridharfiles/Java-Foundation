import java.util.Scanner;
public class switch3 {
    void grade(int a) {
        switch (a / 100) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade F");
        }
    }
    void mark(int a){
        if(a >= 40) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
    void age(int a){
        int g;
        if (a < 5) g = 0;
        else if(a <= 10) g = 1;
        else if(a <= 15) g = 2;
        else if(a <= 18) g = 3;
        else g = 4;
        switch (g){
            case 0 -> System.out.println("Too young to register!!");
            case 1 -> System.out.println("Primary School");
            case 2 -> System.out.println("High School");
            case 3 -> System.out.println("Higher Secondary");
            case 4 -> System.out.println("College or Adult");
        }
    }
    public static void main(String[] args){
        switch3 s = new switch3();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 . Check your mark to Grade.\n2 . check your mark to Pass or Fail.\n3 . check your age to school or college.\n4 . Exit program.");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter a mark :");
                int m = sc.nextInt();
                s.grade(m);
                break;
            case 2:
                System.out.println("Enter a mark :");
                int m1 = sc.nextInt();
                s.mark(m1);
                break;
            case 3:
                System.out.println("Enter a age :");
                int a = sc.nextInt();
                s.age(a);
                break;
            case 4:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please select 1–4 only.");
        }
        sc.close();
    }
}