import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println(num);
        System.out.println(""+num.get(2));

        num.set(2, 40);
        System.out.println(num);
        //cointain remove size
        num.contains(40);
        System.out.println(num);

        num.remove(2);
        System.out.println(num);

        System.out.println(""+num.size());


    }
}
