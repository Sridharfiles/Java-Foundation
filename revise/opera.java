public class opera {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int dif = b - a;
        int prod = a * b;
        int quot = b / a;
        int rem = b % a;
        System.out.println("Arithmetic Operations:");
        System.out.println("addition: " + sum);
        System.out.println("subtraction: " + dif);
        System.out.println("multiplication: " + prod);
        System.out.println("division: " + quot);
        System.out.println("remainder: " + rem);

        System.out.println("Relational Operations:");
        System.out.println(" == : " + (a == b));
        System.out.println(" != : " + (a != b));
        System.out.println(" > : " + (a > b));
        System.out.println(" < : " + (a < b));
        System.out.println(" >= : " + (a >= b));
        System.out.println(" <= : " + (a <= b));

        System.out.println("Logical Operations:");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // AND
        //  true && false = false
        //  true && true = true
        //  false && false = false
        //  false && true = false
        System.out.println("x || y: " + (x || y)); // OR
        //  true || false = true
        //  true || true = true
        //  false || false = false
        //  false || true = true
        System.out.println("!x: " + (!x)); // NOT
        System.out.println("!y: " + (!y));
        //  !true = false
        //  !false = true
    }
}
