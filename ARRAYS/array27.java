import java.util.Scanner;

public class array27 {
    // SUB array QUESTION
    // check if we can partition the array into sub array of equal sum 5 3 2 6 3 1
    // so in this 5+3+2=10 &&&& 6+3+1=10
    static int totalsum(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    static boolean subarray(int arr[]) {
        int pref = 0;
        int sum = totalsum(arr);
        for (int i = 1; i < arr.length; i++) {
            pref += arr[i];
            int sufsum = sum - pref;
            if (sufsum == pref)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = nm.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nm.nextInt();
        }
        System.out.println("if there is any subarray present in array     :" + subarray(arr));

    }
}
