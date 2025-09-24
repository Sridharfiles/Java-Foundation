
import java.util.Scanner;

public class scenario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();

        StringBuffer sb = new StringBuffer(word);

        sb.append("ful and versatile");
        System.out.println("After Append : "+sb);

        sb.insert(5, "Programming");
    }
}
