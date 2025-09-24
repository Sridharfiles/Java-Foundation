public class cube{
    double area; 

    public cube(double Square) {
        this.area = Square;
    }
    
    void asquare(cube a){
        this.area *= this.area;  
    }
    void compare(cube b){
        if (this.area > b.area){
            System.out.println(this.area+" is more area than "+b.area);
        }else if (this.area < b.area){
            System.out.println(this.area+" is less area than "+b.area);
        }else {
            System.out.println(this.area +" and "+b.area+" both are the same area.");
        }
    }
    void display(){
        System.out.println("cube "+ area);
    }
    
    public static void main(String[] args) {
        cube a1 = new cube(5);
        cube a2 = new cube(6);
        cube a3 = new cube(7);
        cube a4 = new cube(4); 

        a1.asquare(a1);
        a2.asquare(a2);
        a3.asquare(a3);
        a4.asquare(a4);

        a1.display();
        a2.display();
        a3.display();
        a4.display();


        a1.compare(a2);
        a2.compare(a4);

    }
}