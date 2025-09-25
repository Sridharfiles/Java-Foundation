import java.util.Scanner;
class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}
public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter a number a : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a number b : ");
        int b =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation : ");
        String ope = sc.nextLine();
        char o = ope.charAt(0);
        sc.close();
            switch (o) {
                case '+':
                    System.out.println(""+(a + b));
                    break;
                case '-':
                    System.out.println(""+(a - b));
                    break;
                case '*':
                    System.out.println(""+(a * b));
                    break;
                case '/':
                    System.out.println(""+(a / b));
                    break;
                default: 
                    throw new InvalidOperationException("Invalid operation occurred");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered: "+e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: "+e);
        } catch (InvalidOperationException  e){
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("Calculation attempt finished.");
        }
    }
}

