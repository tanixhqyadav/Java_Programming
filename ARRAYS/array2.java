import java.util.Scanner;
//taking array input::---
public class array2 {
    public static void main(String[] args) {
        Scanner hn = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int s = hn.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = hn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
