public class employee{
    String empName;
    int empId;
    static String companyName = "ABC Corp";
    void printEmployee(String e,int d){
        empName = e;
        empId = d;
        float salary = 20000;
        System.err.println("Employee Name --> "+empName+"\nEmployeeID--> "+empId+"\nCompany Name--> "+companyName+"\nSalary--> "+salary);
        System.out.println("------------------\n");
    }
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.printEmployee("Sridhar",101);
        employee e2 = new employee();
        e2.printEmployee("sree", 102);
    }
}