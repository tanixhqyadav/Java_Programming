import java.util.Scanner;

import javax.security.sasl.SaslException;

public class array19 {
    // frequency array GOOD CONCEPT :
    static int[] makefrequencyarray(int[] arr) {
        int[] freq = new int[1000005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        System.out.println("ente r the size of array");
        int n = kl.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kl.nextInt();
        }
        int[] frq = makefrequencyarray(arr);
        System.out.println("enter the number of elements:  ");
        int q = kl.nextInt();
        while (q > 0) {
            System.out.println("enter the elememts to be searched  : ");
            int x = kl.nextInt();
            if (frq[x] > 0)
                System.out.println("YES ");
            else
                System.out.println("NO");
            q--;
        }
    }
}