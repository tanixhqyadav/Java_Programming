import java.util.Scanner;

class arra2 {
    static int frequent(int arr[], int x) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                c++;
        }
        return c;
    }
}

public class array7 {
    public static void main(String[] args) {
        Scanner ghj = new Scanner(System.in);
        arra2 kl = new arra2();
        System.out.println("Enter the size of array::==");
        int n = ghj.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = ghj.nextInt();
        }
        System.out.println("enter the element u want to count");
        int k = ghj.nextInt();
        int s = kl.frequent(d, k);
        System.out.println(s);
    }

}
