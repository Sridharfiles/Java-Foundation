import java.util.Scanner;
public class temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter your temperature : ");     
        int temp = sc.nextInt();
        sc.nextLine();
        boolean precipitation = false;
        String message = 
        (temp < 10) ?
        (precipitation ?  
            "Wear a warm waterproof coat." 
                : "Wear a warm jacket") :
        (temp <= 25) ? 
        (precipitation ? 
            "Wear a light raincoat." 
                : "Wear comfortable clothes.") : 
        "Wear shorts and a T-shirt.";
        System.out.println(message);
    }
}