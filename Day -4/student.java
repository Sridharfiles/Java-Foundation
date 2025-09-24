import java.util.Scanner;
public class student {
    String n;
    int r;
    int m;
    public student(String n, int r, int m) {
        this.n = n;
        this.r = r;
        this.m = m;
    }
    void display (){
        System.out.println("Student Name--> "+n);
        System.out.println("Student RollNo--> "+r);
        System.out.println("Student Mark--> "+m);
        System.out.println("Stduent Grade--> "+grade(m));
        
    }
    String grade (int mark) {
        if (mark >= 90) {
            return "Grade A";
        } else if (mark >= 75 && mark < 90) {
            return "Grade B";
        } else if (mark >= 50 && mark < 75) {
            return "Grade C";
        } else {
            return "grade F";
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name :");
        String n1= sc.nextLine();
        System.out.println("Enter student RollNo :");
        int r1= sc.nextInt();
        System.out.println("Enter Mark :");
        int m1 = sc.nextInt();
        student s = new student(n1,r1,m1);
        s.display();
    }
}