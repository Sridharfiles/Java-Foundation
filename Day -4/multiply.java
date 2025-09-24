public class multiply{
    public static void main(String[] args) {
        int i = 1;
        while (i<=4){
            int j = 1;
            while (j <= 10){
                System.out.println(j+" * "+i+" = "+(i*j));
                j++;
            }
            System.out.println("---------");
            i++;
        }
    }
}