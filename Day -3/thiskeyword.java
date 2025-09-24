public class thiskeyword{
    String name;
    double salary;

    thiskeyword(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name -->"+name+"\nSalary -->"+salary);
    }


    public static void main(String[] args) {
        thiskeyword t = new thiskeyword("sree",345000);
        t.display();
    }
}