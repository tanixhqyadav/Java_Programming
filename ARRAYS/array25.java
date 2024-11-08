import java.util.Scanner;

public class array25 {
    // PREFIX SUM APPROACH::------ given an integr array a return the sum/running
    // array in the same array without creating a new array
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int [] prefix(int arr[]){
        int n=arr.length;
        int [] pref =new  int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("enter the size of array  ");
        int n = k.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < i; j++) {
        //         arr[i] = arr[i] + arr[j];
        //     }
        // }
        printarray(arr);
        int kl[]=prefix(arr);
        System.out.println("array after using method");
        printarray(kl); 
    }
}
