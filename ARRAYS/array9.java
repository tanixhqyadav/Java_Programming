import java.util.Scanner;

class arrau {
    static boolean issort(int arr[]) {
        boolean c = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                c = false;
                break;
            }
        }
        return true;
    }
}

public class array9 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        arrau jk = new arrau();
        System.out.println("enter the size of array");
        int k = hj.nextInt();
        int arrn[] = new int[k];
        for (int i = 0; i < k; i++) {
            arrn[i] = hj.nextInt();
        }

        if (jk.issort(arrn) == true)
            System.out.println("array is  issorted");
        else
            System.out.println("Not Sorted");
    }
}
