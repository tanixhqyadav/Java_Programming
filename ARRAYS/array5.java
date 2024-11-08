import java.util.Scanner;

public class array5 {
    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 


    public static void main(String[] args) {
        Scanner gh = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = gh.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = gh.nextInt();
        }
        System.out.println("originalarray");
        printarray(arr);
        int arr1[] = arr;
        System.out.println("copied array");
        printarray(arr1);
        arr1[0] = 123;
        arr1[3] = 99;
        // HERE U WILL FIND THAT ORIGINAL ARRAY WILL ALSO CHANGE ..>IT CAHNGES BECAUSE
        // REFRENCE IS COPIED UT NOT TEHE TUAL ARRRY IS CHANGED
        //
        System.out.println("original array");
        printarray(arr);
        System.out.println("copied array");
        printarray(arr1);
    }
}   


