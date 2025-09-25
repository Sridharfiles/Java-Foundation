abstract class Livingbeing {
    String type = "Mammal";
    static int count = 0;

    abstract void breathe();
}
class Human extends Livingbeing{

    public Human() {
        count++;
    }
    void breathe(){
        System.out.println("Human breathes, Type : "+type);

    }
}
public class abstactionvariable {
    public static void main(String[] args){
        Human h1 = new Human();
        h1.breathe();

        Human h2 = new Human();
        h2.breathe();

        System.out.println(""+Human.count);
    }
}
