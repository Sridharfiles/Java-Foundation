public class otp {
    public static void main(String[] args) {
        int otp = (int)(Math.random() * 900000) + 100000;
        System.out.println("Your OTP : "+otp);
    }
}
