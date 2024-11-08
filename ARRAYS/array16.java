import java.util.Scanner;

class arr {
    static int[] add(int arr1[], int arr2[]) {
        int ne[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            ne[i] = arr1[i] + arr2[i];
        }
        return ne;
    }

    static void prarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class array16 {
    public static void main(String[] args) {
        Scanner hjk = new Scanner(System.in);
        arr jk = new arr();
        System.out.println("Enter the size of 1st array");
        int h = hjk.nextInt();
        int p[] = new int[h];
        for (int i = 0; i < h; i++) {
            p[i] = hjk.nextInt();
        }
        System.out.println();
        System.out.println("Enter the size of 2nd array");
        int l = hjk.nextInt();
        int y[] = new int[l];
        for (int i = 0; i < l; i++) {
            y[i] = hjk.nextInt();
        }
        int result[] = jk.add(p, y);
        System.out.println("Resultant array:");
        jk.prarr(result);
    }
}
