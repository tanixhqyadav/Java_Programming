import java.util.Scanner;
// wrong checkig again
public class armstronprc3 {
    public static int armastrong(int n) {
        int c = 0;
        while (n > 0) {
            int j = n / 10;
            c++;
        }
        if (n >= 0 && n<=9) {
            return n;
        }
        int k = 0;
        int j = armastrong(n/10);
        k +=  Math.pow(j, c);
        if (k == n)
            return n;
        else
            return 0;
    }   

    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        System.out.println("enter the number:  ");
        int n = hj.nextInt();
        if (armastrong(n) == n)
            System.out.println("ARM *)");
        else
            System.out.println("NO |");
    }
}
