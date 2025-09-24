
import java.util.Scanner;

public class twodsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();


        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();


        int [][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the rows ["+i+"]Enter the columns ["+j+"] :");
                arr1[i][j] = sc.nextInt();
            }
            
        }

        int [][] arr2 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the rows ["+i+"]Enter the columns ["+j+"] :");
                arr2[i][j] = sc.nextInt();
            }
            
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                System.out.print(""+arr1[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                System.out.print(""+arr2[i][j]+" ");
            }
            System.out.println("");
        }

        
        sc.close();
    }
}
