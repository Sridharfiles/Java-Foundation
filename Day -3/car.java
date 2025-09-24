public class car{
    String brand;
    String model;
    float price;

    public car(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("Brand -->"+brand+"\nModel -->"+model+"\nPrice -->"+price);
        System.out.println("-----------------");
    }
    void compare(car c){
        
        if(this.price > c.price){
            System.out.println(this.brand + " "+this.model+" is more expensive than "+c.brand+" "+c.model);
        }else if (this.price < c.price) {
            System.out.println(this.brand+" "+this.model+" is cheaper than "+c.brand+" "+c.model);
        }else{
            System.out.println(this.brand+" "+this.model+" and "+this.brand+" "+this.model+" both are the same price.");
        }
    }


    public static void main(String[] args) {
        car c1 = new car("Kia","Seltos",1679000);
        car c2 = new car("Volkswagen","Virtus",1700000);
        car c3 = new car("Jeep","Compass",2300000);
        car c4 = new car("Tata Motors","Nexon",1139000);
        car c5 = new car("Skoda","Slavia",1679000);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        
        // price comparison
        System.out.println("--- Price comparison ---");
        c1.compare(c2);
        c2.compare(c3);
        c3.compare(c4);
        c4.compare(c5);
        c5.compare(c1);
        c4.compare(c3);
        

    }
}