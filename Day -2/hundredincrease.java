public class hundredincrease {
    public static void main(String[] args) {
        int a = 40;
        int b = 30;

        int sum = a + b;
        System.out.println("sum of two numbers:"+sum);

        if (sum < 100){
            System.out.println("increment one "+(++sum));
        }else {
            System.out.println("sum of two numbers is greater than 100.");
        }
    }
}