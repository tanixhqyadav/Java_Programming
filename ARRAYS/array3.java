import java.util.Scanner;
//linear search
public class array3 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = hj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = hj.nextInt();
        }
        System.out.println("enter the element to search");
        int s = hj.nextInt();
        int m = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == s) {
                m = j;
                break;
            }
        }
        System.out.println("element found  at  " + m+ " search succesful");
    }
}
