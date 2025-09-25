
abstract class A {
    String name ;
    int age;
    double salary;
    abstract void getdata(String n, int a,double s);
}
class B extends A {

    @Override
    void getdata(String n, int a,double s){
        name=n;
        age=a;
        salary=s;
    }
    
        void display() {
        System.out.println("Displaying..");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}
class C extends A{
    @Override
    void getdata(String n, int a,double s){
        name=n;
        age=a;
        salary=s;
    }

} 
public class inheri {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.getdata("Sridhar", 20,256000);
        obj1.display();
    }
    
}
