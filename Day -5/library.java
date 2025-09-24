import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class library {
    String title;
    String author;
    int price;
    public library(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display (){
        System.out.println("Title --->"+title);
        System.out.println("Author --->"+author);
        System.out.println("Price --->"+price);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        List <library> books = new ArrayList<>(); 
        String t;
        String a;
        int p;
        System.out.println("how many books you want to enter :");
        int b = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i < b;i++){
            System.out.println("----Book "+(i + 1)+"----");
            System.out.println("Enter Title :");
            t = sc.nextLine();
            System.out.println("Enter Author :");
            a = sc.nextLine();
            System.out.println("Enter Price :");
            p = sc.nextInt();
            sc.nextLine();
            books.add(new library (t,a,p));
        }
        System.out.println("\n----Book list----");
        for (library book : books){
            book.display();
        }
    }
}