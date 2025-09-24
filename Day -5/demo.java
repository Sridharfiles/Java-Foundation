public class demo {
    public static void main(String[] args) {
        int i = 3;
        while (i <= 60){
            if(String.valueOf(i).contains("3")) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}