public class employee {
    private String name;
    private double salary;

    public employee(){
        this.name = "Unknown";
        this.salary = 0.0;
        System.out.println("Incomplete details.");
    }
    public employee(String name) {
        this.name = name;
        this.salary =  0.0;

    }
    public employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }
    void display(){
        System.out.println("Employee Name: "+name+" Employee Salary: "+salary);
    }
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.display();
        employee e2 = new employee("Sridhar");
        e2.display();
        employee e3 = new employee("Sridhar", 500000.0);
        e3.display();
    }
}
