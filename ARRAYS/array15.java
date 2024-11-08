import java.util.Scanner;

class arrau {
    // static void reverse(int arr[]) {
    // int n[] = new int[arr.length];
    // for (int i = arr.length-1; i >= 0; i--) {
    // System.out.print(arr[i]+" ");
    // }
    // }
    static void prarray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // doing it using two pointers approach
    static void twopointersSwap(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}

public class array15 {
    public static void main(String[] args) {
        Scanner ty = new Scanner(System.in);

        arrau jk = new arrau();
        System.out.println("enter the size of array:---");
        int n = ty.nextInt();
        int hj[] = new int[n];
        for (int i = 0; i < n; i++) {
            hj[i] = ty.nextInt();
        }
        jk.twopointersSwap(hj);
        jk.prarray(hj);

    }
}
