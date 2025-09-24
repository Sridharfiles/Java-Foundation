public class mark {

    public static void main(String[] args) {
        int[] mark = {80,95,75,85,90};
        int total = 0;
        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }
        System.out.println(""+total);


        int maxmarks = 100;
        int numberofsubjects = mark.length;


        double percentage = (double) total / (maxmarks * numberofsubjects) * 100;
        System.out.println(""+percentage+ "%");

    }
}
