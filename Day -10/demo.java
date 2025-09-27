class compile {
    int a = 10;
    int b = 20;

    compile(int a){
        this.a = a;
        System.out.println("Value of a: " + this.a);
    }
    compile(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Value of a: " + this.a);
        System.out.println("Value of b: " + this.b);
    }
    
}
public class demo {
    public static void main(String[] args) {
        compile obj1 = new compile(5);
        compile obj2 = new compile(10, 15);
        
    }
}