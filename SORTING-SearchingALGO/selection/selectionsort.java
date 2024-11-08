
import java.util.Scanner;

public class selectionsort {
    
    public static void selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
                
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter size");
        int n = hj.nextInt();
        int arrt[] = new int[n];
        for (int i = 0; i < n; i++)
            arrt[i] = hj.nextInt();
        selection(arrt);
        System.out.println("sorted array : ");
        print(arrt);
    }
}
