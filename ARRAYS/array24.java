import java.util.Scanner;
public class array24 {
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        System.out.println(" enter size of array");
        int l=jk.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=jk.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
