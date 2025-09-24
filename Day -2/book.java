public class book{
    String title;
    String author;
    static String libraryName = "Central library";
    void showBook(String t, String a){
        title = t;
        author = a;
        int pages = 100;
        System.out.println("Title -->"+title+"\nAuthor -->"+author+"\nPages-->"+pages+"\nLibrary -->"+libraryName);
        System.out.println("---------------\n");
    }
    public static void main(String[] args) {
        book b1 = new book();
        b1.showBook("Data structures and Algorithms", "weiss");
        book b2 = new book();
        b2.showBook("Introducing to Algorithms", "Thomes H. cormen");
    }
}