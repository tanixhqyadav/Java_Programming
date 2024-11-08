import java.util.Scanner;

class arrat {
    static int [] rev(int arr[]) {
        int temp=0;
        int c = arr.length;
        int n[]=new int[c];

        for (int i = c-1; i >= 0; i--) {
            n[temp++]=arr[i];
        }
        return n;
        
    }
}

public class array17 {
    public static void main(String[] args) {
        Scanner jkl = new Scanner(System.in);
        arrat hj = new arrat();
        System.out.println("enter the size hof array");
        int n = jkl.nextInt();
        int arrt[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrt[i] = jkl.nextInt();
        }
        hj.rev(arrt);

    }
}
