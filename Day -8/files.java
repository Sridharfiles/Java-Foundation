import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                            1. CREATE A FILE 
                            2. WRITE IN A FILE 
                            3. APPEND IN A FILE 
                            4. READ A FILE 
                            5. DELETE A FILESelect one number (e.g 1 or 2) """ //
        );
        int n = sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 1:
                try {
                    System.out.println("Enter a file name : ");
                    String filename = sc.nextLine(); 
                    File file = new File(filename+".txt");
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    System.out.println("Enter a file name : ");
                    String filename = sc.nextLine(); 
                    FileWriter writer = new FileWriter(filename+".txt");
                    System.out.println("Write a content! ");
                    String content = sc.nextLine();
                    writer.write(content);
                    writer.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    System.out.println("Enter a file name : ");
                    String filename = sc.nextLine(); 
                    FileWriter writer = new FileWriter(filename+".txt", true); 
                    System.out.println("Write a append content! ");
                    String content = sc.nextLine();
                    writer.write("\n"+content);
                    writer.close();
                    System.out.println("Appended successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    System.out.println("Enter a file name : ");
                    String filename = sc.nextLine(); 
                    File file = new File(filename+".txt");
                    Scanner s1 = new Scanner(file);
                    while (s1.hasNextLine()) {
                        String line = s1.nextLine();
                        System.out.println(line);
                    }
                    s1.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File not found.");
                    e.printStackTrace();
                }
                break;
            case 5:
                System.out.println("Enter a file name : ");
                String filename = sc.nextLine(); 
                File file = new File(filename+".txt");
                if (file.delete()) {
                    System.out.println("Deleted: " + file.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }
            sc.close();
            break;
            default:
                throw new AssertionError();
        }
    }
}
