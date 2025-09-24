public class comparemultiple{
    public static void main(String[] args) {
        int a=12, b=7, c=5;

        System.out.println(((a + b) > c));
        System.out.println(((a * c) < (b * b)));
        ++a;
        System.out.println(a > (b+c));
    }
}