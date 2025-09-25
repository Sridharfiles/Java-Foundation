import java.util.Scanner;
public class qnpicker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.of questions :");
            int n = sc.nextInt();
            sc.nextLine();
            
            String[] question = new String[n];
            
            for (int i = 0; i < n;i++){
                System.out.println("Enter the question "+(i + 1));
                question[i] = sc.nextLine();
            }
            int index = (int)(Math.random() * n);
            System.out.println("Random question : "+question[index]);
        }
    }
}
