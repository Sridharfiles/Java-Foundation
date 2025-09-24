public class bitwise{

    public static void main(String[] args) {
        int a = 20;
        int b = 18;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println(" ~a = " + (~a)); // - (n + 1)
        System.out.println("a << = " + (a << 2)); //  multiply
        System.out.println("a >> = " + (a >> 3)); // division

    }
}