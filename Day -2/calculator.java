public class calculator{
    int num1;
    int num2;
    static String calcType = "Basic Calculator";
    void addNumbers(int n1, int n2){
        num1 = n1;
        num2 = n2;
        int result = num1 + num2;
        System.out.println(calcType+"\n"+result);
    }
    public static void main(String[] args) {
        calculator N1 = new calculator();
        N1.addNumbers(10,40);
        calculator N2 = new calculator();
        N2.addNumbers(876, 678);
    }
}