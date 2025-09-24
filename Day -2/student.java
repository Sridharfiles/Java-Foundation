public class student{
    String name;
    int age;
    static String school = "ABC school";
    void printDetails(String n, int a){
        String grade1 = "A+";
        name=n;
        age = a;
        System.out.println("Name-->"+name+ "\nAge--> "+age+"\nGrade-->"+grade1+"\nSchool-->"+school);
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        student student1 = new student();
        student1.printDetails("sri", 20);
        student student2 = new student();
        student2.printDetails("sridhar", 21);
    }
}