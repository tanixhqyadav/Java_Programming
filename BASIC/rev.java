import java.util.Scanner;

class printarray {
    static void prarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class rev {
    public static void main(String[] args) {
        Scanner hjk = new Scanner(System.in);
        printarray jk = new printarray();
        System.out.println("enter the size of array:---");
        int h = hjk.nextInt();
        int n[] = new int[h];
        for (int i = 0; i < h; i++) {
            n[i] = hjk.nextInt();
        }
        jk.prarr(n);
    }
}
