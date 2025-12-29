public class VarExample {
    //static
    static String staticvar = "Static";
    //global
    String globalvar = "Global";
    //instance
    String instancevar = "Instance";


    public static void main(String[] args) {
        //local
        var message = "Local";
        System.out.println(message);
        VarExample e = new VarExample();
        System.out.println(e.globalvar);
        System.out.println(staticvar);
        System.out.println(e.instancevar);

    }
}