public class studentdetails {
    String name;
    byte rollnumber;
    int mark1;
    int mark2;
    float total;
    static String clg_name = "Kongu Engineering College";

    void getdetails(String n,byte r, int m1, int m2){
        n = name;
        r = rollnumber;
        m1 = mark1;
        m2 = mark2;

        System.out.println(name+","+rollnumber+","+mark1+","+mark2+","+(mark1+mark2)+","+clg_name);
        
    }

    public static void main(String[] args) {
        studentdetails student1 = new studentdetails();

        studentdetails student2 = new studentdetails();
    }
}