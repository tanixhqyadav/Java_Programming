import java.util.Scanner;

class squares {
    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] squarearray(int arr[]) {
        int n[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int h=Math.abs(arr[i]);
            n[i] = arr[i] * arr[i];
        }
        return n;
    }
}

public class array23 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        squares s = new squares();
        System.out.println("enter the size of array");
        int k = j.nextInt();
        int array[] = new int[k];
        for (int i = 0; i < k; i++)
            array[i] = j.nextInt();
        System.out.print("squared array is :===" + "\n");
        int h[] = s.squarearray(array);
        s.printarray(h);
    }
}
