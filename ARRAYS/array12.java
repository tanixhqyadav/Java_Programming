import java.util.Scanner;
// FIND THE NUMBER O TRIPLETS WHOSE SUM IS EQUAL TO THE TARGET NUMBER::---
class arra {
    static int triplet(int arr[], int x) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int h = j + 1; h < arr.length; h++) {
                    if (arr[i] + arr[j] + arr[h] == x) {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}

public class array12 {
    public static void main(String[] args) {
        Scanner gh = new Scanner(System.in);
        arra k = new arra();
        System.out.println("enter ethe size of array");
        int n = gh.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = gh.nextInt();
        }
        System.out.println("enter the element : ");
        int hd = gh.nextInt();
        int f = k.triplet(arr, hd);
        System.out.println("no of triplets inside this array are  " + f);
    }
}
