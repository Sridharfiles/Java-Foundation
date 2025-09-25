abstract class vehicles {
    abstract void wheels();
    void numbers(){
        System.out.println("Below displaying the no.of wheels..");
    }
}
class car extends vehicles {
    @Override
    void wheels() {
        System.out.println("cars have 4 wheels.");
    }
}
class bike extends vehicles {
    @Override
    void wheels() {
        System.out.println("bikes have 2 wheels.");
    }
}

public class vehicle {
    public static void main(String[] args) {
        bike b = new bike();
        
        
    }
    
}
