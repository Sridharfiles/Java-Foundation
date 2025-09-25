class A {
    String name ;
    int age;
    double salary;

    void getdata(String n, int a,double s){
        name = n;
        age = a;
        salary = s;
    }
}
class B extends A {
        void display() {
        System.out.println("Displaying..");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}
class C extends A{

} 
public class opp {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.getdata("Sridhar", 20,256000);
        obj2.display();
    }
}