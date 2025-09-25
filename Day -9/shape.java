abstract class Shapebase {
    Shapebase() {
        System.out.println("Shape created.");
    }
    abstract void draw();
}
class Rectangle extends Shapebase{
    Rectangle () {
        System.out.println("rectangle object created.");
    }
    @Override
    void draw() {
        System.out.println("rectangle drawing.");
    }
}
class circle extends Shapebase {
    public circle() {
        System.out.println("circle object created .");
    }
    @Override
    void draw() {
        System.out.println("circle drawing.");
    }
}
public class shape {
    public static void main(String[] args) {
        circle r = new circle();
        r.draw();   
    }
}