public class addition{

    int Add(int a , int b){
        return a + b;
    }
    public static void main(String[] args) {
        addition o1 = new addition();
        System.out.println(o1.Add(10,20));

        addition o2 = new addition();
        System.out.println(o2.Add(30,40));
    }
}