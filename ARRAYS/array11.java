import java.util.Scanner;
//  TARGET SUM PROBLEMS FIND THE PAIR WHOSE SUM IS EQUAL TO TARGET SUM :::---------
public class array11 {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.println("enter the size of array");
        int h = nw.nextInt();
        int c = 0;
        int arr[] = new int[h];
        for (int i = 0; i < h; i++) {
            arr[i] = nw.nextInt();
        }
        System.out.println("enter the element");
        int j = nw.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int m = i+1; m < arr.length ; m++) {
                int b = arr[i] + arr[m];
                if (b == j)
                    c++;
            }
        }
        System.out.println("there are  " + c + "whose sum is  " + j);

    }
}
