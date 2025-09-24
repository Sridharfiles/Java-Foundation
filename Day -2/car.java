public class car{
    String brand,color;
    static int wheels = 4;
    void showCarDetails(String b,String c){
        brand = b;
        color = c;
        String speed = "230km";
        System.err.println("Brand --> "+brand+"\ncolor--> "+color+"\nwheels--> "+wheels+"\nspeed--> "+speed);
        System.out.println("------------------\n");
    }
    public static void main(String[] args) {
        car car1 = new car();
        car1.showCarDetails("BMW", "white");
        car car2 = new car();
        car2.showCarDetails("Ferrari", "blue");
        if (car1.brand.equals(car2.brand) && car1.color.equals(car2.color)){
            System.out.println("Both cars are the same.");
        }else{
            System.out.println("The cars are different.");
        }
    }
}