public class book{
    String title;
    String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    void display(){
        System.out.println("Title -->"+title+"\nAuthor -->"+author);
        System.out.println("---------------\n");
        
    }
    public static void main(String[] args) {
        book b1 = new book("Data structures and Algorithms", "weiss");
        book b2 = new book("Introducing to Algorithms", "Thomes H. cormen");
        b1.display();
        b2.display();

    }
}
