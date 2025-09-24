import java.util.Arrays;
public class onedarr{
    public static void main(String[] args){
        int[] num = {2,4,6,8,10,1,3,5,7,9};
        int[] copynum = new int[5];
        for (int i = 0;i < num.length;i++){
            System.out.println(""+num[i]);
        }
        System.out.println("-- Copy numbers --");
        System.arraycopy(num, 0, copynum, 0, 5);
        System.out.println(""+copynum[0] +" "+copynum[1]+" "+copynum[2]+" "+copynum[3]+" "+copynum[4]);
        System.out.println("-- sort array --");
        Arrays.sort(num);
        System.out.println("Sorted array "+Arrays.toString(num));
        System.out.println("-- linear searching --");
        int key = 10;
        boolean found = false;
        for (int n : num){
            if (n == key){
                found = true;
                System.out.println("Found : "+key);
            }
        }
        int[] arr = {10,20,30,40,50};
        System.out.println("-- binary search -- ");
        int index = Arrays.binarySearch(arr, 35);
        System.out.println("Index "+index);
        System.out.println("-- Reversing array --");
        for (int i = 0,j = arr.length - 1;i < j;i++,j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        System.out.println(""+Arrays.toString(arr));
        
        System.out.println("Removing an array ");
        int removein = 3;
        for (int i = removein ; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];

        }
        System.out.println(""+Arrays.toString(Arrays.copyOf(arr, arr.length - 1)));




    }
}