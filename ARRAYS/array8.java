import java.util.Scanner;

//question 
class last {
    // static int lastoccur(int arr[], int x) {
    // int c = 0;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // if (arr[i] == x) {
    // c = i;
    // break;
    // }
    // }
    // return c;
    // }
    static int lastoccur(int arr[], int x) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                c++;
            }
        }
        return c;
    }
}

public class array8 {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        last h = new last();
        System.out.println("enetr the size of array:");
        int n = jk.nextInt();
        int arrj[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrj[i] = jk.nextInt();
        }
        System.out.println("enter the number you want to find:---");
        int k = jk.nextInt();
        int s = h.lastoccur(arrj, k);
        System.out.println("occurnece  " + s);

    }
}
