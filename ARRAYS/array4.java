import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the size of array");
        int h = ab.nextInt();
        int arr[] = new int[h];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ab.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    c++;
            }
            System.out.println("frequency of  " + arr[i] + "is  " + c);
        }
    }
}
