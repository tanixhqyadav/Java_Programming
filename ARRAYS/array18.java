import java.util.Scanner;

class arrat {
    static int linearsea(int arr[], int x) {
        int v = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                v = x;
                break;
            }
        }
        return v;
    }
}

public class array18 {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        arrat m = new arrat();
        System.out.println("enter the size of array :");
        int n = jk.nextInt();
        int arra[] = new int[n];
        for (int i = 0; i < n; i++) {
            arra[i] = jk.nextInt();
        }
        System.out.println("enter the number of elemnets you want to check :--");
        int b = jk.nextInt();
        for (int i = 0; i < b; i++) {
            int l = jk.nextInt();
            if (l == m.linearsea(arra, l))
                System.out.println("Yes");
            else
                System.out.println("NO");
        }
    }
}
