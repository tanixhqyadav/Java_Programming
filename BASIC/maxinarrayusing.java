import java.util.Scanner;

class max {
    static int maxaaray(int arr[]) {
        int d = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            d = Math.max(arr[i], d);

        return d;
    }
}

public class maxinarrayusing {
    public static void main(String[] args) {
        Scanner ty = new Scanner(System.in);
        max k = new max();
        System.out.println("enter the size of aray");
        int n = ty.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ty.nextInt();
        }
        System.out.println("maximumm ele i array is  " + k.maxaaray(arr));
    }
}
