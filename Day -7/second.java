public class second {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.err.println("Length : "+str.length());
        System.out.println("Uppercase : "+str.toUpperCase());
        System.out.println("Lowercase : "+str.toLowerCase());
        System.out.println("Character at index 5 : "+str.charAt(5));
        System.out.println("Substring(5 to 16) : "+str.substring(5,16));
        System.out.println("Cointains 'ming' : "+str.contains("ming"));
        System.out.println("Starts with 'java' :"+str.startsWith("Java"));
        System.out.println("Ends with ''ing : "+str.endsWith("ing"));
        System.out.println("Replace with 'Java' to 'C++' : "+str.replace("Java", "C++"));
    }
}
