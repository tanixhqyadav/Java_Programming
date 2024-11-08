import java.util.Scanner;

public class insertion {
    
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = jk.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = jk.nextInt();
        System.out.println("enter no of element ");
        int h = jk.nextInt();
        int k = n + h;
        int ans[] = new int[k];
        System.out.println("enter where and what you want to insert");
        int p = jk.nextInt();
        int e = jk.nextInt();
        for (int i = 0; i < p; i++) {
            ans[i] = a[i];
        }
        ans[p] = e;
        for (int i = p+1 ; i <k; i++) {
            ans[i] = a[i - 1];
        }
        for (int l : ans)
            System.out.print(l + " ");

    }
}
