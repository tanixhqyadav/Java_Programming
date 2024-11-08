import java.util.Scanner;

class jk {
    public int hj(int n) {
        if (n == 1) {
            return 1;
        }
        int h = 0;
        int l = hj(n - 1);
        h += n + l;
        return h;
    }

}

public class prc2 {
    public static void main(String[] args) {
        Scanner hj = new Scanner(System.in);
        jk l = new jk();
        System.out.println("enter two number:  ");
        int n = hj.nextInt();
        int m = hj.nextInt();
        int k = n * m;
        System.out.println(l.hj(k));

    }
}
