public class first {
    public static void main(String[] args){
        String s1 = "Sridhar";
        String s2 = "K";
        String s4 = s1.concat(" ").concat(s2);
        System.out.println(""+s4);
        // System.out.println(s1 == s2);

        String s3 = new String("Sridhar");  

        // System.out.println(s2 == s3); // false

        System.out.println(s1.equals(s3));
        
        // s1 += "Kumaresan"; 
        // System.out.println(""+s1);



    }
}
