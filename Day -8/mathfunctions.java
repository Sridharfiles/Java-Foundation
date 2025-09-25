

public class mathfunctions {
    public static void main(String[] args) {
        double n = 50.5;

        System.out.println("Square root : "+Math.sqrt(n));
        System.out.println("Cube : "+Math.pow(n,3));
        System.out.println("ceil : "+Math.ceil(n));
        System.out.println("Floor : "+Math.floor(n));
       // System.out.println("Random : "+n = (int)(Math.random()?*?100 + 1));
        

       int max = 100;
       int min = 50;
       int rand = (int)(Math.random() * (max - min + 1) + min);
       System.out.println("Random number (50 to 100) : "+rand);

    }
}
/*
 * Math.sqrt
 * Math.pow
 * Math.max
 * Math.min
 * Math.abs
 * Math.random
 * 
 */