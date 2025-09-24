import java.util.Random;
import java.util.Scanner;

public class qnpicker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.of questions :");
            int n = sc.nextInt();
            sc.nextLine();
            
            String[] question = new String[n];
            
            for (int i = 1; i <= n;i++){
                System.out.println("Enter the question "+i);
                question[i] = sc.nextLine();
            }
            Random r = new Random();
            int index = (int)(Math.random() * n);
            System.out.println("Random question : "+question[index]);
        }
    }
}
