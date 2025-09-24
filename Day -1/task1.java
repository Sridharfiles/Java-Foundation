public class task1{
    public static void main(String args[]){
        
        byte b1 = 10; // decimal 
        byte b2 = 0b1010; // binary 
        byte b3 = 012; // octal
        byte b4 = 0xA; // hexa

        short s = 32000;

        int i = 100000;
        int ihex = 0x1f4;
        int ibin = 0b1111101100;
        int ioct = 0764;

        long l = 10000000000L;
        long lhex = 0x2A3B4C;

        float f = 3.14f;

        double d = 1.79769313486231570d;

        char c = 'S';
        char c1 = 65;

        boolean f1 = true;
        boolean f2 = false;

        System.out.println("byte "+ b1 +","+b2+","+b3+","+b4);
        System.out.println("short " +s);
        System.out.println("int " +i+","+ihex+","+ibin+","+ioct);
        System.out.println("long " +l+","+lhex);
        System.out.println("float " +f);
        System.out.println("double " +d);
        System.out.println("char " +c+","+c1);
        System.out.println("boolean " +f1+","+f2);

        

    }
}