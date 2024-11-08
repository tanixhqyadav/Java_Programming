import java.util.*;

public class deletion {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = jk.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++)
        a[i]=jk.nextInt();
        int ans[] = new int[n - 1];
        System.out.println("enter the position of the element you want to delete");
        int p = jk.nextInt();
        for (int i = 0; i < p; i++) {
            ans[i] = a[i];
        }
        ans[p - 1] = 0;
        for (int j = p; j < a.length; j++) {
            ans[j - 1] = a[j];
        }
        for (int k : ans)
            System.out.print(k + " ");
    }
}
