import java.util.Scanner;
public class scenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        StringBuffer sb = new StringBuffer(word);
        sb.append("ful and versatile");
        System.out.println("After Append : "+sb);
        sb.insert(5, "Programming ");
        System.out.println("After insert : "+sb);
        sb.delete(5, 17);
        System.out.println("After delete : "+sb);
        sb.replace(0, 4, "Python");
        System.out.println("After replace : "+sb);
        sb.reverse();
        System.out.println("After reverse : "+sb);
        System.out.println(""+sb.length());
        System.out.println(""+sb.capacity());
    }
}
