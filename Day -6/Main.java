import java.util.Scanner;
class employee {
    String name;
    double salary;
    employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void checkBonus() {
        if (salary > 50000)
            System.out.println("Hi "+name+" Bonus Eligible");
        else
            System.out.println("No Bonus");
    }
}
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    employee e = new employee(sc.next(), sc.nextDouble());
    e.checkBonus();
    sc.close();
    }
}