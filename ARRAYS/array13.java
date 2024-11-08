import java.util.Scanner;

// UNIQUE ELEMENT CODE ::-----
class frq {
    static int kelly(int arr[]) {
        int m = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    if (c == 1) {
                        m = i;
                    }
                }
            }
        }
        int hj = arr[m];
        return hj;
    }

    static int lklk(int arr[]) {
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    if (c > 1) {
                        m = i;
                    }
                }
            }
        }
        int hjk = arr[m];
        return hjk;
    }

}

public class array13 {
    public static void main(String[] args) {
        Scanner gh = new Scanner(System.in);
        frq jk = new frq();
        System.out.println("enter the size =of array");
        int n = gh.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = gh.nextInt();
        }
        System.out.println("repeted element is " + jk.kelly(h));
    }
}
