import java.util.Scanner;

public class prct1 {

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        int n = jk.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = jk.nextInt();
        int k = jk.nextInt();
        int arr1[] = new int[k];
        for (int i = 0; i < k; i++)
            arr1[i] = jk.nextInt();
        for(int i=0;i<k;i++){
            boolean h=false;
            for(int j=0;j<n;j++){
            if(arr1[i]==arr[j]){
                h=true;
                break;
            }
        }
        if(!h){
            System.out.println(arr1[i]);
        }
    }
    }
}
